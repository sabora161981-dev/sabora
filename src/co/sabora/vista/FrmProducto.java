/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.sabora.vista;


import co.sabora.dao.ProductoDAO;
import co.sabora.modelo.Producto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author MAURICIO GIRALDO
 */
    public class FrmProducto extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    private final ProductoDAO productoDAO = new ProductoDAO();
    private final DefaultTableModel modelo = new DefaultTableModel();
    

    /**
     * Creates new form FrmProducto
     */
    public FrmProducto() {
        initComponents();
        
        // Impide que la ventana se cierre directamente con la X asi le da tiempo al usuario en caso de que necesite hacer algo 
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        
        configurarTabla();
        listarProductos();
        
       setLocationRelativeTo(null);
       setResizable(false);
       pack();
       
       addWindowListener(new java.awt.event.WindowAdapter() {
    @Override
    public void windowClosing(java.awt.event.WindowEvent e) {

        int opcion = JOptionPane.showConfirmDialog(
                FrmProducto.this,
                "¿Desea cerrar el formulario?",
                "Confirmar salida",
                JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            dispose();
        }

    }
});
    }
   private void configurarTabla(){
    modelo.addColumn("Código");
    modelo.addColumn("Nombre");
    modelo.addColumn("Descripción");
    modelo.addColumn("Categoría");
    modelo.addColumn("Precio");
    modelo.addColumn("Stock");

    tblProductos.setModel(modelo); 
    
    }
   // ← AQUÍ INSERTA ESTE MÉTODO
   
    private void Nuevo() {

    txtCodigo.setText("");
    txtNombre.setText("");
    txtDescripcion.setText("");
    txtCategoria.setText("");
    txtPrecio.setText("");
    txtStock.setText("");

    tblProductos.clearSelection();

    txtCodigo.requestFocus();
}

// Después continúa el código generado por NetBeans

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlPrincipal = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblStock = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        lblBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        scrollProductos = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlPrincipal.setBackground(new java.awt.Color(245, 245, 245));

        lblTitulo.setBackground(new java.awt.Color(245, 245, 245));
        lblTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 102, 51));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("GESTIÓN DE PRODUCTOS");

        lblCodigo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCodigo.setText("Codigo");

        lblNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNombre.setText("Nombre");

        lblDescripcion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDescripcion.setText("Descripcion");

        lblCategoria.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCategoria.setText("Categoria");

        lblPrecio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPrecio.setText("Precio");

        lblStock.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblStock.setText("Stock");

        txtCodigo.setEditable(false);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        txtNombre.setColumns(20);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });

        txtCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriaActionPerformed(evt);
            }
        });
        txtCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCategoriaKeyTyped(evt);
            }
        });

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        txtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockActionPerformed(evt);
            }
        });
        txtStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStockKeyTyped(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        lblBuscar.setText("Buscar :");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setToolTipText("");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        scrollProductos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        tblProductos.setAutoCreateRowSorter(true);
        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Descripcion", "Categoria ", "Precio", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblProductos.setRowHeight(25);
        tblProductos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblProductos.setShowGrid(true);
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
        });
        scrollProductos.setViewportView(tblProductos);
        tblProductos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210))
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                    .addGap(34, 34, 34)
                                    .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblStock, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar))
                            .addComponent(lblBuscar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(scrollProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                        .addGap(138, 138, 138))))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStock, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(scrollProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addGap(18, 18, 18)
                .addComponent(lblBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoriaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
     int respuesta = JOptionPane.showConfirmDialog(
            this,
            "¿Desea limpiar los datos del formulario?",
            "Confirmar",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);

    if (respuesta == JOptionPane.YES_OPTION) {

        Nuevo();

        JOptionPane.showMessageDialog(
                this,
                "Formulario limpiado correctamente.",
                "Información",
                JOptionPane.INFORMATION_MESSAGE);

    }
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
     Nuevo ();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // Validar campos obligatorios
    if (txtNombre.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this,
                "Debe ingresar el nombre del producto.");
        txtNombre.requestFocus();
        return;
    }

    if (txtDescripcion.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this,
                "Debe ingresar la descripción del producto.");
        txtDescripcion.requestFocus();
        return;
    }

    if (txtCategoria.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this,
                "Debe ingresar la categoría.");
        txtCategoria.requestFocus();
        return;
    }

    if (txtPrecio.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this,
                "Debe ingresar el precio.");
        txtPrecio.requestFocus();
        return;
    }
    if (Double.parseDouble(txtPrecio.getText()) <= 500) {
        
    JOptionPane.showMessageDialog(this,
            "El precio debe ser mayor que cero.",
            "Precio inválido",
            JOptionPane.WARNING_MESSAGE);

    txtPrecio.requestFocus();
    txtPrecio.selectAll();
    return;
}

    if (txtStock.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this,
                "Debe ingresar el stock.");
        txtStock.requestFocus();
        return;
    }
    if (productoDAO.existeProducto(
        txtNombre.getText().trim(),
        txtDescripcion.getText().trim(),    
        txtCategoria.getText().trim())) {

    JOptionPane.showMessageDialog(this,
            "Este producto ya se encuentra registrado.",
            "Producto duplicado",
            JOptionPane.WARNING_MESSAGE);

    txtNombre.requestFocus();
    return;
}
        
        
        Producto producto = new Producto();

    producto.setNombre(txtNombre.getText());
    producto.setDescripcion(txtDescripcion.getText());
    producto.setCategoria(txtCategoria.getText());
    producto.setPrecio(Double.parseDouble(txtPrecio.getText()));
    producto.setStock(Integer.parseInt(txtStock.getText()));

    if (productoDAO.insertarProducto(producto)) {

        JOptionPane.showMessageDialog(this,
                "Producto guardado correctamente.");
        
        listarProductos();
        Nuevo();

    } else {

        JOptionPane.showMessageDialog(this,
                "No fue posible guardar el producto.");

    }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
     // Validar que la descripción no esté vacía
    if (txtDescripcion.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this,
                "Debe ingresar la descripción del producto.",
                "Campo obligatorio",
                JOptionPane.WARNING_MESSAGE);

        txtDescripcion.requestFocus();
        return;
    }
    
    if (txtDescripcion.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this,
                "Debe ingresar la descripción del producto.",
                "Campo obligatorio",
                JOptionPane.WARNING_MESSAGE);
        txtDescripcion.requestFocus();
        return;
    }

    if (txtCategoria.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this,
                "Debe ingresar la categoría.",
                "Campo obligatorio",
                JOptionPane.WARNING_MESSAGE);
        txtCategoria.requestFocus();
        return;
    }

    if (txtPrecio.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this,
                "Debe ingresar el precio.",
                "Campo obligatorio",
                JOptionPane.WARNING_MESSAGE);
        txtPrecio.requestFocus();
        return;
    }

    if (Double.parseDouble(txtPrecio.getText()) <= 0) {
        JOptionPane.showMessageDialog(this,
                "El precio debe ser mayor que cero.",
                "Precio inválido",
                JOptionPane.WARNING_MESSAGE);

        txtPrecio.requestFocus();
        txtPrecio.selectAll();
        return;
    }

    if (txtStock.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this,
                "Debe ingresar el stock.",
                "Campo obligatorio",
                JOptionPane.WARNING_MESSAGE);
        txtStock.requestFocus();
        return;
    }

    // ==================================
    // Validar producto duplicado al editar
    // ==================================

    if (productoDAO.existeProductoEditar(
            Integer.parseInt(txtCodigo.getText()),
            txtNombre.getText().trim(),
            txtDescripcion.getText().trim(),
            txtCategoria.getText().trim())) {

        JOptionPane.showMessageDialog(this,
                "Este producto ya se encuentra registrado.",
                "Producto duplicado",
                JOptionPane.WARNING_MESSAGE);

        txtNombre.requestFocus();
        return;
    }    
        
        Producto producto = new Producto();

    producto.setIdProducto(Integer.parseInt(txtCodigo.getText()));
    producto.setNombre(txtNombre.getText());
    producto.setDescripcion(txtDescripcion.getText());
    producto.setCategoria(txtCategoria.getText());
    producto.setPrecio(Double.parseDouble(txtPrecio.getText()));
    producto.setStock(Integer.parseInt(txtStock.getText()));

    if (productoDAO.actualizarProducto(producto)) {

        JOptionPane.showMessageDialog(this,
                "Producto actualizado correctamente.");

        listarProductos();
        Nuevo();

    } else {

        JOptionPane.showMessageDialog(this,
                "No fue posible actualizar el producto.");
       }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked
        int fila = tblProductos.getSelectedRow();

    if (fila >= 0) {

        txtCodigo.setText(tblProductos.getValueAt(fila, 0).toString());
        txtNombre.setText(tblProductos.getValueAt(fila, 1).toString());
        txtDescripcion.setText(tblProductos.getValueAt(fila, 2).toString());
        txtCategoria.setText(tblProductos.getValueAt(fila, 3).toString());
        txtPrecio.setText(tblProductos.getValueAt(fila, 4).toString());
        txtStock.setText(tblProductos.getValueAt(fila, 5).toString());

    }

    }//GEN-LAST:event_tblProductosMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       if (txtCodigo.getText().isEmpty()) {

    JOptionPane.showMessageDialog(this,
            "Seleccione un producto de la tabla.");

    return;
}

int opcion = JOptionPane.showConfirmDialog(
        this,
        "¿Desea eliminar este producto?",
        "Confirmar",
        JOptionPane.YES_NO_OPTION);

if (opcion == JOptionPane.YES_OPTION) {

    int idProducto = Integer.parseInt(txtCodigo.getText());

    if (productoDAO.eliminarProducto(idProducto)) {

        JOptionPane.showMessageDialog(this,
                "Producto eliminado correctamente.");

        listarProductos();
        Nuevo();

    } else {

        JOptionPane.showMessageDialog(this,
                "No fue posible eliminar el producto.");
    }
}
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarProductos();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        // esta opcion evita que se ingresen caracteres diferentes a numeros
        char c = evt.getKeyChar();

    if (!Character.isDigit(c)
            && c != '.'
            && c != java.awt.event.KeyEvent.VK_BACK_SPACE) {

        evt.consume();
    }

    if (c == '.' && txtPrecio.getText().contains(".")) {
        evt.consume();
    }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockKeyTyped
        // esta opcion evita que se ingresen caracteres diferentes a numeros
         char c = evt.getKeyChar();

    if (!Character.isDigit(c)
            && c != java.awt.event.KeyEvent.VK_BACK_SPACE) {

        evt.consume();
    }
    }//GEN-LAST:event_txtStockKeyTyped

    private void txtCategoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCategoriaKeyTyped
       // Permite letras, espacios y retroceso
        char c = evt.getKeyChar(); 
         // Permite únicamente letras, espacios y retroceso
    if (!(Character.isLetter(c)
            || Character.isWhitespace(c)
            || c == java.awt.event.KeyEvent.VK_BACK_SPACE)) {

        evt.consume();
    }
    }//GEN-LAST:event_txtCategoriaKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
       char c = evt.getKeyChar();

    // Permite letras, números, espacios y retroceso
     if (!Character.isLetter(c)
            && c != ' '
            && c != java.awt.event.KeyEvent.VK_BACK_SPACE) {

        evt.consume();

        JOptionPane.showMessageDialog(
                this,
                "Solo se permiten letras.",
                "Validación",
                JOptionPane.WARNING_MESSAGE
        );
        
    }

    // Máximo 50 caracteres
    if (txtNombre.getText().length() >= 50) {
        evt.consume();
       } 
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        char c = evt.getKeyChar();

    // Permite letras, números, espacios, punto, coma y guion
    if (!(Character.isLetterOrDigit(c)
            || Character.isWhitespace(c)
            || c == '.'
            || c == ','
            || c == '-'
            || c == java.awt.event.KeyEvent.VK_BACK_SPACE)) {

        evt.consume();
    }

    // Máximo 100 caracteres
    if (txtDescripcion.getText().length() >= 100) {
        evt.consume();
       }
    }//GEN-LAST:event_txtDescripcionKeyTyped

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
    buscarProductos();
    }//GEN-LAST:event_txtBuscarKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrmProducto().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JScrollPane scrollProductos;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables

private void listarProductos() {

    modelo.setRowCount(0);

    ArrayList<Producto> lista = productoDAO.listarProductos();

    for (Producto p : lista) {

        modelo.addRow(new Object[]{
            p.getIdProducto(),
            p.getNombre(),
            p.getDescripcion(),
            p.getCategoria(),
            p.getPrecio(),
            p.getStock()
        });

    }

}
private void buscarProductos() {
    
    if (txtBuscar.getText().trim().isEmpty()) {
        listarProductos();
        return;
    }

    modelo.setRowCount(0);

    ArrayList<Producto> lista = productoDAO.buscarProductos(txtBuscar.getText());
     // Si no encontró productos
    if (lista.isEmpty()) {

        JOptionPane.showMessageDialog(
                this,
                "Producto no encontrado verifica nuevamente.",
                "Búsqueda",
                JOptionPane.INFORMATION_MESSAGE);
 
        return;
    }
    for (Producto p : lista) {

        modelo.addRow(new Object[]{
            p.getIdProducto(),
            p.getNombre(),
            p.getDescripcion(),
            p.getCategoria(),
            p.getPrecio(),
            p.getStock()
        });

    }

}
   
   
    }
