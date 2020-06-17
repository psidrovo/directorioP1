/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorTelefono;
import ec.edu.ups.controlador.ControladorUsuario;
import javax.swing.JOptionPane;

/**
 *
 * @author Paul Idrovo
 */
public class VistaAgregarTelefono extends javax.swing.JInternalFrame {

    private ControladorUsuario controladorUsuario;
    private ControladorTelefono controladorTelefono;
    
    public VistaAgregarTelefono(ControladorUsuario controladorUsuario, ControladorTelefono controladorTelefono) {
        initComponents();
        this.controladorUsuario=controladorUsuario;
        this.controladorTelefono=controladorTelefono;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        cmbTipo = new javax.swing.JComboBox<>();
        cmbOperadora = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btAgregar = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setText("NUMERO");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("CODIGO");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("TIPO");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("OPERADORA");

        txtCodigo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });

        txtNumero.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });

        cmbTipo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "FIJO", "MOVIL", "OTRO" }));

        cmbOperadora.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmbOperadora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "MOVISTAR", "CLARO", "CNT", "TUENTI", "OTRO" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("AGREGAR TELEFONO");

        btAgregar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btAgregar.setText("AGREGAR");
        btAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(81, 81, 81)
                        .addComponent(txtCodigo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(79, 79, 79)
                        .addComponent(txtNumero))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(104, 104, 104)
                        .addComponent(cmbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(53, 53, 53)
                        .addComponent(cmbOperadora, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(btAgregar)))
                .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtNumero))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cmbTipo))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cmbOperadora))
                .addGap(20, 20, 20)
                .addComponent(btAgregar)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        char validar = evt.getKeyChar();
        int asscii = (int) validar;
        if (!Character.isDigit(validar) && asscii!=8 ) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "INGRESE SOLO NUMEROS", "ERROR DE DATOS", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        char validar = evt.getKeyChar();
        int asscii = (int) validar;
        if (!Character.isDigit(validar) && asscii != 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "INGRESE SOLO NUMEROS", "ERROR DE DATOS", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtNumeroKeyTyped

    private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed
        JOptionPane.showMessageDialog(null, "TELEFONO AGREGADO CORRECTAMENTE", "AGREGADO", JOptionPane.INFORMATION_MESSAGE);
        txtCodigo.setText("");
        txtNumero.setText("");
        cmbTipo.setSelectedIndex(0);
        cmbOperadora.setSelectedIndex(0);
    }//GEN-LAST:event_btAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregar;
    private javax.swing.JComboBox<String> cmbOperadora;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
