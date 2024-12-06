package capaPresentacion;

import capaNegocio.clsUsuario;
import javax.swing.JOptionPane;

/**
 *
 * INTEGRANTES: - Ching Ayacila, Jonatan - Chapoñan Paico, Jesus - Pupuche
 * Adrianzen, Rodrigho
 *
 */
public class FrmIniciarSesion extends javax.swing.JFrame {
    
    private clsUsuario usuario;
    
    public FrmIniciarSesion() {
        initComponents();
        usuario = new clsUsuario();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblIniciarSesion = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        chkRecuerdame = new javax.swing.JCheckBox();
        btnRegistrarse = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnCerrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JButton();
        btnOlvidasteContra1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar Sesión");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(164, 48, 51));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo-400.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 600));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIniciarSesion.setBackground(new java.awt.Color(255, 255, 255));
        lblIniciarSesion.setFont(new java.awt.Font("Candara Light", 1, 42)); // NOI18N
        lblIniciarSesion.setForeground(new java.awt.Color(0, 0, 0));
        lblIniciarSesion.setText("Iniciar Sesión");
        jPanel2.add(lblIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        lblUsuario.setBackground(new java.awt.Color(255, 255, 255));
        lblUsuario.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario.setText("Email");
        jPanel2.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        lblContraseña.setBackground(new java.awt.Color(255, 255, 255));
        lblContraseña.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(0, 0, 0));
        lblContraseña.setText("Contraseña");
        jPanel2.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        txtEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEmail.setText("Ingresar Email");
        txtEmail.setBorder(null);
        txtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEmailMouseClicked(evt);
            }
        });
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 260, 40));

        txtContraseña.setText("Ingresarusario");
        txtContraseña.setBorder(null);
        txtContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContraseñaMouseClicked(evt);
            }
        });
        jPanel2.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 250, 40));

        chkRecuerdame.setBackground(new java.awt.Color(255, 255, 255));
        chkRecuerdame.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        chkRecuerdame.setForeground(new java.awt.Color(0, 0, 0));
        chkRecuerdame.setText("Recuerdame");
        chkRecuerdame.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(chkRecuerdame, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 100, -1));

        btnRegistrarse.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrarse.setText("Registrate al sistema");
        btnRegistrarse.setBorder(null);
        btnRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarse.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 120, 20));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 300, 10));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 120, 20));

        btnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnCancelar.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 0, 35, 34));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 40, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lock.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 30, 40));

        btnIniciarSesion.setBackground(new java.awt.Color(164, 48, 51));
        btnIniciarSesion.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setText("Iniciar Sesión");
        btnIniciarSesion.setToolTipText("");
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        jPanel2.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 300, 36));

        btnOlvidasteContra1.setBackground(new java.awt.Color(255, 255, 255));
        btnOlvidasteContra1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnOlvidasteContra1.setForeground(new java.awt.Color(0, 0, 0));
        btnOlvidasteContra1.setText("¿Olvidaste tu contraseña?");
        btnOlvidasteContra1.setBorder(null);
        btnOlvidasteContra1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOlvidasteContra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOlvidasteContra1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnOlvidasteContra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 160, 20));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 300, 10));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 400, 600));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 491));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailMouseClicked
        txtEmail.setText("");
    }//GEN-LAST:event_txtEmailMouseClicked

    private void txtContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMouseClicked
        txtContraseña.setText("");
    }//GEN-LAST:event_txtContraseñaMouseClicked

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        FrmRegistrarse objRegistrarse = new FrmRegistrarse();
        objRegistrarse.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        String email = txtEmail.getText();
        String password = new String(txtContraseña.getPassword());
        
        try {
            String tipoUsuario = usuario.autenticarUsuario(email, password);
            if (tipoUsuario != null) {
                if (tipoUsuario.equals("Cliente")) {
                    // Mostrar el formulario de cliente
                    FrmMenuCliente menuCliente = new FrmMenuCliente();
                    menuCliente.setVisible(true);
                } else if (tipoUsuario.equals("Administrador")) {
                    // Mostrar el formulario de administrador
                    FrmMenuAdministrador menuAdministrador = new FrmMenuAdministrador();
                    menuAdministrador.setVisible(true);
                }
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Email o contraseña incorrectos", "Error de Autenticación", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al iniciar sesión: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnOlvidasteContra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOlvidasteContra1ActionPerformed
        JOptionPane.showMessageDialog(this, "Contáctate con uno de nuestros administradores");
    }//GEN-LAST:event_btnOlvidasteContra1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnOlvidasteContra1;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JCheckBox chkRecuerdame;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblIniciarSesion;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
