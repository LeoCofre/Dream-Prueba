package vista;


public class VentanaPrincipal extends javax.swing.JFrame {
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        ventanaPrincipal = new javax.swing.JTabbedPane();
        ventanaClientes = new javax.swing.JPanel();
        btnEditarCliente = new javax.swing.JButton();
        btnDesactivarCliente = new javax.swing.JButton();
        clienteRegistrado = new javax.swing.JLabel();
        Txinformacion9 = new javax.swing.JTextField();
        txtBuscarCliente = new javax.swing.JTextField();
        labelBuscarCliente = new javax.swing.JLabel();
        panelTablaClientes = new javax.swing.JPanel();
        scrollTablaClientes = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        btnVentaCliente = new javax.swing.JButton();
        panelDatosCliente = new javax.swing.JPanel();
        txtClientesFechaNacimiento = new javax.swing.JFormattedTextField();
        labelTelefonoCliente = new javax.swing.JLabel();
        labelFechaNacimientoCliente = new javax.swing.JLabel();
        txtClientesTelefono = new javax.swing.JTextField();
        btnGuardarCliente = new javax.swing.JButton();
        labelCanalComunicacionCliente = new javax.swing.JLabel();
        txtClientesRut = new javax.swing.JTextField();
        txtClientesEmail = new javax.swing.JTextField();
        labelRutCliente = new javax.swing.JLabel();
        labelNombreCliente = new javax.swing.JLabel();
        labelCelularCliente = new javax.swing.JLabel();
        labelGuionRutCliente = new javax.swing.JLabel();
        comboBoxClientesCanales = new javax.swing.JComboBox<>();
        labelEmailCliente = new javax.swing.JLabel();
        txtClientesNombre = new javax.swing.JTextField();
        btnCancelarCliente = new javax.swing.JButton();
        txtClientesCelular = new javax.swing.JTextField();
        txtDigitoVerificadorRut = new javax.swing.JTextField();
        ventanaProveedores = new javax.swing.JPanel();
        btnDesactivarProveedor = new javax.swing.JButton();
        labelProveedores = new javax.swing.JLabel();
        Txinformacion1 = new javax.swing.JTextField();
        txtProveedoresBuscar = new javax.swing.JTextField();
        labelBuscarProveedores = new javax.swing.JLabel();
        panelTablaProveedores = new javax.swing.JPanel();
        scrollTablaProveedores = new javax.swing.JScrollPane();
        tablaProveedores = new javax.swing.JTable();
        panelDatosProveedores = new javax.swing.JPanel();
        labelDireccionProveedores = new javax.swing.JLabel();
        txtProveedoresRazonSocial = new javax.swing.JTextField();
        txtProveedoresRutProveedores = new javax.swing.JTextField();
        btnGuardarProveedor = new javax.swing.JButton();
        txtProveedoresTelefono = new javax.swing.JTextField();
        labelNombreContactoProveedor = new javax.swing.JLabel();
        txtProveedoresEmail = new javax.swing.JTextField();
        labelEmailProveedores = new javax.swing.JLabel();
        labelRutProveedor = new javax.swing.JLabel();
        txtProveedoresNombreContacto = new javax.swing.JTextField();
        labelRazonSocialProveedores = new javax.swing.JLabel();
        labelTelefonoProveedores = new javax.swing.JLabel();
        txtProveedoresDireccion = new javax.swing.JTextField();
        btnProveedoresCancelar = new javax.swing.JButton();
        btnEditarProveedor = new javax.swing.JButton();
        btnCompraProveedor = new javax.swing.JButton();
        ventanaArtículos = new javax.swing.JPanel();
        btnEditarArticulo = new javax.swing.JButton();
        btnxDesactivarArticulo = new javax.swing.JButton();
        labelArticulos = new javax.swing.JLabel();
        Txinformacion8 = new javax.swing.JTextField();
        panelTablaArticulos = new javax.swing.JPanel();
        scrollPaneArticulos = new javax.swing.JScrollPane();
        tablaArticulos = new javax.swing.JTable();
        panelDatosArticulos = new javax.swing.JPanel();
        txtArticulosNombre = new javax.swing.JTextField();
        txtArticulosUnidads = new javax.swing.JTextField();
        labelUnidadesArticulo = new javax.swing.JLabel();
        btnCancelarArticulo = new javax.swing.JButton();
        btnGuardarArticulo = new javax.swing.JButton();
        labelNombreArticulo = new javax.swing.JLabel();
        labelMarcaArticulo = new javax.swing.JLabel();
        txtMarcaArticulos = new javax.swing.JTextField();
        labelCodigoArticulo = new javax.swing.JLabel();
        txtCodigoArticulos = new javax.swing.JTextField();
        labelCategoriaArticulo = new javax.swing.JLabel();
        labelFechaVencimientoArticulo = new javax.swing.JLabel();
        labelProveedorArticulo = new javax.swing.JLabel();
        comBoxCategoriaArticulo = new javax.swing.JComboBox<>();
        txtFechaVencimientoArticulo = new javax.swing.JTextField();
        comBoxProveedorArticulo = new javax.swing.JComboBox<>();
        ventanaPacks = new javax.swing.JPanel();
        btnPacksEditar = new javax.swing.JButton();
        btnPacksDesactivar = new javax.swing.JButton();
        labelTablaPacks = new javax.swing.JLabel();
        Txinformacion7 = new javax.swing.JTextField();
        txtBuscarPack = new javax.swing.JTextField();
        labelBuscarPack = new javax.swing.JLabel();
        panelTablaPacks = new javax.swing.JPanel();
        scrollPanelPacks = new javax.swing.JScrollPane();
        tablaPacks = new javax.swing.JTable();
        panelCreacionPacks = new javax.swing.JPanel();
        labelNombrePack = new javax.swing.JLabel();
        txtNombrePack = new javax.swing.JTextField();
        labelPrecioPack = new javax.swing.JLabel();
        txtPrecioPack = new javax.swing.JTextField();
        btnCrearPack = new javax.swing.JButton();
        btnCancelarPack = new javax.swing.JButton();
        scrollPanelArticulosPack = new javax.swing.JScrollPane();
        scrollPanelPack = new javax.swing.JScrollPane();
        ventanaCanales = new javax.swing.JPanel();
        btnEditarCanal = new javax.swing.JButton();
        btnDesactivarCanal = new javax.swing.JButton();
        labelCanales = new javax.swing.JLabel();
        Txinformacion3 = new javax.swing.JTextField();
        txtBuscarCanal = new javax.swing.JTextField();
        labelBuscarCanal = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        panelTablaCanales = new javax.swing.JScrollPane();
        tablaCanales = new javax.swing.JTable();
        panelDatosCanal = new javax.swing.JPanel();
        txtNombreCanal = new javax.swing.JTextField();
        btnCancelarCanal = new javax.swing.JButton();
        btnGuardarCanal = new javax.swing.JButton();
        txtCodigoCanal = new javax.swing.JTextField();
        labelCodigoCanal = new javax.swing.JLabel();
        labelNombreCanal = new javax.swing.JLabel();
        ventanaCategoriaArticulo = new javax.swing.JPanel();
        btnEditarCategoriaArticulo = new javax.swing.JButton();
        btnDesactivarCategoriaArticulo = new javax.swing.JButton();
        labelCategoriaArticulos = new javax.swing.JLabel();
        Txinformacion2 = new javax.swing.JTextField();
        txtBuscarCategoriaArticulo = new javax.swing.JTextField();
        labelBuscarCategoriaArticulos = new javax.swing.JLabel();
        panelTablaCategoriaArticulos = new javax.swing.JPanel();
        scrollTablaCategoriaArticulos = new javax.swing.JScrollPane();
        tablaCategoriaArticulos = new javax.swing.JTable();
        panelDatosCategoriaArticulos = new javax.swing.JPanel();
        txtCategoriaArticulos = new javax.swing.JTextField();
        btnCancelarCategoriaArticulo = new javax.swing.JButton();
        btnGuardarCategoriaArticulos = new javax.swing.JButton();
        txtCodigoCategoriaArticulo = new javax.swing.JTextField();
        labelCodigoCategoria = new javax.swing.JLabel();
        labelArticuloCategoria = new javax.swing.JLabel();
        ventanaComunas = new javax.swing.JPanel();
        btnEditarComuna = new javax.swing.JButton();
        btnDesactivarComuna = new javax.swing.JButton();
        labelComunasRegistradas = new javax.swing.JLabel();
        Txinformacion4 = new javax.swing.JTextField();
        txtBuscarComuna = new javax.swing.JTextField();
        labelBuscarComuna = new javax.swing.JLabel();
        panelTablaComunas = new javax.swing.JPanel();
        scrollTablaComunas = new javax.swing.JScrollPane();
        tablaComunas = new javax.swing.JTable();
        panelDatosComunas = new javax.swing.JPanel();
        txtNombreComuna = new javax.swing.JTextField();
        btnCancelarComuna = new javax.swing.JButton();
        btnGuardarComuna = new javax.swing.JButton();
        txtCodigoComuna = new javax.swing.JTextField();
        labelCodigoComuna = new javax.swing.JLabel();
        labelNombreComuna = new javax.swing.JLabel();
        ventanaBancos = new javax.swing.JPanel();
        btnEditarBanco = new javax.swing.JButton();
        btnDesactivarBanco = new javax.swing.JButton();
        labelBancosRegistrados = new javax.swing.JLabel();
        Txinformacion = new javax.swing.JTextField();
        txtBuscarBanco = new javax.swing.JTextField();
        labelBuscarBanco = new javax.swing.JLabel();
        panelTablaBancos = new javax.swing.JPanel();
        scrollTablaBancos = new javax.swing.JScrollPane();
        tablaBancos = new javax.swing.JTable();
        panelDatosBanco = new javax.swing.JPanel();
        txtNombreBanco = new javax.swing.JTextField();
        btnCancelarBanco = new javax.swing.JButton();
        btnGuardarBanco = new javax.swing.JButton();
        txtCodigoBanco = new javax.swing.JTextField();
        labelCodigoBanco = new javax.swing.JLabel();
        labelNombreBanco = new javax.swing.JLabel();
        ventanaEstadoVentas = new javax.swing.JPanel();
        btnEditarEstadoVenta = new javax.swing.JButton();
        btnDesactivarEstadoVenta = new javax.swing.JButton();
        labelEstadoDeVenta = new javax.swing.JLabel();
        Txinformacion5 = new javax.swing.JTextField();
        txtBuscarVenta = new javax.swing.JTextField();
        labelBuscarVenta = new javax.swing.JLabel();
        panelTablaEstadoVenta = new javax.swing.JPanel();
        scrollTablaEstadoVentas = new javax.swing.JScrollPane();
        tablaEstadoVentas = new javax.swing.JTable();
        panelDatosEstadoVentas = new javax.swing.JPanel();
        txtEstadoVentas = new javax.swing.JTextField();
        btnCancelarEstadoVenta = new javax.swing.JButton();
        btnGuardarEstadoVenta = new javax.swing.JButton();
        txtCodigoEstadoVenta = new javax.swing.JTextField();
        labelCodigoEstadoVenta = new javax.swing.JLabel();
        labelEstadoVenta = new javax.swing.JLabel();
        ventanaUsuarios = new javax.swing.JPanel();
        btnEditarUsuario = new javax.swing.JButton();
        btnDesactivarUsuario = new javax.swing.JButton();
        labelUsuariosRegistrados = new javax.swing.JLabel();
        txtBuscarUsuario = new javax.swing.JTextField();
        panelTablaUsuarios = new javax.swing.JPanel();
        scrolltablaUsuario = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        panelDatosUsuario = new javax.swing.JPanel();
        txtNombreUsuario = new javax.swing.JTextField();
        btnCancelarUsuario = new javax.swing.JButton();
        labelUsername = new javax.swing.JLabel();
        labelNombreUsuario = new javax.swing.JLabel();
        txtIngreseClave = new javax.swing.JPasswordField();
        labelIngreseClave = new javax.swing.JLabel();
        btnGuardarUsuario = new javax.swing.JButton();
        labelVerifiqueClave = new javax.swing.JLabel();
        txtverifiqueClave = new javax.swing.JPasswordField();
        txtUsername = new javax.swing.JTextField();
        labelBuscarUsuario = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jDesktopPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dream Gifts", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 15), new java.awt.Color(0, 204, 204))); // NOI18N

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ventanaClientes.setBackground(new java.awt.Color(153, 204, 255));
        ventanaClientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Clientes"));
        ventanaClientes.setForeground(new java.awt.Color(51, 51, 255));
        ventanaClientes.setToolTipText("Dreamgifts_Usuarios");

        btnEditarCliente.setBackground(new java.awt.Color(153, 153, 153));
        btnEditarCliente.setText("Editar");
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });

        btnDesactivarCliente.setBackground(new java.awt.Color(153, 153, 153));
        btnDesactivarCliente.setText("Desactivar");

        clienteRegistrado.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        clienteRegistrado.setText("Clientes Registrados");

        labelBuscarCliente.setText("Buscar");

        panelTablaClientes.setBackground(new java.awt.Color(153, 204, 255));
        panelTablaClientes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NOMBRE CLIENTE", "CELULAR", "TELEFONO", "CORREO ELECTRONICO", "CANAL COMUNICACION", "ESTADO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Byte.class, java.lang.String.class, java.lang.String.class, java.lang.Byte.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scrollTablaClientes.setViewportView(tablaClientes);

        javax.swing.GroupLayout panelTablaClientesLayout = new javax.swing.GroupLayout(panelTablaClientes);
        panelTablaClientes.setLayout(panelTablaClientesLayout);
        panelTablaClientesLayout.setHorizontalGroup(
            panelTablaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaClientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrollTablaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 996, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        panelTablaClientesLayout.setVerticalGroup(
            panelTablaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaClientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrollTablaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnVentaCliente.setBackground(new java.awt.Color(153, 153, 153));
        btnVentaCliente.setText("Venta");

        labelTelefonoCliente.setText("Teléfono");

        labelFechaNacimientoCliente.setText("F. Nacimiento");

        btnGuardarCliente.setBackground(new java.awt.Color(153, 153, 153));
        btnGuardarCliente.setText("Guardar");
        btnGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClienteActionPerformed(evt);
            }
        });

        labelCanalComunicacionCliente.setText("Canal Comunicacion");

        txtClientesRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientesRutActionPerformed(evt);
            }
        });

        labelRutCliente.setText("Rut");

        labelNombreCliente.setText("Nombre Cliente");

        labelCelularCliente.setText("Celular");

        labelGuionRutCliente.setText("-");

        comboBoxClientesCanales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        labelEmailCliente.setText("Email");

        btnCancelarCliente.setBackground(new java.awt.Color(153, 153, 153));
        btnCancelarCliente.setText("Cancelar");

        txtClientesCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientesCelularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDatosClienteLayout = new javax.swing.GroupLayout(panelDatosCliente);
        panelDatosCliente.setLayout(panelDatosClienteLayout);
        panelDatosClienteLayout.setHorizontalGroup(
            panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelDatosClienteLayout.createSequentialGroup()
                        .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEmailCliente)
                            .addComponent(labelCanalComunicacionCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxClientesCanales, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClientesEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelDatosClienteLayout.createSequentialGroup()
                        .addComponent(labelTelefonoCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtClientesTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosClienteLayout.createSequentialGroup()
                        .addComponent(labelNombreCliente)
                        .addGap(72, 72, 72)
                        .addComponent(txtClientesNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(96, 96, 96)
                .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelDatosClienteLayout.createSequentialGroup()
                        .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelFechaNacimientoCliente)
                            .addComponent(labelCelularCliente))
                        .addGap(60, 60, 60)
                        .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panelDatosClienteLayout.createSequentialGroup()
                                    .addComponent(btnGuardarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCancelarCliente))
                                .addComponent(txtClientesCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtClientesFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelDatosClienteLayout.createSequentialGroup()
                        .addComponent(labelRutCliente)
                        .addGap(129, 129, 129)
                        .addComponent(txtClientesRut, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(labelGuionRutCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDigitoVerificadorRut, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        panelDatosClienteLayout.setVerticalGroup(
            panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosClienteLayout.createSequentialGroup()
                .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosClienteLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtClientesRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelRutCliente)
                            .addComponent(labelGuionRutCliente)
                            .addComponent(txtDigitoVerificadorRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNombreCliente)
                            .addComponent(txtClientesNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosClienteLayout.createSequentialGroup()
                        .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTelefonoCliente)
                            .addComponent(txtClientesFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFechaNacimientoCliente))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosClienteLayout.createSequentialGroup()
                        .addComponent(txtClientesTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmailCliente)
                    .addComponent(txtClientesEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClientesCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCelularCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarCliente)
                    .addComponent(btnGuardarCliente)
                    .addComponent(comboBoxClientesCanales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCanalComunicacionCliente))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout ventanaClientesLayout = new javax.swing.GroupLayout(ventanaClientes);
        ventanaClientes.setLayout(ventanaClientesLayout);
        ventanaClientesLayout.setHorizontalGroup(
            ventanaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ventanaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelTablaClientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ventanaClientesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(ventanaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelDatosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ventanaClientesLayout.createSequentialGroup()
                                .addComponent(btnVentaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(btnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(btnDesactivarCliente))
                            .addComponent(Txinformacion9, javax.swing.GroupLayout.PREFERRED_SIZE, 994, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(ventanaClientesLayout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(clienteRegistrado)
                .addGap(167, 167, 167)
                .addComponent(labelBuscarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ventanaClientesLayout.setVerticalGroup(
            ventanaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaClientesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panelDatosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(ventanaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBuscarCliente)
                    .addComponent(clienteRegistrado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelTablaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(ventanaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVentaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDesactivarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(Txinformacion9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
        );

        ventanaPrincipal.addTab("Clientes", ventanaClientes);

        ventanaProveedores.setBackground(new java.awt.Color(153, 204, 255));
        ventanaProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Proveedor"));
        ventanaProveedores.setForeground(new java.awt.Color(51, 51, 255));
        ventanaProveedores.setToolTipText("Dreamgifts_Usuarios");

        btnDesactivarProveedor.setBackground(new java.awt.Color(153, 153, 153));
        btnDesactivarProveedor.setText("Desactivar");
        btnDesactivarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesactivarProveedorActionPerformed(evt);
            }
        });

        labelProveedores.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        labelProveedores.setText("Proveedores");

        labelBuscarProveedores.setText("Buscar");

        panelTablaProveedores.setBackground(new java.awt.Color(153, 204, 255));
        panelTablaProveedores.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "RAZÓN SOCIAL", "NOMBRE CONTACTO", "ESTADO", "TELÉFONO", "E-mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Byte.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scrollTablaProveedores.setViewportView(tablaProveedores);

        javax.swing.GroupLayout panelTablaProveedoresLayout = new javax.swing.GroupLayout(panelTablaProveedores);
        panelTablaProveedores.setLayout(panelTablaProveedoresLayout);
        panelTablaProveedoresLayout.setHorizontalGroup(
            panelTablaProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaProveedoresLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(scrollTablaProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 1072, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelTablaProveedoresLayout.setVerticalGroup(
            panelTablaProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollTablaProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );

        labelDireccionProveedores.setText("Direccíon");

        txtProveedoresRazonSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProveedoresRazonSocialActionPerformed(evt);
            }
        });

        btnGuardarProveedor.setBackground(new java.awt.Color(153, 153, 153));
        btnGuardarProveedor.setText("Guardar");
        btnGuardarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProveedorActionPerformed(evt);
            }
        });

        labelNombreContactoProveedor.setText("Nombre Contacto");

        txtProveedoresEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProveedoresEmailActionPerformed(evt);
            }
        });

        labelEmailProveedores.setText("E-mail");

        labelRutProveedor.setText("Rut Proveedor");

        labelRazonSocialProveedores.setText("Razón Social");

        labelTelefonoProveedores.setText("Teléfono");

        btnProveedoresCancelar.setBackground(new java.awt.Color(153, 153, 153));
        btnProveedoresCancelar.setText("Cancelar");

        javax.swing.GroupLayout panelDatosProveedoresLayout = new javax.swing.GroupLayout(panelDatosProveedores);
        panelDatosProveedores.setLayout(panelDatosProveedoresLayout);
        panelDatosProveedoresLayout.setHorizontalGroup(
            panelDatosProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelNombreContactoProveedor)
                    .addComponent(labelRutProveedor, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDireccionProveedores, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(56, 56, 56)
                .addGroup(panelDatosProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelDatosProveedoresLayout.createSequentialGroup()
                        .addComponent(txtProveedoresDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addGroup(panelDatosProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEmailProveedores)
                            .addComponent(labelTelefonoProveedores))
                        .addGap(87, 87, 87)
                        .addGroup(panelDatosProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelDatosProveedoresLayout.createSequentialGroup()
                                .addComponent(btnGuardarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(btnProveedoresCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtProveedoresEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProveedoresTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelDatosProveedoresLayout.createSequentialGroup()
                        .addGroup(panelDatosProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDatosProveedoresLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txtProveedoresNombreContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtProveedoresRutProveedores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addComponent(labelRazonSocialProveedores)
                        .addGap(64, 64, 64)
                        .addComponent(txtProveedoresRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        panelDatosProveedoresLayout.setVerticalGroup(
            panelDatosProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelRutProveedor)
                    .addGroup(panelDatosProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtProveedoresRutProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtProveedoresRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelRazonSocialProveedores)))
                .addGap(15, 15, 15)
                .addGroup(panelDatosProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreContactoProveedor)
                    .addComponent(txtProveedoresNombreContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTelefonoProveedores)
                    .addComponent(txtProveedoresTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(panelDatosProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDireccionProveedores)
                    .addComponent(txtProveedoresDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmailProveedores)
                    .addComponent(txtProveedoresEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarProveedor)
                    .addComponent(btnProveedoresCancelar))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btnEditarProveedor.setBackground(new java.awt.Color(153, 153, 153));
        btnEditarProveedor.setText("Editar");

        btnCompraProveedor.setBackground(new java.awt.Color(153, 153, 153));
        btnCompraProveedor.setText("Compra");

        javax.swing.GroupLayout ventanaProveedoresLayout = new javax.swing.GroupLayout(ventanaProveedores);
        ventanaProveedores.setLayout(ventanaProveedoresLayout);
        ventanaProveedoresLayout.setHorizontalGroup(
            ventanaProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaProveedoresLayout.createSequentialGroup()
                .addGroup(ventanaProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ventanaProveedoresLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCompraProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDesactivarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(247, 247, 247))
                    .addGroup(ventanaProveedoresLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Txinformacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 943, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
            .addGroup(ventanaProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ventanaProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaProveedoresLayout.createSequentialGroup()
                        .addComponent(panelTablaProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaProveedoresLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelProveedores)
                        .addGap(156, 156, 156)
                        .addComponent(labelBuscarProveedores)
                        .addGap(55, 55, 55)
                        .addComponent(txtProveedoresBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(380, 380, 380))))
            .addGroup(ventanaProveedoresLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(panelDatosProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ventanaProveedoresLayout.setVerticalGroup(
            ventanaProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaProveedoresLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(panelDatosProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ventanaProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtProveedoresBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelBuscarProveedores))
                    .addComponent(labelProveedores))
                .addGap(18, 18, 18)
                .addComponent(panelTablaProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ventanaProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDesactivarProveedor)
                    .addComponent(btnEditarProveedor)
                    .addComponent(btnCompraProveedor))
                .addGap(32, 32, 32)
                .addComponent(Txinformacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        ventanaPrincipal.addTab("Proveedores", ventanaProveedores);

        ventanaArtículos.setBackground(new java.awt.Color(153, 204, 255));
        ventanaArtículos.setBorder(javax.swing.BorderFactory.createTitledBorder("Artículos"));
        ventanaArtículos.setForeground(new java.awt.Color(51, 51, 255));
        ventanaArtículos.setToolTipText("Dreamgifts_Usuarios");

        btnEditarArticulo.setBackground(new java.awt.Color(153, 153, 153));
        btnEditarArticulo.setText("Editar");
        btnEditarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarArticuloActionPerformed(evt);
            }
        });

        btnxDesactivarArticulo.setBackground(new java.awt.Color(153, 153, 153));
        btnxDesactivarArticulo.setText("Desactivar");

        labelArticulos.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        labelArticulos.setText("Artículos");

        panelTablaArticulos.setBackground(new java.awt.Color(153, 204, 255));
        panelTablaArticulos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "ARTÍCULO", "ESTADO", "TIPO ARTÍCULO", "UNIDADES", "F. VENCIMIENTO", "MARCA", "PROVEEDORES"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scrollPaneArticulos.setViewportView(tablaArticulos);

        javax.swing.GroupLayout panelTablaArticulosLayout = new javax.swing.GroupLayout(panelTablaArticulos);
        panelTablaArticulos.setLayout(panelTablaArticulosLayout);
        panelTablaArticulosLayout.setHorizontalGroup(
            panelTablaArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneArticulos, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        panelTablaArticulosLayout.setVerticalGroup(
            panelTablaArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaArticulosLayout.createSequentialGroup()
                .addComponent(scrollPaneArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        txtArticulosUnidads.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArticulosUnidadsActionPerformed(evt);
            }
        });

        labelUnidadesArticulo.setText("Unidades");

        btnCancelarArticulo.setBackground(new java.awt.Color(153, 153, 153));
        btnCancelarArticulo.setText("Cancelar");
        btnCancelarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarArticuloActionPerformed(evt);
            }
        });

        btnGuardarArticulo.setBackground(new java.awt.Color(153, 153, 153));
        btnGuardarArticulo.setText("Guardar");
        btnGuardarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarArticuloActionPerformed(evt);
            }
        });

        labelNombreArticulo.setText("Nombre Artículo");

        labelMarcaArticulo.setText("Marca");

        labelCodigoArticulo.setText("Código Artículo");

        txtCodigoArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoArticulosActionPerformed(evt);
            }
        });

        labelCategoriaArticulo.setText("Categoría Artículo");

        labelFechaVencimientoArticulo.setText("Fecha Vencimiento");

        labelProveedorArticulo.setText("Proveedor");

        comBoxCategoriaArticulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtFechaVencimientoArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaVencimientoArticuloActionPerformed(evt);
            }
        });

        comBoxProveedorArticulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout panelDatosArticulosLayout = new javax.swing.GroupLayout(panelDatosArticulos);
        panelDatosArticulos.setLayout(panelDatosArticulosLayout);
        panelDatosArticulosLayout.setHorizontalGroup(
            panelDatosArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosArticulosLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelDatosArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNombreArticulo)
                    .addComponent(labelUnidadesArticulo)
                    .addComponent(labelMarcaArticulo)
                    .addComponent(labelCodigoArticulo))
                .addGap(42, 42, 42)
                .addGroup(panelDatosArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtArticulosUnidads)
                    .addComponent(txtMarcaArticulos)
                    .addComponent(txtCodigoArticulos)
                    .addComponent(txtArticulosNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelDatosArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosArticulosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                        .addComponent(btnGuardarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnCancelarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))
                    .addGroup(panelDatosArticulosLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(panelDatosArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelFechaVencimientoArticulo)
                            .addComponent(labelCategoriaArticulo)
                            .addComponent(labelProveedorArticulo, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelDatosArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comBoxCategoriaArticulo, 0, 232, Short.MAX_VALUE)
                            .addComponent(txtFechaVencimientoArticulo)
                            .addComponent(comBoxProveedorArticulo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelDatosArticulosLayout.setVerticalGroup(
            panelDatosArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosArticulosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelDatosArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtArticulosNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombreArticulo)
                    .addComponent(labelCategoriaArticulo)
                    .addComponent(comBoxCategoriaArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelDatosArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUnidadesArticulo)
                    .addComponent(txtArticulosUnidads, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFechaVencimientoArticulo)
                    .addComponent(txtFechaVencimientoArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panelDatosArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelMarcaArticulo)
                    .addGroup(panelDatosArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMarcaArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelProveedorArticulo)
                        .addComponent(comBoxProveedorArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(panelDatosArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCodigoArticulo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCodigoArticulos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosArticulosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDatosArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarArticulo)
                    .addComponent(btnCancelarArticulo))
                .addContainerGap())
        );

        javax.swing.GroupLayout ventanaArtículosLayout = new javax.swing.GroupLayout(ventanaArtículos);
        ventanaArtículos.setLayout(ventanaArtículosLayout);
        ventanaArtículosLayout.setHorizontalGroup(
            ventanaArtículosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaArtículosLayout.createSequentialGroup()
                .addGroup(ventanaArtículosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaArtículosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelTablaArticulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ventanaArtículosLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(panelDatosArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 71, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaArtículosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnxDesactivarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(ventanaArtículosLayout.createSequentialGroup()
                .addGroup(ventanaArtículosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaArtículosLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(Txinformacion8, javax.swing.GroupLayout.PREFERRED_SIZE, 956, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ventanaArtículosLayout.createSequentialGroup()
                        .addGap(425, 425, 425)
                        .addComponent(labelArticulos)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ventanaArtículosLayout.setVerticalGroup(
            ventanaArtículosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaArtículosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDatosArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelArticulos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTablaArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addGroup(ventanaArtículosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnxDesactivarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Txinformacion8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        ventanaPrincipal.addTab("Artículos", ventanaArtículos);

        ventanaPacks.setBackground(new java.awt.Color(153, 204, 255));
        ventanaPacks.setBorder(javax.swing.BorderFactory.createTitledBorder("Packs"));
        ventanaPacks.setForeground(new java.awt.Color(51, 51, 255));
        ventanaPacks.setToolTipText("Dreamgifts_Usuarios");

        btnPacksEditar.setBackground(new java.awt.Color(153, 153, 153));
        btnPacksEditar.setText("Editar");

        btnPacksDesactivar.setBackground(new java.awt.Color(153, 153, 153));
        btnPacksDesactivar.setText("Desactivar");

        labelTablaPacks.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        labelTablaPacks.setText("Tabla Packs");

        txtBuscarPack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarPackActionPerformed(evt);
            }
        });

        labelBuscarPack.setText("Buscar");

        panelTablaPacks.setBackground(new java.awt.Color(153, 204, 255));
        panelTablaPacks.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaPacks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CODIGO PACK", "NOMBRE PACK", "ESTADO", "UNIDADES EN BODEGA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Byte.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scrollPanelPacks.setViewportView(tablaPacks);

        javax.swing.GroupLayout panelTablaPacksLayout = new javax.swing.GroupLayout(panelTablaPacks);
        panelTablaPacks.setLayout(panelTablaPacksLayout);
        panelTablaPacksLayout.setHorizontalGroup(
            panelTablaPacksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPanelPacks, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        panelTablaPacksLayout.setVerticalGroup(
            panelTablaPacksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaPacksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanelPacks, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelNombrePack.setText("Nombre ");

        labelPrecioPack.setText("Precio Pack");

        txtPrecioPack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioPackActionPerformed(evt);
            }
        });

        btnCrearPack.setBackground(new java.awt.Color(153, 153, 153));
        btnCrearPack.setText("Crear Pack");
        btnCrearPack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPackActionPerformed(evt);
            }
        });

        btnCancelarPack.setBackground(new java.awt.Color(153, 153, 153));
        btnCancelarPack.setText("Cancelar");

        javax.swing.GroupLayout panelCreacionPacksLayout = new javax.swing.GroupLayout(panelCreacionPacks);
        panelCreacionPacks.setLayout(panelCreacionPacksLayout);
        panelCreacionPacksLayout.setHorizontalGroup(
            panelCreacionPacksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCreacionPacksLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(labelNombrePack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCreacionPacksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollPanelArticulosPack)
                    .addComponent(txtNombrePack, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE))
                .addGap(143, 143, 143)
                .addGroup(panelCreacionPacksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCreacionPacksLayout.createSequentialGroup()
                        .addComponent(labelPrecioPack)
                        .addGap(40, 40, 40)
                        .addComponent(txtPrecioPack, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
                    .addComponent(scrollPanelPack))
                .addGap(93, 93, 93))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCreacionPacksLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCancelarPack, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(btnCrearPack, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        panelCreacionPacksLayout.setVerticalGroup(
            panelCreacionPacksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCreacionPacksLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelCreacionPacksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombrePack)
                    .addComponent(txtNombrePack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPrecioPack)
                    .addComponent(txtPrecioPack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCreacionPacksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPanelPack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollPanelArticulosPack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCreacionPacksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelarPack)
                    .addComponent(btnCrearPack))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ventanaPacksLayout = new javax.swing.GroupLayout(ventanaPacks);
        ventanaPacks.setLayout(ventanaPacksLayout);
        ventanaPacksLayout.setHorizontalGroup(
            ventanaPacksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaPacksLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ventanaPacksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ventanaPacksLayout.createSequentialGroup()
                        .addComponent(btnPacksEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnPacksDesactivar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ventanaPacksLayout.createSequentialGroup()
                        .addComponent(labelTablaPacks)
                        .addGap(76, 76, 76)
                        .addComponent(labelBuscarPack)
                        .addGap(89, 89, 89)
                        .addComponent(txtBuscarPack, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))
                    .addComponent(Txinformacion7, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
            .addGroup(ventanaPacksLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ventanaPacksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTablaPacks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ventanaPacksLayout.createSequentialGroup()
                        .addComponent(panelCreacionPacks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 57, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ventanaPacksLayout.setVerticalGroup(
            ventanaPacksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaPacksLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(panelCreacionPacks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ventanaPacksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarPack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBuscarPack)
                    .addComponent(labelTablaPacks))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelTablaPacks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ventanaPacksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPacksEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPacksDesactivar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txinformacion7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240))
        );

        ventanaPrincipal.addTab("Packs", ventanaPacks);

        ventanaCanales.setBackground(new java.awt.Color(153, 204, 255));
        ventanaCanales.setBorder(javax.swing.BorderFactory.createTitledBorder("Canales"));
        ventanaCanales.setForeground(new java.awt.Color(51, 51, 255));
        ventanaCanales.setToolTipText("Dreamgifts_Usuarios");

        btnEditarCanal.setBackground(new java.awt.Color(153, 153, 153));
        btnEditarCanal.setText("Editar");

        btnDesactivarCanal.setBackground(new java.awt.Color(153, 153, 153));
        btnDesactivarCanal.setText("Desactivar");

        labelCanales.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        labelCanales.setText("Canales");

        txtBuscarCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarCanalActionPerformed(evt);
            }
        });

        labelBuscarCanal.setText("Buscar");

        jPanel8.setBackground(new java.awt.Color(153, 204, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaCanales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CODIGO ", "NOMBRE ", "ESTADO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Byte.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        panelTablaCanales.setViewportView(tablaCanales);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTablaCanales)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTablaCanales, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancelarCanal.setBackground(new java.awt.Color(153, 153, 153));
        btnCancelarCanal.setText("Cancelar");

        btnGuardarCanal.setBackground(new java.awt.Color(153, 153, 153));
        btnGuardarCanal.setText("Guardar");
        btnGuardarCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCanalActionPerformed(evt);
            }
        });

        txtCodigoCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoCanalActionPerformed(evt);
            }
        });

        labelCodigoCanal.setText("Codigo Canal");

        labelNombreCanal.setText("Nombre Canal");

        javax.swing.GroupLayout panelDatosCanalLayout = new javax.swing.GroupLayout(panelDatosCanal);
        panelDatosCanal.setLayout(panelDatosCanalLayout);
        panelDatosCanalLayout.setHorizontalGroup(
            panelDatosCanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosCanalLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelDatosCanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNombreCanal)
                    .addComponent(labelCodigoCanal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDatosCanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCodigoCanal, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreCanal, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelDatosCanalLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btnGuardarCanal, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnCancelarCanal, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        panelDatosCanalLayout.setVerticalGroup(
            panelDatosCanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosCanalLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelDatosCanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreCanal)
                    .addComponent(txtNombreCanal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(panelDatosCanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigoCanal)
                    .addComponent(txtCodigoCanal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(panelDatosCanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarCanal)
                    .addComponent(btnGuardarCanal))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ventanaCanalesLayout = new javax.swing.GroupLayout(ventanaCanales);
        ventanaCanales.setLayout(ventanaCanalesLayout);
        ventanaCanalesLayout.setHorizontalGroup(
            ventanaCanalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaCanalesLayout.createSequentialGroup()
                .addGap(0, 835, Short.MAX_VALUE)
                .addComponent(btnEditarCanal, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnDesactivarCanal)
                .addGap(33, 33, 33))
            .addGroup(ventanaCanalesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaCanalesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Txinformacion3, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(ventanaCanalesLayout.createSequentialGroup()
                .addGroup(ventanaCanalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaCanalesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelCanales)
                        .addGap(93, 93, 93)
                        .addComponent(labelBuscarCanal)
                        .addGap(27, 27, 27)
                        .addComponent(txtBuscarCanal, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ventanaCanalesLayout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(panelDatosCanal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ventanaCanalesLayout.setVerticalGroup(
            ventanaCanalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaCanalesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDatosCanal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ventanaCanalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaCanalesLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(labelBuscarCanal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaCanalesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ventanaCanalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuscarCanal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCanales, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ventanaCanalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarCanal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDesactivarCanal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txinformacion3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240))
        );

        ventanaPrincipal.addTab("Canales", ventanaCanales);

        ventanaCategoriaArticulo.setBackground(new java.awt.Color(153, 204, 255));
        ventanaCategoriaArticulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Categorías Articulos"));
        ventanaCategoriaArticulo.setForeground(new java.awt.Color(51, 51, 255));
        ventanaCategoriaArticulo.setToolTipText("Dreamgifts_Usuarios");

        btnEditarCategoriaArticulo.setBackground(new java.awt.Color(153, 153, 153));
        btnEditarCategoriaArticulo.setText("Editar");

        btnDesactivarCategoriaArticulo.setBackground(new java.awt.Color(153, 153, 153));
        btnDesactivarCategoriaArticulo.setText("Desactivar");

        labelCategoriaArticulos.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        labelCategoriaArticulos.setText("Categoría Artículos");

        txtBuscarCategoriaArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarCategoriaArticuloActionPerformed(evt);
            }
        });

        labelBuscarCategoriaArticulos.setText("Buscar");

        panelTablaCategoriaArticulos.setBackground(new java.awt.Color(153, 204, 255));
        panelTablaCategoriaArticulos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaCategoriaArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CODIGO CATEGORÍA", "CATEGORIA ARTICULOS", "ESTADO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Byte.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scrollTablaCategoriaArticulos.setViewportView(tablaCategoriaArticulos);

        javax.swing.GroupLayout panelTablaCategoriaArticulosLayout = new javax.swing.GroupLayout(panelTablaCategoriaArticulos);
        panelTablaCategoriaArticulos.setLayout(panelTablaCategoriaArticulosLayout);
        panelTablaCategoriaArticulosLayout.setHorizontalGroup(
            panelTablaCategoriaArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollTablaCategoriaArticulos, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        panelTablaCategoriaArticulosLayout.setVerticalGroup(
            panelTablaCategoriaArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaCategoriaArticulosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollTablaCategoriaArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancelarCategoriaArticulo.setBackground(new java.awt.Color(153, 153, 153));
        btnCancelarCategoriaArticulo.setText("Cancelar");

        btnGuardarCategoriaArticulos.setBackground(new java.awt.Color(153, 153, 153));
        btnGuardarCategoriaArticulos.setText("Guardar");
        btnGuardarCategoriaArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCategoriaArticulosActionPerformed(evt);
            }
        });

        txtCodigoCategoriaArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoCategoriaArticuloActionPerformed(evt);
            }
        });

        labelCodigoCategoria.setText("Código Categoría");

        labelArticuloCategoria.setText("Categoría Artículo");

        javax.swing.GroupLayout panelDatosCategoriaArticulosLayout = new javax.swing.GroupLayout(panelDatosCategoriaArticulos);
        panelDatosCategoriaArticulos.setLayout(panelDatosCategoriaArticulosLayout);
        panelDatosCategoriaArticulosLayout.setHorizontalGroup(
            panelDatosCategoriaArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosCategoriaArticulosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelDatosCategoriaArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelArticuloCategoria)
                    .addComponent(labelCodigoCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDatosCategoriaArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCodigoCategoriaArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCategoriaArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelDatosCategoriaArticulosLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btnGuardarCategoriaArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnCancelarCategoriaArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        panelDatosCategoriaArticulosLayout.setVerticalGroup(
            panelDatosCategoriaArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosCategoriaArticulosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelDatosCategoriaArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelArticuloCategoria)
                    .addComponent(txtCategoriaArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(panelDatosCategoriaArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigoCategoria)
                    .addComponent(txtCodigoCategoriaArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(panelDatosCategoriaArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarCategoriaArticulo)
                    .addComponent(btnGuardarCategoriaArticulos))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ventanaCategoriaArticuloLayout = new javax.swing.GroupLayout(ventanaCategoriaArticulo);
        ventanaCategoriaArticulo.setLayout(ventanaCategoriaArticuloLayout);
        ventanaCategoriaArticuloLayout.setHorizontalGroup(
            ventanaCategoriaArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaCategoriaArticuloLayout.createSequentialGroup()
                .addGap(0, 835, Short.MAX_VALUE)
                .addComponent(btnEditarCategoriaArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnDesactivarCategoriaArticulo)
                .addGap(33, 33, 33))
            .addGroup(ventanaCategoriaArticuloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTablaCategoriaArticulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(ventanaCategoriaArticuloLayout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(panelDatosCategoriaArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaCategoriaArticuloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ventanaCategoriaArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaCategoriaArticuloLayout.createSequentialGroup()
                        .addComponent(labelCategoriaArticulos)
                        .addGap(228, 228, 228)
                        .addComponent(labelBuscarCategoriaArticulos)
                        .addGap(39, 39, 39)
                        .addComponent(txtBuscarCategoriaArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaCategoriaArticuloLayout.createSequentialGroup()
                        .addComponent(Txinformacion2, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );
        ventanaCategoriaArticuloLayout.setVerticalGroup(
            ventanaCategoriaArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaCategoriaArticuloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDatosCategoriaArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ventanaCategoriaArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaCategoriaArticuloLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(ventanaCategoriaArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelBuscarCategoriaArticulos)
                            .addComponent(txtBuscarCategoriaArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ventanaCategoriaArticuloLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(labelCategoriaArticulos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelTablaCategoriaArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ventanaCategoriaArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarCategoriaArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDesactivarCategoriaArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txinformacion2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240))
        );

        ventanaPrincipal.addTab("Categorías Artículos", ventanaCategoriaArticulo);

        ventanaComunas.setBackground(new java.awt.Color(153, 204, 255));
        ventanaComunas.setBorder(javax.swing.BorderFactory.createTitledBorder("Comunas"));
        ventanaComunas.setForeground(new java.awt.Color(51, 51, 255));
        ventanaComunas.setToolTipText("Dreamgifts_Usuarios");

        btnEditarComuna.setBackground(new java.awt.Color(153, 153, 153));
        btnEditarComuna.setText("Editar");

        btnDesactivarComuna.setBackground(new java.awt.Color(153, 153, 153));
        btnDesactivarComuna.setText("Desactivar");

        labelComunasRegistradas.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        labelComunasRegistradas.setText("Comunas Registradas");

        labelBuscarComuna.setText("Buscar");

        panelTablaComunas.setBackground(new java.awt.Color(153, 204, 255));
        panelTablaComunas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaComunas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CODIGO", "NOMBRE", "ESTADO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Byte.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scrollTablaComunas.setViewportView(tablaComunas);

        javax.swing.GroupLayout panelTablaComunasLayout = new javax.swing.GroupLayout(panelTablaComunas);
        panelTablaComunas.setLayout(panelTablaComunasLayout);
        panelTablaComunasLayout.setHorizontalGroup(
            panelTablaComunasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollTablaComunas, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        panelTablaComunasLayout.setVerticalGroup(
            panelTablaComunasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaComunasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollTablaComunas, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancelarComuna.setBackground(new java.awt.Color(153, 153, 153));
        btnCancelarComuna.setText("Cancelar");

        btnGuardarComuna.setBackground(new java.awt.Color(153, 153, 153));
        btnGuardarComuna.setText("Guardar");
        btnGuardarComuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarComunaActionPerformed(evt);
            }
        });

        txtCodigoComuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoComunaActionPerformed(evt);
            }
        });

        labelCodigoComuna.setText("Código Comuna");

        labelNombreComuna.setText("Nombre Comuna");

        javax.swing.GroupLayout panelDatosComunasLayout = new javax.swing.GroupLayout(panelDatosComunas);
        panelDatosComunas.setLayout(panelDatosComunasLayout);
        panelDatosComunasLayout.setHorizontalGroup(
            panelDatosComunasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosComunasLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelDatosComunasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNombreComuna)
                    .addComponent(labelCodigoComuna))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDatosComunasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCodigoComuna, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreComuna, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelDatosComunasLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btnGuardarComuna, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnCancelarComuna, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        panelDatosComunasLayout.setVerticalGroup(
            panelDatosComunasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosComunasLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelDatosComunasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreComuna)
                    .addComponent(txtNombreComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(panelDatosComunasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigoComuna)
                    .addComponent(txtCodigoComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(panelDatosComunasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarComuna)
                    .addComponent(btnGuardarComuna))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ventanaComunasLayout = new javax.swing.GroupLayout(ventanaComunas);
        ventanaComunas.setLayout(ventanaComunasLayout);
        ventanaComunasLayout.setHorizontalGroup(
            ventanaComunasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaComunasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEditarComuna, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnDesactivarComuna)
                .addGap(33, 33, 33))
            .addGroup(ventanaComunasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ventanaComunasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaComunasLayout.createSequentialGroup()
                        .addComponent(panelTablaComunas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaComunasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(ventanaComunasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaComunasLayout.createSequentialGroup()
                                .addComponent(Txinformacion4, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaComunasLayout.createSequentialGroup()
                                .addComponent(labelComunasRegistradas)
                                .addGap(133, 133, 133)
                                .addComponent(labelBuscarComuna)
                                .addGap(39, 39, 39)
                                .addComponent(txtBuscarComuna, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(136, 136, 136))))))
            .addGroup(ventanaComunasLayout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(panelDatosComunas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 338, Short.MAX_VALUE))
        );
        ventanaComunasLayout.setVerticalGroup(
            ventanaComunasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaComunasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDatosComunas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(ventanaComunasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBuscarComuna)
                    .addComponent(labelComunasRegistradas)
                    .addComponent(txtBuscarComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelTablaComunas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ventanaComunasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarComuna, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDesactivarComuna, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txinformacion4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240))
        );

        ventanaPrincipal.addTab("Comunas", ventanaComunas);

        ventanaBancos.setBackground(new java.awt.Color(153, 204, 255));
        ventanaBancos.setBorder(javax.swing.BorderFactory.createTitledBorder("Bancos"));
        ventanaBancos.setForeground(new java.awt.Color(51, 51, 255));
        ventanaBancos.setToolTipText("Dreamgifts_Usuarios");

        btnEditarBanco.setBackground(new java.awt.Color(153, 153, 153));
        btnEditarBanco.setText("Editar");

        btnDesactivarBanco.setBackground(new java.awt.Color(153, 153, 153));
        btnDesactivarBanco.setText("Desactivar");

        labelBancosRegistrados.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        labelBancosRegistrados.setText("Bancos Registrados");

        labelBuscarBanco.setText("Buscar");

        panelTablaBancos.setBackground(new java.awt.Color(153, 204, 255));
        panelTablaBancos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaBancos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CODIGO", "NOMBRE", "ESTADO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Byte.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scrollTablaBancos.setViewportView(tablaBancos);

        javax.swing.GroupLayout panelTablaBancosLayout = new javax.swing.GroupLayout(panelTablaBancos);
        panelTablaBancos.setLayout(panelTablaBancosLayout);
        panelTablaBancosLayout.setHorizontalGroup(
            panelTablaBancosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaBancosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollTablaBancos)
                .addContainerGap())
        );
        panelTablaBancosLayout.setVerticalGroup(
            panelTablaBancosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaBancosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollTablaBancos, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancelarBanco.setBackground(new java.awt.Color(153, 153, 153));
        btnCancelarBanco.setText("Cancelar");

        btnGuardarBanco.setBackground(new java.awt.Color(153, 153, 153));
        btnGuardarBanco.setText("Guardar");
        btnGuardarBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarBancoActionPerformed(evt);
            }
        });

        txtCodigoBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoBancoActionPerformed(evt);
            }
        });

        labelCodigoBanco.setText("Codigo Banco");

        labelNombreBanco.setText("Nombre Banco");

        javax.swing.GroupLayout panelDatosBancoLayout = new javax.swing.GroupLayout(panelDatosBanco);
        panelDatosBanco.setLayout(panelDatosBancoLayout);
        panelDatosBancoLayout.setHorizontalGroup(
            panelDatosBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosBancoLayout.createSequentialGroup()
                .addGroup(panelDatosBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDatosBancoLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnGuardarBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelarBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosBancoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(panelDatosBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNombreBanco)
                            .addComponent(labelCodigoBanco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(panelDatosBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCodigoBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        panelDatosBancoLayout.setVerticalGroup(
            panelDatosBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosBancoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelDatosBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreBanco)
                    .addComponent(txtNombreBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(panelDatosBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigoBanco)
                    .addComponent(txtCodigoBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(panelDatosBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarBanco)
                    .addComponent(btnGuardarBanco))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ventanaBancosLayout = new javax.swing.GroupLayout(ventanaBancos);
        ventanaBancos.setLayout(ventanaBancosLayout);
        ventanaBancosLayout.setHorizontalGroup(
            ventanaBancosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaBancosLayout.createSequentialGroup()
                .addGroup(ventanaBancosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaBancosLayout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(labelBancosRegistrados)
                        .addGap(165, 165, 165)
                        .addComponent(labelBuscarBanco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ventanaBancosLayout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(panelDatosBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaBancosLayout.createSequentialGroup()
                .addGroup(ventanaBancosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ventanaBancosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ventanaBancosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelTablaBancos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Txinformacion)))
                    .addGroup(ventanaBancosLayout.createSequentialGroup()
                        .addGap(0, 835, Short.MAX_VALUE)
                        .addComponent(btnEditarBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnDesactivarBanco)))
                .addGap(33, 33, 33))
        );
        ventanaBancosLayout.setVerticalGroup(
            ventanaBancosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaBancosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDatosBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ventanaBancosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBuscarBanco)
                    .addComponent(labelBancosRegistrados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelTablaBancos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ventanaBancosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDesactivarBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txinformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240))
        );

        ventanaPrincipal.addTab("Bancos", ventanaBancos);

        ventanaEstadoVentas.setBackground(new java.awt.Color(153, 204, 255));
        ventanaEstadoVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado ventas"));
        ventanaEstadoVentas.setForeground(new java.awt.Color(51, 51, 255));
        ventanaEstadoVentas.setToolTipText("Dreamgifts_Usuarios");

        btnEditarEstadoVenta.setBackground(new java.awt.Color(153, 153, 153));
        btnEditarEstadoVenta.setText("Editar");

        btnDesactivarEstadoVenta.setBackground(new java.awt.Color(153, 153, 153));
        btnDesactivarEstadoVenta.setText("Desactivar");

        labelEstadoDeVenta.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        labelEstadoDeVenta.setText("Estado de Ventas");

        labelBuscarVenta.setText("Buscar");

        panelTablaEstadoVenta.setBackground(new java.awt.Color(153, 204, 255));
        panelTablaEstadoVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaEstadoVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CODIGO CATEGORIA VENTAS", "CATEGORIA VENTAS", "ESTADO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Byte.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scrollTablaEstadoVentas.setViewportView(tablaEstadoVentas);

        javax.swing.GroupLayout panelTablaEstadoVentaLayout = new javax.swing.GroupLayout(panelTablaEstadoVenta);
        panelTablaEstadoVenta.setLayout(panelTablaEstadoVentaLayout);
        panelTablaEstadoVentaLayout.setHorizontalGroup(
            panelTablaEstadoVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaEstadoVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollTablaEstadoVentas)
                .addContainerGap())
        );
        panelTablaEstadoVentaLayout.setVerticalGroup(
            panelTablaEstadoVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaEstadoVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollTablaEstadoVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancelarEstadoVenta.setBackground(new java.awt.Color(153, 153, 153));
        btnCancelarEstadoVenta.setText("Cancelar");

        btnGuardarEstadoVenta.setBackground(new java.awt.Color(153, 153, 153));
        btnGuardarEstadoVenta.setText("Guardar");
        btnGuardarEstadoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEstadoVentaActionPerformed(evt);
            }
        });

        txtCodigoEstadoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoEstadoVentaActionPerformed(evt);
            }
        });

        labelCodigoEstadoVenta.setText("Código Estado Venta");

        labelEstadoVenta.setText("Estado Venta");

        javax.swing.GroupLayout panelDatosEstadoVentasLayout = new javax.swing.GroupLayout(panelDatosEstadoVentas);
        panelDatosEstadoVentas.setLayout(panelDatosEstadoVentasLayout);
        panelDatosEstadoVentasLayout.setHorizontalGroup(
            panelDatosEstadoVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosEstadoVentasLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelDatosEstadoVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEstadoVenta)
                    .addComponent(labelCodigoEstadoVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDatosEstadoVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCodigoEstadoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstadoVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelDatosEstadoVentasLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btnGuardarEstadoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnCancelarEstadoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        panelDatosEstadoVentasLayout.setVerticalGroup(
            panelDatosEstadoVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosEstadoVentasLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelDatosEstadoVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEstadoVenta)
                    .addComponent(txtEstadoVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(panelDatosEstadoVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigoEstadoVenta)
                    .addComponent(txtCodigoEstadoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(panelDatosEstadoVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarEstadoVenta)
                    .addComponent(btnGuardarEstadoVenta))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ventanaEstadoVentasLayout = new javax.swing.GroupLayout(ventanaEstadoVentas);
        ventanaEstadoVentas.setLayout(ventanaEstadoVentasLayout);
        ventanaEstadoVentasLayout.setHorizontalGroup(
            ventanaEstadoVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaEstadoVentasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEditarEstadoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btnDesactivarEstadoVenta)
                .addGap(90, 90, 90))
            .addGroup(ventanaEstadoVentasLayout.createSequentialGroup()
                .addGroup(ventanaEstadoVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaEstadoVentasLayout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(labelEstadoDeVenta)
                        .addGap(165, 165, 165)
                        .addComponent(labelBuscarVenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ventanaEstadoVentasLayout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(panelDatosEstadoVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(335, Short.MAX_VALUE))
            .addGroup(ventanaEstadoVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ventanaEstadoVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaEstadoVentasLayout.createSequentialGroup()
                        .addComponent(panelTablaEstadoVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(ventanaEstadoVentasLayout.createSequentialGroup()
                        .addComponent(Txinformacion5)
                        .addGap(33, 33, 33))))
        );
        ventanaEstadoVentasLayout.setVerticalGroup(
            ventanaEstadoVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaEstadoVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDatosEstadoVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(ventanaEstadoVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBuscarVenta)
                    .addComponent(labelEstadoDeVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelTablaEstadoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ventanaEstadoVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarEstadoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDesactivarEstadoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txinformacion5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240))
        );

        ventanaPrincipal.addTab("Estado Ventas", ventanaEstadoVentas);

        ventanaUsuarios.setBackground(new java.awt.Color(153, 204, 255));
        ventanaUsuarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuarios"));
        ventanaUsuarios.setForeground(new java.awt.Color(51, 51, 255));
        ventanaUsuarios.setToolTipText("Dreamgifts_Usuarios");

        btnEditarUsuario.setBackground(new java.awt.Color(153, 153, 153));
        btnEditarUsuario.setText("Editar");

        btnDesactivarUsuario.setBackground(new java.awt.Color(153, 153, 153));
        btnDesactivarUsuario.setText("Desactivar");

        labelUsuariosRegistrados.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        labelUsuariosRegistrados.setText("Usuarios Registrados");

        panelTablaUsuarios.setBackground(new java.awt.Color(153, 204, 255));
        panelTablaUsuarios.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaUsuarios.setForeground(new java.awt.Color(0, 153, 153));
        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NOMBRE", "USERNAME", "ESTADO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Byte.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scrolltablaUsuario.setViewportView(tablaUsuarios);

        javax.swing.GroupLayout panelTablaUsuariosLayout = new javax.swing.GroupLayout(panelTablaUsuarios);
        panelTablaUsuarios.setLayout(panelTablaUsuariosLayout);
        panelTablaUsuariosLayout.setHorizontalGroup(
            panelTablaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrolltablaUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        panelTablaUsuariosLayout.setVerticalGroup(
            panelTablaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrolltablaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancelarUsuario.setBackground(new java.awt.Color(153, 153, 153));
        btnCancelarUsuario.setText("Cancelar");
        btnCancelarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarUsuarioActionPerformed(evt);
            }
        });

        labelUsername.setText("Username");

        labelNombreUsuario.setText("Nombre Usuario ");

        txtIngreseClave.setText("jPasswordField1");

        labelIngreseClave.setText("Ingrese Clave");

        btnGuardarUsuario.setBackground(new java.awt.Color(153, 153, 153));
        btnGuardarUsuario.setText("Guardar");
        btnGuardarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarUsuarioActionPerformed(evt);
            }
        });

        labelVerifiqueClave.setText("Verifique Clave");

        txtverifiqueClave.setText("jPasswordField1");

        javax.swing.GroupLayout panelDatosUsuarioLayout = new javax.swing.GroupLayout(panelDatosUsuario);
        panelDatosUsuario.setLayout(panelDatosUsuarioLayout);
        panelDatosUsuarioLayout.setHorizontalGroup(
            panelDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosUsuarioLayout.createSequentialGroup()
                .addGroup(panelDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosUsuarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelDatosUsuarioLayout.createSequentialGroup()
                                .addComponent(labelVerifiqueClave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtverifiqueClave, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosUsuarioLayout.createSequentialGroup()
                                .addComponent(labelNombreUsuario)
                                .addGap(34, 34, 34)
                                .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosUsuarioLayout.createSequentialGroup()
                                .addComponent(labelUsername)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDatosUsuarioLayout.createSequentialGroup()
                                .addComponent(labelIngreseClave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtIngreseClave, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelDatosUsuarioLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnGuardarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnCancelarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        panelDatosUsuarioLayout.setVerticalGroup(
            panelDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreUsuario)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panelDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panelDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIngreseClave)
                    .addComponent(txtIngreseClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panelDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVerifiqueClave)
                    .addComponent(txtverifiqueClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(panelDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarUsuario)
                    .addComponent(btnCancelarUsuario))
                .addGap(18, 18, 18))
        );

        labelBuscarUsuario.setText("Buscar");

        javax.swing.GroupLayout ventanaUsuariosLayout = new javax.swing.GroupLayout(ventanaUsuarios);
        ventanaUsuarios.setLayout(ventanaUsuariosLayout);
        ventanaUsuariosLayout.setHorizontalGroup(
            ventanaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTablaUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaUsuariosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ventanaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaUsuariosLayout.createSequentialGroup()
                        .addComponent(btnEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnDesactivarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaUsuariosLayout.createSequentialGroup()
                        .addComponent(labelUsuariosRegistrados)
                        .addGap(147, 147, 147)
                        .addComponent(labelBuscarUsuario)
                        .addGap(40, 40, 40)
                        .addComponent(txtBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111))))
            .addGroup(ventanaUsuariosLayout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(panelDatosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(338, Short.MAX_VALUE))
        );
        ventanaUsuariosLayout.setVerticalGroup(
            ventanaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaUsuariosLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(panelDatosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ventanaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelBuscarUsuario, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(labelUsuariosRegistrados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelTablaUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ventanaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDesactivarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        ventanaPrincipal.addTab("Usuarios", ventanaUsuarios);

        jDesktopPane2.setLayer(ventanaPrincipal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ventanaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(ventanaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jMenuBar1ComponentAdded(evt);
            }
        });

        jMenu1.setText("Ventas");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Compras");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Informes");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Maestros");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarUsuarioActionPerformed

    private void btnCancelarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarUsuarioActionPerformed

    private void btnGuardarCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCanalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarCanalActionPerformed

    private void txtCodigoCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoCanalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoCanalActionPerformed

    private void txtProveedoresRazonSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProveedoresRazonSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProveedoresRazonSocialActionPerformed

    private void btnGuardarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarProveedorActionPerformed

    private void txtPrecioPackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioPackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioPackActionPerformed

    private void btnCrearPackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearPackActionPerformed

    private void txtArticulosUnidadsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArticulosUnidadsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtArticulosUnidadsActionPerformed

    private void btnGuardarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarArticuloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarArticuloActionPerformed

    private void btnGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarClienteActionPerformed

    private void txtClientesCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientesCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClientesCelularActionPerformed

    private void txtClientesRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientesRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClientesRutActionPerformed

    private void jMenuBar1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jMenuBar1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuBar1ComponentAdded

    private void txtProveedoresEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProveedoresEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProveedoresEmailActionPerformed

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void txtFechaVencimientoArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaVencimientoArticuloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaVencimientoArticuloActionPerformed

    private void btnDesactivarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesactivarProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDesactivarProveedorActionPerformed

    private void btnGuardarCategoriaArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCategoriaArticulosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarCategoriaArticulosActionPerformed

    private void txtCodigoCategoriaArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoCategoriaArticuloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoCategoriaArticuloActionPerformed

    private void btnGuardarComunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarComunaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarComunaActionPerformed

    private void txtCodigoComunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoComunaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoComunaActionPerformed

    private void btnGuardarBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarBancoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarBancoActionPerformed

    private void txtCodigoBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoBancoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoBancoActionPerformed

    private void btnGuardarEstadoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEstadoVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarEstadoVentaActionPerformed

    private void txtCodigoEstadoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoEstadoVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoEstadoVentaActionPerformed

    private void btnCancelarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarArticuloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarArticuloActionPerformed

    private void txtCodigoArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoArticulosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoArticulosActionPerformed

    private void btnEditarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarArticuloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarArticuloActionPerformed

    private void txtBuscarPackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarPackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarPackActionPerformed

    private void txtBuscarCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarCanalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarCanalActionPerformed

    private void txtBuscarCategoriaArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarCategoriaArticuloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarCategoriaArticuloActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Txinformacion;
    private javax.swing.JTextField Txinformacion1;
    private javax.swing.JTextField Txinformacion2;
    private javax.swing.JTextField Txinformacion3;
    private javax.swing.JTextField Txinformacion4;
    private javax.swing.JTextField Txinformacion5;
    private javax.swing.JTextField Txinformacion7;
    private javax.swing.JTextField Txinformacion8;
    private javax.swing.JTextField Txinformacion9;
    private javax.swing.JButton btnCancelarArticulo;
    private javax.swing.JButton btnCancelarBanco;
    private javax.swing.JButton btnCancelarCanal;
    private javax.swing.JButton btnCancelarCategoriaArticulo;
    private javax.swing.JButton btnCancelarCliente;
    public javax.swing.JButton btnCancelarComuna;
    private javax.swing.JButton btnCancelarEstadoVenta;
    private javax.swing.JButton btnCancelarPack;
    private javax.swing.JButton btnCancelarUsuario;
    private javax.swing.JButton btnCompraProveedor;
    private javax.swing.JButton btnCrearPack;
    private javax.swing.JButton btnDesactivarBanco;
    private javax.swing.JButton btnDesactivarCanal;
    private javax.swing.JButton btnDesactivarCategoriaArticulo;
    private javax.swing.JButton btnDesactivarCliente;
    public javax.swing.JButton btnDesactivarComuna;
    private javax.swing.JButton btnDesactivarEstadoVenta;
    private javax.swing.JButton btnDesactivarProveedor;
    private javax.swing.JButton btnDesactivarUsuario;
    private javax.swing.JButton btnEditarArticulo;
    private javax.swing.JButton btnEditarBanco;
    private javax.swing.JButton btnEditarCanal;
    private javax.swing.JButton btnEditarCategoriaArticulo;
    private javax.swing.JButton btnEditarCliente;
    public javax.swing.JButton btnEditarComuna;
    private javax.swing.JButton btnEditarEstadoVenta;
    private javax.swing.JButton btnEditarProveedor;
    private javax.swing.JButton btnEditarUsuario;
    private javax.swing.JButton btnGuardarArticulo;
    private javax.swing.JButton btnGuardarBanco;
    private javax.swing.JButton btnGuardarCanal;
    private javax.swing.JButton btnGuardarCategoriaArticulos;
    private javax.swing.JButton btnGuardarCliente;
    private javax.swing.JButton btnGuardarComuna;
    private javax.swing.JButton btnGuardarEstadoVenta;
    private javax.swing.JButton btnGuardarProveedor;
    private javax.swing.JButton btnGuardarUsuario;
    private javax.swing.JButton btnPacksDesactivar;
    private javax.swing.JButton btnPacksEditar;
    private javax.swing.JButton btnProveedoresCancelar;
    private javax.swing.JButton btnVentaCliente;
    private javax.swing.JButton btnxDesactivarArticulo;
    private javax.swing.JLabel clienteRegistrado;
    private javax.swing.JComboBox<String> comBoxCategoriaArticulo;
    private javax.swing.JComboBox<String> comBoxProveedorArticulo;
    private javax.swing.JComboBox<String> comboBoxClientesCanales;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel labelArticuloCategoria;
    private javax.swing.JLabel labelArticulos;
    private javax.swing.JLabel labelBancosRegistrados;
    private javax.swing.JLabel labelBuscarBanco;
    private javax.swing.JLabel labelBuscarCanal;
    private javax.swing.JLabel labelBuscarCategoriaArticulos;
    private javax.swing.JLabel labelBuscarCliente;
    private javax.swing.JLabel labelBuscarComuna;
    private javax.swing.JLabel labelBuscarPack;
    private javax.swing.JLabel labelBuscarProveedores;
    private javax.swing.JLabel labelBuscarUsuario;
    private javax.swing.JLabel labelBuscarVenta;
    private javax.swing.JLabel labelCanalComunicacionCliente;
    private javax.swing.JLabel labelCanales;
    private javax.swing.JLabel labelCategoriaArticulo;
    private javax.swing.JLabel labelCategoriaArticulos;
    private javax.swing.JLabel labelCelularCliente;
    private javax.swing.JLabel labelCodigoArticulo;
    private javax.swing.JLabel labelCodigoBanco;
    private javax.swing.JLabel labelCodigoCanal;
    private javax.swing.JLabel labelCodigoCategoria;
    private javax.swing.JLabel labelCodigoComuna;
    private javax.swing.JLabel labelCodigoEstadoVenta;
    private javax.swing.JLabel labelComunasRegistradas;
    private javax.swing.JLabel labelDireccionProveedores;
    private javax.swing.JLabel labelEmailCliente;
    private javax.swing.JLabel labelEmailProveedores;
    private javax.swing.JLabel labelEstadoDeVenta;
    private javax.swing.JLabel labelEstadoVenta;
    private javax.swing.JLabel labelFechaNacimientoCliente;
    private javax.swing.JLabel labelFechaVencimientoArticulo;
    private javax.swing.JLabel labelGuionRutCliente;
    private javax.swing.JLabel labelIngreseClave;
    private javax.swing.JLabel labelMarcaArticulo;
    private javax.swing.JLabel labelNombreArticulo;
    private javax.swing.JLabel labelNombreBanco;
    private javax.swing.JLabel labelNombreCanal;
    private javax.swing.JLabel labelNombreCliente;
    private javax.swing.JLabel labelNombreComuna;
    private javax.swing.JLabel labelNombreContactoProveedor;
    private javax.swing.JLabel labelNombrePack;
    private javax.swing.JLabel labelNombreUsuario;
    private javax.swing.JLabel labelPrecioPack;
    private javax.swing.JLabel labelProveedorArticulo;
    private javax.swing.JLabel labelProveedores;
    private javax.swing.JLabel labelRazonSocialProveedores;
    private javax.swing.JLabel labelRutCliente;
    private javax.swing.JLabel labelRutProveedor;
    private javax.swing.JLabel labelTablaPacks;
    private javax.swing.JLabel labelTelefonoCliente;
    private javax.swing.JLabel labelTelefonoProveedores;
    private javax.swing.JLabel labelUnidadesArticulo;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JLabel labelUsuariosRegistrados;
    private javax.swing.JLabel labelVerifiqueClave;
    private javax.swing.JPanel panelCreacionPacks;
    private javax.swing.JPanel panelDatosArticulos;
    private javax.swing.JPanel panelDatosBanco;
    private javax.swing.JPanel panelDatosCanal;
    private javax.swing.JPanel panelDatosCategoriaArticulos;
    private javax.swing.JPanel panelDatosCliente;
    private javax.swing.JPanel panelDatosComunas;
    private javax.swing.JPanel panelDatosEstadoVentas;
    private javax.swing.JPanel panelDatosProveedores;
    private javax.swing.JPanel panelDatosUsuario;
    private javax.swing.JPanel panelTablaArticulos;
    private javax.swing.JPanel panelTablaBancos;
    private javax.swing.JScrollPane panelTablaCanales;
    private javax.swing.JPanel panelTablaCategoriaArticulos;
    private javax.swing.JPanel panelTablaClientes;
    private javax.swing.JPanel panelTablaComunas;
    private javax.swing.JPanel panelTablaEstadoVenta;
    private javax.swing.JPanel panelTablaPacks;
    private javax.swing.JPanel panelTablaProveedores;
    private javax.swing.JPanel panelTablaUsuarios;
    private javax.swing.JScrollPane scrollPaneArticulos;
    private javax.swing.JScrollPane scrollPanelArticulosPack;
    private javax.swing.JScrollPane scrollPanelPack;
    private javax.swing.JScrollPane scrollPanelPacks;
    private javax.swing.JScrollPane scrollTablaBancos;
    private javax.swing.JScrollPane scrollTablaCategoriaArticulos;
    private javax.swing.JScrollPane scrollTablaClientes;
    private javax.swing.JScrollPane scrollTablaComunas;
    private javax.swing.JScrollPane scrollTablaEstadoVentas;
    private javax.swing.JScrollPane scrollTablaProveedores;
    private javax.swing.JScrollPane scrolltablaUsuario;
    private javax.swing.JTable tablaArticulos;
    private javax.swing.JTable tablaBancos;
    private javax.swing.JTable tablaCanales;
    private javax.swing.JTable tablaCategoriaArticulos;
    private javax.swing.JTable tablaClientes;
    public javax.swing.JTable tablaComunas;
    private javax.swing.JTable tablaEstadoVentas;
    private javax.swing.JTable tablaPacks;
    private javax.swing.JTable tablaProveedores;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JTextField txtArticulosNombre;
    private javax.swing.JTextField txtArticulosUnidads;
    private javax.swing.JTextField txtBuscarBanco;
    private javax.swing.JTextField txtBuscarCanal;
    private javax.swing.JTextField txtBuscarCategoriaArticulo;
    private javax.swing.JTextField txtBuscarCliente;
    public javax.swing.JTextField txtBuscarComuna;
    private javax.swing.JTextField txtBuscarPack;
    private javax.swing.JTextField txtBuscarUsuario;
    private javax.swing.JTextField txtBuscarVenta;
    private javax.swing.JTextField txtCategoriaArticulos;
    private javax.swing.JTextField txtClientesCelular;
    private javax.swing.JTextField txtClientesEmail;
    private javax.swing.JFormattedTextField txtClientesFechaNacimiento;
    private javax.swing.JTextField txtClientesNombre;
    private javax.swing.JTextField txtClientesRut;
    private javax.swing.JTextField txtClientesTelefono;
    private javax.swing.JTextField txtCodigoArticulos;
    private javax.swing.JTextField txtCodigoBanco;
    private javax.swing.JTextField txtCodigoCanal;
    private javax.swing.JTextField txtCodigoCategoriaArticulo;
    public javax.swing.JTextField txtCodigoComuna;
    private javax.swing.JTextField txtCodigoEstadoVenta;
    private javax.swing.JTextField txtDigitoVerificadorRut;
    private javax.swing.JTextField txtEstadoVentas;
    private javax.swing.JTextField txtFechaVencimientoArticulo;
    private javax.swing.JPasswordField txtIngreseClave;
    private javax.swing.JTextField txtMarcaArticulos;
    private javax.swing.JTextField txtNombreBanco;
    private javax.swing.JTextField txtNombreCanal;
    public javax.swing.JTextField txtNombreComuna;
    private javax.swing.JTextField txtNombrePack;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtPrecioPack;
    private javax.swing.JTextField txtProveedoresBuscar;
    private javax.swing.JTextField txtProveedoresDireccion;
    private javax.swing.JTextField txtProveedoresEmail;
    private javax.swing.JTextField txtProveedoresNombreContacto;
    private javax.swing.JTextField txtProveedoresRazonSocial;
    private javax.swing.JTextField txtProveedoresRutProveedores;
    private javax.swing.JTextField txtProveedoresTelefono;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JPasswordField txtverifiqueClave;
    private javax.swing.JPanel ventanaArtículos;
    private javax.swing.JPanel ventanaBancos;
    private javax.swing.JPanel ventanaCanales;
    private javax.swing.JPanel ventanaCategoriaArticulo;
    private javax.swing.JPanel ventanaClientes;
    private javax.swing.JPanel ventanaComunas;
    private javax.swing.JPanel ventanaEstadoVentas;
    private javax.swing.JPanel ventanaPacks;
    public javax.swing.JTabbedPane ventanaPrincipal;
    private javax.swing.JPanel ventanaProveedores;
    private javax.swing.JPanel ventanaUsuarios;
    // End of variables declaration//GEN-END:variables
}
