package capaPresentacion;

import javax.swing.JOptionPane;

/**
 *
 * INTEGRANTES Ching Ayacila, Jonatan Chapoñan Paico, Jesus Pupuche Adrianzen,
 * Rodrigho
 *
 *
 */
public class FrmMenuAdministrador extends javax.swing.JFrame {

    public FrmMenuAdministrador() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnPeliculas = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnClientes = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnCines = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnSocios = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnPago = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnVentas = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuPerfil = new javax.swing.JMenu();
        mnuConfig = new javax.swing.JMenuItem();
        mnuCerrar = new javax.swing.JMenuItem();
        mnuMantenimiento = new javax.swing.JMenu();
        mnuManUsuario = new javax.swing.JMenuItem();
        mnuManPelicula = new javax.swing.JMenuItem();
        mnuManCine = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        mnuReportes = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA CINE");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToolBar1.setRollover(true);

        btnPeliculas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cines.png"))); // NOI18N
        btnPeliculas.setText("Peliculas");
        btnPeliculas.setFocusable(false);
        btnPeliculas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPeliculas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnPeliculas);
        jToolBar1.add(jSeparator1);

        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clientes.png"))); // NOI18N
        btnClientes.setText("Usuarios");
        btnClientes.setFocusable(false);
        btnClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnClientes);
        jToolBar1.add(jSeparator2);

        btnCines.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pelicula.png"))); // NOI18N
        btnCines.setText("Cines");
        btnCines.setFocusable(false);
        btnCines.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCines.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnCines);
        jToolBar1.add(jSeparator5);

        btnSocios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/socios.png"))); // NOI18N
        btnSocios.setText("Tipo de Socios");
        btnSocios.setFocusable(false);
        btnSocios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSocios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnSocios);
        jToolBar1.add(jSeparator3);

        btnPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pagos.png"))); // NOI18N
        btnPago.setText("Métodos de Pago");
        btnPago.setFocusable(false);
        btnPago.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPago.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnPago);
        jToolBar1.add(jSeparator4);

        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventas.png"))); // NOI18N
        btnVentas.setText("Ventas");
        btnVentas.setFocusable(false);
        btnVentas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVentas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnVentas);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/admin.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, -1));

        lblHora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 150, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hora.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        lblUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 210, 30));

        lblRol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(lblRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 100, 30));

        jPanel1.setBackground(new java.awt.Color(164, 48, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 324, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(164, 48, 51));

        mnuPerfil.setForeground(new java.awt.Color(255, 255, 255));
        mnuPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfil.png"))); // NOI18N
        mnuPerfil.setText("Perfil");
        mnuPerfil.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        mnuConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ajuste.png"))); // NOI18N
        mnuConfig.setText("Configurar Cuenta");
        mnuConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConfigActionPerformed(evt);
            }
        });
        mnuPerfil.add(mnuConfig);

        mnuCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/apagar.png"))); // NOI18N
        mnuCerrar.setText("Cerrar Sesión");
        mnuCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCerrarActionPerformed(evt);
            }
        });
        mnuPerfil.add(mnuCerrar);

        jMenuBar1.add(mnuPerfil);

        mnuMantenimiento.setForeground(new java.awt.Color(255, 255, 255));
        mnuMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mantenimiento.png"))); // NOI18N
        mnuMantenimiento.setText("Mantenimiento");
        mnuMantenimiento.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        mnuManUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gestionusers.png"))); // NOI18N
        mnuManUsuario.setText("Gestión De Usuario");
        mnuManUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManUsuarioActionPerformed(evt);
            }
        });
        mnuMantenimiento.add(mnuManUsuario);

        mnuManPelicula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gestionpelicula.png"))); // NOI18N
        mnuManPelicula.setText("Gestión De Pelicula");
        mnuManPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManPeliculaActionPerformed(evt);
            }
        });
        mnuMantenimiento.add(mnuManPelicula);

        mnuManCine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gestionCine.png"))); // NOI18N
        mnuManCine.setText("Gestión de Cine");
        mnuManCine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManCineActionPerformed(evt);
            }
        });
        mnuMantenimiento.add(mnuManCine);

        jMenuItem1.setText("Gestión de Sala");
        mnuMantenimiento.add(jMenuItem1);

        jMenuItem2.setText("Gestión de Asientos");
        mnuMantenimiento.add(jMenuItem2);

        jMenuItem3.setText("Gestión de Tarifas");
        mnuMantenimiento.add(jMenuItem3);

        jMenuItem4.setText("Gestión de Funciones");
        mnuMantenimiento.add(jMenuItem4);

        jMenuItem5.setText("Gestión de Entradas");
        mnuMantenimiento.add(jMenuItem5);

        jMenuBar1.add(mnuMantenimiento);

        mnuReportes.setForeground(new java.awt.Color(255, 255, 255));
        mnuReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reporte.png"))); // NOI18N
        mnuReportes.setText("Reportes");
        mnuReportes.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jMenuBar1.add(mnuReportes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuManUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuManUsuarioActionPerformed

    }//GEN-LAST:event_mnuManUsuarioActionPerformed

    private void mnuManPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuManPeliculaActionPerformed
        jdManPelicula objPelicula = new jdManPelicula(this, true);
        objPelicula.setVisible(true);
    }//GEN-LAST:event_mnuManPeliculaActionPerformed

    private void mnuManCineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuManCineActionPerformed

    }//GEN-LAST:event_mnuManCineActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void mnuCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCerrarActionPerformed
        FrmIniciarSesion objInicio = new FrmIniciarSesion();
        objInicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnuCerrarActionPerformed

    private void mnuConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConfigActionPerformed
        JOptionPane.showMessageDialog(this, "Comunícate con uno de nuestros compañeros informáticos", "Información", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_mnuConfigActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCines;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnPago;
    private javax.swing.JButton btnPeliculas;
    private javax.swing.JButton btnSocios;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblRol;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JMenuItem mnuCerrar;
    private javax.swing.JMenuItem mnuConfig;
    private javax.swing.JMenuItem mnuManCine;
    private javax.swing.JMenuItem mnuManPelicula;
    private javax.swing.JMenuItem mnuManUsuario;
    private javax.swing.JMenu mnuMantenimiento;
    private javax.swing.JMenu mnuPerfil;
    private javax.swing.JMenu mnuReportes;
    // End of variables declaration//GEN-END:variables
}
