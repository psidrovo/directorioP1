/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorTelefono;
import ec.edu.ups.controlador.ControladorUsuario;
import ec.edu.ups.dao.TelefonoDao;
import ec.edu.ups.dao.UsuarioDao;
import ec.edu.ups.modelo.Usuario;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author Paul Idrovo
 */
public class VistaPrincipalApp extends javax.swing.JFrame {

    //Vista
    private VistaInicioSesion inicioSesion;
    private VistaDirectorioGeneral directorioGeneral;
    private VistaAgregarTelefono agregarTelefono;
    private VistaEditarTelefono editarTelefono;
    private VistaMisTelefonos misTelefonos;
    private VistaRegistrar resgistrar;
    //Dao
    private TelefonoDao daoTelefono;
    private UsuarioDao daoUsuario;
    //Controlador
    private ControladorTelefono controladorTelefono;
    private ControladorUsuario controladorUsuario;

    public VistaPrincipalApp() {
        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize);
        lblFondo.setSize(screenSize);
        lblTitulo.setBounds(10, (int) screenSize.getHeight() - 200, 1000, 40);
        lblUsuarioLogin.setBounds(10, (int) screenSize.getHeight() - 275, 1500, 40);
        //CREAR DAO Y CONTROLADORES
        daoTelefono = new TelefonoDao();
        daoUsuario = new UsuarioDao();
        controladorTelefono = new ControladorTelefono(daoTelefono);
        controladorUsuario = new ControladorUsuario(daoUsuario, daoTelefono);

        //CREAR VISTAS
        agregarTelefono = new VistaAgregarTelefono(controladorUsuario, controladorTelefono);
        inicioSesion = new VistaInicioSesion(mnAgregarTelefono, mnEditarTelefono, mnMisTelefonos, mnIniciarSesion, mnEliminarTelefono, mnCerrarSesion, mnRegistrarse, mnCerrarSesion, controladorUsuario, controladorTelefono, lblUsuarioLogin);
        directorioGeneral = new VistaDirectorioGeneral(controladorUsuario, controladorTelefono);
        editarTelefono = new VistaEditarTelefono(controladorUsuario, controladorTelefono);
        misTelefonos = new VistaMisTelefonos(controladorUsuario, controladorTelefono);
        resgistrar = new VistaRegistrar(controladorUsuario, controladorTelefono);

        //Agregar Panel
        desktopPane.add(inicioSesion);
        desktopPane.add(directorioGeneral);
        desktopPane.add(agregarTelefono);
        desktopPane.add(editarTelefono);
        desktopPane.add(misTelefonos);
        desktopPane.add(resgistrar);

        //Posicion
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        lblFondo = new javax.swing.JLabel();
        lblUsuarioLogin = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        mnIniciarSesion = new javax.swing.JMenuItem();
        mnRegistrarse = new javax.swing.JMenuItem();
        mnCerrarSesion = new javax.swing.JMenuItem();
        mnSalirP = new javax.swing.JMenuItem();
        mnEliminarTelefono = new javax.swing.JMenu();
        mnDirectorioGeneral = new javax.swing.JMenuItem();
        mnAgregarTelefono = new javax.swing.JMenuItem();
        mnEditarTelefono = new javax.swing.JMenuItem();
        mnMisTelefonos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DIRECTORIO TELEFONICO");

        desktopPane.setBackground(new java.awt.Color(255, 255, 255));
        desktopPane.setPreferredSize(new java.awt.Dimension(2147483647, 2147483647));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/fondo/fondo.png"))); // NOI18N
        desktopPane.add(lblFondo);
        lblFondo.setBounds(560, 10, 30, 30);

        lblUsuarioLogin.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        lblUsuarioLogin.setText("BIENVENIDO");
        desktopPane.add(lblUsuarioLogin);
        lblUsuarioLogin.setBounds(70, 250, 450, 40);

        lblTitulo.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        lblTitulo.setText("DIRECTORIO TELEFONICO UPS");
        desktopPane.add(lblTitulo);
        lblTitulo.setBounds(70, 180, 450, 60);

        menuBar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        fileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/iconos/power.png"))); // NOI18N
        fileMenu.setMnemonic('f');
        fileMenu.setText("INICIO");

        mnIniciarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/iconos/usuario (1).png"))); // NOI18N
        mnIniciarSesion.setMnemonic('o');
        mnIniciarSesion.setText("Iniciar Sesion");
        mnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnIniciarSesionActionPerformed(evt);
            }
        });
        fileMenu.add(mnIniciarSesion);

        mnRegistrarse.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnRegistrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/iconos/anadir.png"))); // NOI18N
        mnRegistrarse.setMnemonic('s');
        mnRegistrarse.setText("Registrarse");
        mnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRegistrarseActionPerformed(evt);
            }
        });
        fileMenu.add(mnRegistrarse);

        mnCerrarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/iconos/cerrar-sesion.png"))); // NOI18N
        mnCerrarSesion.setMnemonic('s');
        mnCerrarSesion.setText("Finalizar Sesion");
        mnCerrarSesion.setEnabled(false);
        mnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCerrarSesionActionPerformed(evt);
            }
        });
        fileMenu.add(mnCerrarSesion);

        mnSalirP.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_SPACE, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnSalirP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/iconos/cerrar.png"))); // NOI18N
        mnSalirP.setMnemonic('s');
        mnSalirP.setText("Salir");
        mnSalirP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSalirPActionPerformed(evt);
            }
        });
        fileMenu.add(mnSalirP);

        menuBar.add(fileMenu);

        mnEliminarTelefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/iconos/directorio.png"))); // NOI18N
        mnEliminarTelefono.setMnemonic('e');
        mnEliminarTelefono.setText("MENU DIRECTORIO");

        mnDirectorioGeneral.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnDirectorioGeneral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/iconos/agenda.png"))); // NOI18N
        mnDirectorioGeneral.setMnemonic('t');
        mnDirectorioGeneral.setText("Directorio General");
        mnDirectorioGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDirectorioGeneralActionPerformed(evt);
            }
        });
        mnEliminarTelefono.add(mnDirectorioGeneral);

        mnAgregarTelefono.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnAgregarTelefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/iconos/anadir (1).png"))); // NOI18N
        mnAgregarTelefono.setMnemonic('y');
        mnAgregarTelefono.setText("Agregar Telefono");
        mnAgregarTelefono.setEnabled(false);
        mnAgregarTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAgregarTelefonoActionPerformed(evt);
            }
        });
        mnEliminarTelefono.add(mnAgregarTelefono);

        mnEditarTelefono.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnEditarTelefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/iconos/editar-telefono.png"))); // NOI18N
        mnEditarTelefono.setMnemonic('p');
        mnEditarTelefono.setText("Editar Telefono");
        mnEditarTelefono.setEnabled(false);
        mnEditarTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEditarTelefonoActionPerformed(evt);
            }
        });
        mnEliminarTelefono.add(mnEditarTelefono);

        mnMisTelefonos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnMisTelefonos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/iconos/directorio-telefonico.png"))); // NOI18N
        mnMisTelefonos.setMnemonic('d');
        mnMisTelefonos.setText("Ver mis telefonos");
        mnMisTelefonos.setEnabled(false);
        mnMisTelefonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnMisTelefonosActionPerformed(evt);
            }
        });
        mnEliminarTelefono.add(mnMisTelefonos);

        menuBar.add(mnEliminarTelefono);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ocultar() {
        agregarTelefono.setVisible(false);
        inicioSesion.setVisible(false);
        directorioGeneral.setVisible(false);
        editarTelefono.setVisible(false);
        misTelefonos.setVisible(false);
        resgistrar.setVisible(false);
    }
    private void mnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnIniciarSesionActionPerformed
        ocultar();
        inicioSesion.setVisible(true);
    }//GEN-LAST:event_mnIniciarSesionActionPerformed

    private void mnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRegistrarseActionPerformed
        ocultar();
        resgistrar.setVisible(true);
    }//GEN-LAST:event_mnRegistrarseActionPerformed

    private void mnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCerrarSesionActionPerformed
        ocultar();
        mnAgregarTelefono.setEnabled(false);
        mnEditarTelefono.setEnabled(false);
        mnMisTelefonos.setEnabled(false);
        mnCerrarSesion.setEnabled(false);
        mnEliminarTelefono.setEnabled(false);
        mnIniciarSesion.setEnabled(true);
        mnRegistrarse.setEnabled(true);
        lblUsuarioLogin.setText("BIENVENIDO");
    }//GEN-LAST:event_mnCerrarSesionActionPerformed

    private void mnAgregarTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAgregarTelefonoActionPerformed
        ocultar();
        agregarTelefono.setVisible(true);
    }//GEN-LAST:event_mnAgregarTelefonoActionPerformed

    private void mnDirectorioGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDirectorioGeneralActionPerformed
        ocultar();
        directorioGeneral.setVisible(true);
    }//GEN-LAST:event_mnDirectorioGeneralActionPerformed

    private void mnSalirPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSalirPActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnSalirPActionPerformed

    private void mnEditarTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEditarTelefonoActionPerformed
        ocultar();
        editarTelefono.setVisible(true);
    }//GEN-LAST:event_mnEditarTelefonoActionPerformed

    private void mnMisTelefonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnMisTelefonosActionPerformed
        ocultar();
        misTelefonos.setVisible(true);
    }//GEN-LAST:event_mnMisTelefonosActionPerformed

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
            java.util.logging.Logger.getLogger(VistaPrincipalApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipalApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipalApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipalApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        try {
            javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipalApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuarioLogin;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mnAgregarTelefono;
    private javax.swing.JMenuItem mnCerrarSesion;
    private javax.swing.JMenuItem mnDirectorioGeneral;
    private javax.swing.JMenuItem mnEditarTelefono;
    private javax.swing.JMenu mnEliminarTelefono;
    private javax.swing.JMenuItem mnIniciarSesion;
    private javax.swing.JMenuItem mnMisTelefonos;
    private javax.swing.JMenuItem mnRegistrarse;
    private javax.swing.JMenuItem mnSalirP;
    // End of variables declaration//GEN-END:variables

}
