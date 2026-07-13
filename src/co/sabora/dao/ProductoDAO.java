/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.sabora.dao;

import co.sabora.conexion.ConexionBD;
import co.sabora.modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProductoDAO {

    // Objeto para realizar la conexión con la base de datos
    ConexionBD conexionBD = new ConexionBD();

    // Variables JDBC
    Connection conexion;
    PreparedStatement ps;
    ResultSet rs;

    // Método para insertar un producto
    public boolean insertarProducto(Producto producto) {

        String sql = "INSERT INTO producto(nombre, descripcion, categoria, precio, stock) VALUES (?, ?, ?, ?, ?)";

        try {

            // Abrir conexión
            conexion = conexionBD.conectar();

            // Preparar la consulta
            ps = conexion.prepareStatement(sql);

            // Asignar valores
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getDescripcion());
            ps.setString(3, producto.getCategoria());
            ps.setDouble(4, producto.getPrecio());
            ps.setInt(5, producto.getStock());

            // Ejecutar la consulta
            ps.executeUpdate();

            return true;

        } catch (SQLException e) {

             e.printStackTrace();

            JOptionPane.showMessageDialog(null,
            "Error SQL:\n" + e.getMessage());


            return false;

        }

    }
// ===========================
    // LISTAR PRODUCTOS
    // ===========================
    public ArrayList<Producto> listarProductos() {

        ArrayList<Producto> listaProductos = new ArrayList<>();

        String sql = "SELECT * FROM producto";

        try {

            conexion = conexionBD.conectar();

            ps = conexion.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {

                Producto producto = new Producto();

                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setCategoria(rs.getString("categoria"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setStock(rs.getInt("stock"));

                listaProductos.add(producto);
            }

        } catch (SQLException e) {

            System.out.println("Error al consultar productos: " + e.getMessage());
        }

        return listaProductos;
    }

    // ===========================
    // ACTUALIZAR PRODUCTO
    // ===========================
    public boolean actualizarProducto(Producto producto) {

        String sql = "UPDATE producto SET nombre=?, descripcion=?, categoria=?, precio=?, stock=? WHERE idProducto=?";

        try {

            conexion = conexionBD.conectar();

            ps = conexion.prepareStatement(sql);

            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getDescripcion());
            ps.setString(3, producto.getCategoria());
            ps.setDouble(4, producto.getPrecio());
            ps.setInt(5, producto.getStock());
            ps.setInt(6, producto.getIdProducto());

            ps.executeUpdate();

            return true;

        } catch (SQLException e) {

            System.out.println("Error al actualizar producto: " + e.getMessage());

            return false;
        }
    }

    // ===========================
    // ELIMINAR PRODUCTO
    // ===========================
    public boolean eliminarProducto(int idProducto) {

        String sql = "DELETE FROM producto WHERE idProducto=?";

        try {

            conexion = conexionBD.conectar();

            ps = conexion.prepareStatement(sql);

            ps.setInt(1, idProducto);

            ps.executeUpdate();

            return true;

        } catch (SQLException e) {

            System.out.println("Error al eliminar producto: " + e.getMessage());

            return false;
        }
    }
// =========================
// BUSCAR PRODUCTOS
// =========================
public ArrayList<Producto> buscarProductos(String buscar) {

    ArrayList<Producto> listaProductos = new ArrayList<>();

    String sql = "SELECT * FROM producto WHERE nombre LIKE ? OR categoria LIKE ?";

    try {

        conexion = conexionBD.conectar();

        ps = conexion.prepareStatement(sql);

        ps.setString(1, "%" + buscar + "%");
        ps.setString(2, "%" + buscar + "%");

        rs = ps.executeQuery();

        while (rs.next()) {

            Producto producto = new Producto();

            producto.setIdProducto(rs.getInt("idProducto"));
            producto.setNombre(rs.getString("nombre"));
            producto.setDescripcion(rs.getString("descripcion"));
            producto.setCategoria(rs.getString("categoria"));
            producto.setPrecio(rs.getDouble("precio"));
            producto.setStock(rs.getInt("stock"));

            listaProductos.add(producto);
        }

    } catch (SQLException e) {

        System.out.println("Error al buscar productos: " + e.getMessage());

    }

    return listaProductos;
}

// esto evita productos duplicados 
public boolean existeProducto(String nombre,String descripcion,String categoria) {

    String sql = "SELECT COUNT(*) FROM producto WHERE nombre = ? AND descripcion = ? AND categoria = ?";

    try {

        conexion = conexionBD.conectar();

        ps = conexion.prepareStatement(sql);

        ps.setString(1, nombre);
        ps.setString(2, descripcion);
        ps.setString(3, categoria);
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Categoria: " + categoria);
        
        rs = ps.executeQuery();

        if (rs.next()) {
           
            int cantidad = rs.getInt(1);

        System.out.println("Cantidad encontrada: " + cantidad);

        return cantidad> 0;
}

    } catch (SQLException e) {

        System.out.println("Error al verificar producto: " + e.getMessage());

    }

    return false;
}
// =======================================
// VALIDAR PRODUCTO DUPLICADO AL EDITAR
// =======================================

public boolean existeProductoEditar(int idProducto,
                                    String nombre,
                                    String descripcion,
                                    String categoria) {

    String sql = "SELECT COUNT(*) FROM producto "
               + "WHERE nombre = ? "
               + "AND descripcion = ? "
               + "AND categoria = ? "
               + "AND idProducto <> ?";

    try {

        conexion = conexionBD.conectar();

        ps = conexion.prepareStatement(sql);

        ps.setString(1, nombre);
        ps.setString(2, descripcion);
        ps.setString(3, categoria);
        ps.setInt(4, idProducto);

        rs = ps.executeQuery();

        if (rs.next()) {

            int cantidad = rs.getInt(1);

            return cantidad > 0;

        }

    } catch (SQLException e) {

        System.out.println("Error al verificar producto al editar: "
                + e.getMessage());

    }

    return false;
}

}