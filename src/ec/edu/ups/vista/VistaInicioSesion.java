/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorTelefono;
import ec.edu.ups.controlador.ControladorUsuario;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author Paul Idrovo
 */
public class VistaInicioSesion extends javax.swing.JInternalFrame {

    private JMenuItem mnAgregarTelefono;
    private JMenuItem mnEditarTelefono;
    private JMenuItem mnMisTelefonos;
    private JMenuItem mnIniciarSesion;
    private JMenuItem mnSalir;
    private JMenuItem mnRegistrarse;
    private JMenuItem mnEliminarTelefono;
    private ControladorTelefono controladorTelefono;
    private ControladorUsuario controladorUsuario;
    private JLabel lblUsuarioLogin;

    public VistaInicioSesion(JMenuItem mnAgregarTelefono, JMenuItem mnEditarTelefono, JMenuItem mnMisTelefonos, JMenuItem mnIniciarSesion,
            JMenuItem mnSalir, JMenuItem mnRegistrarse, JMenuItem mnEliminarTelefono, ControladorUsuario controladorUsuario, ControladorTelefono controladorTelefono, JLabel lblUsuarioLogin) {

        initComponents();

        //ASIGNAR PARAMETROS
        this.controladorTelefono = controladorTelefono;
        this.controladorUsuario = controladorUsuario;
        this.mnAgregarTelefono = mnAgregarTelefono;
        this.mnEditarTelefono = mnEditarTelefono;
        this.mnMisTelefonos = mnMisTelefonos;
        this.mnEliminarTelefono = mnEliminarTelefono;
        this.mnIniciarSesion = mnIniciarSesion;
        this.mnSalir = mnSalir;
        this.mnRegistrarse = mnRegistrarse;
        this.lblUsuarioLogin = lblUsuarioLogin;
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        pswContraseña = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        btIniciar = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setForeground(java.awt.Color.lightGray);
        setTitle("INICIAR SESION");

        lblUsuario.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/iconos/usuario.png"))); // NOI18N
        lblUsuario.setText("USUARIO:");

        lblTitulo.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblTitulo.setText("    INICIO DE SESION");

        lblContraseña.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/iconos/contraseña.png"))); // NOI18N
        lblContraseña.setText("CONTRASEÑA:");

        pswContraseña.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        pswContraseña.setMinimumSize(new java.awt.Dimension(90, 30));
        pswContraseña.setPreferredSize(new java.awt.Dimension(90, 30));

        txtUsuario.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtUsuario.setMaximumSize(new java.awt.Dimension(90, 30));
        txtUsuario.setMinimumSize(new java.awt.Dimension(90, 30));
        txtUsuario.setPreferredSize(new java.awt.Dimension(90, 30));

        btIniciar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btIniciar.setText("INICIAR SESION");
        btIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btIniciar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblContraseña))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pswContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblTitulo)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContraseña)
                    .addComponent(pswContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btIniciar)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIniciarActionPerformed
        // TODO add your handling code here:

        String contraseñaDeco = "";
        char[] password = pswContraseña.getPassword();
        for (int x = 0; x < password.length; x++) {
            contraseñaDeco += password[x];
        }

        if (txtUsuario.getText().equals("admin") && contraseñaDeco.equals("1234")) {

            mnAgregarTelefono.setEnabled(true);
            mnEditarTelefono.setEnabled(true);
            mnMisTelefonos.setEnabled(true);
            mnEliminarTelefono.setEnabled(true);
            mnIniciarSesion.setEnabled(false);
            mnSalir.setEnabled(true);
            mnRegistrarse.setEnabled(false);
            this.setVisible(false);
            lblUsuarioLogin.setText(txtUsuario.getText().toUpperCase());
            JOptionPane.showMessageDialog(null, "INICIO DE SESION CORRECTO", "LOGIN", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "USUARIO Y/O CONTRASEÑA INCORRECTOS", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btIniciarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btIniciar;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField pswContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
