/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorTelefono;
import ec.edu.ups.controlador.ControladorUsuario;
import ec.edu.ups.modelo.Telefono;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Paul Idrovo
 */
public class VistaMiDirectorio extends javax.swing.JInternalFrame {

    private ControladorTelefono controladorTelefono;
    private ControladorUsuario controladorUsuario;

    public VistaMiDirectorio(ControladorUsuario controladorUsuario, ControladorTelefono controladorTelefono) {
        initComponents();
        this.controladorTelefono = controladorTelefono;
        this.controladorUsuario = controladorUsuario;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbOperadora = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        cmbTipo = new javax.swing.JComboBox<>();
        btAgregar = new javax.swing.JButton();
        txtNumero = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtCodigoEditar = new javax.swing.JTextField();
        cmbTipoEditar = new javax.swing.JComboBox<>();
        btEditar = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();
        cmbOperadoraEditar = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNumeroEditar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDirectorio = new javax.swing.JTable();
        txtCodigoBuscar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btBuscar = new javax.swing.JButton();
        btListarTodos = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("MI DIRECTORIO");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AGREGAR TELEFONO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N

        cmbOperadora.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmbOperadora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "MOVISTAR", "CLARO", "CNT", "TUENTI", "ETAPA" }));

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

        cmbTipo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "FIJO", "MOVIL", "FAX", "CASA", "TRABAJO", "FAX CASA", "FAX TRABAJO", "LOCALIZADOR" }));

        btAgregar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btAgregar.setText("AGREGAR");
        btAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarActionPerformed(evt);
            }
        });

        txtNumero.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(btAgregar)
                        .addGap(205, 205, 205))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(81, 81, 81)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigo)
                                    .addComponent(cmbTipo, 0, 261, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbOperadora, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNumero))))
                        .addGap(56, 56, 56))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbTipo))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(txtNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                    .addComponent(cmbOperadora))
                .addGap(20, 20, 20)
                .addComponent(btAgregar)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EDITAR TELEFONO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setText("OPERADORA");

        txtCodigoEditar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtCodigoEditar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoEditarKeyTyped(evt);
            }
        });

        cmbTipoEditar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmbTipoEditar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "FIJO", "MOVIL", "OTRO" }));
        cmbTipoEditar.setEnabled(false);

        btEditar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btEditar.setText("EDITAR");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btGuardar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btGuardar.setText("GUARDAR");
        btGuardar.setEnabled(false);
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        cmbOperadoraEditar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmbOperadoraEditar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "MOVISTAR", "CLARO", "CNT", "TUENTI", "ETAPA", "OTRO" }));
        cmbOperadoraEditar.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setText("NUMERO");

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setText("CODIGO");

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel12.setText("TIPO");

        txtNumeroEditar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtNumeroEditar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroEditarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10))
                .addGap(80, 80, 80)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbTipoEditar, 0, 247, Short.MAX_VALUE)
                    .addComponent(txtNumeroEditar))
                .addGap(40, 40, 40))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(jLabel11)
                            .addGap(79, 79, 79)
                            .addComponent(txtCodigoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(btEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(53, 53, 53)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(btGuardar)
                                    .addGap(156, 156, 156))
                                .addComponent(cmbOperadoraEditar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGap(41, 41, 41)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTipoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroEditar))
                .addGap(101, 101, 101))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodigoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(86, 86, 86)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(cmbOperadoraEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DIRECTORIO PERSONAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14))); // NOI18N

        tblDirectorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Numero", "Tipo", "Operadora"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDirectorio);

        txtCodigoBuscar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText("CODIGO:");

        btBuscar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btBuscar.setText("BUSCAR");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        btListarTodos.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btListarTodos.setText("MI DIRECTORIO");
        btListarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarTodosActionPerformed(evt);
            }
        });

        btEliminar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btEliminar.setText("ELIMINAR TELEFONO");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodigoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btBuscar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btListarTodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCodigoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btBuscar)
                        .addGap(34, 34, 34)
                        .addComponent(btListarTodos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btEliminar)
                        .addGap(279, 279, 279))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        char validar = evt.getKeyChar();
        int asscii = (int) validar;
        if (!Character.isDigit(validar) && asscii != 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "INGRESE SOLO NUMEROS", "ERROR DE DATOS", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed
        if (txtCodigo.getText().equals("") || txtNumero.getText().equals("")
                || cmbTipo.getSelectedItem().toString().equals("SELECCIONAR") || cmbOperadora.getSelectedItem().toString().equals("SELECCIONAR")) {
            JOptionPane.showMessageDialog(null, "LLENE TODOS LOS CAMPOS", "AGREGADO", JOptionPane.ERROR_MESSAGE);
        } else {
            controladorUsuario.agregarTelefono(Integer.valueOf(txtCodigo.getText()), txtNumero.getText(),
                    cmbTipo.getSelectedItem().toString(), cmbOperadora.getSelectedItem().toString());
            JOptionPane.showMessageDialog(null, "TELEFONO AGREGADO CORRECTAMENTE", "AGREGADO", JOptionPane.INFORMATION_MESSAGE);
            txtCodigo.setText("");
            txtNumero.setText("");
            cmbTipo.setSelectedIndex(0);
            cmbOperadora.setSelectedIndex(0);
            ActualizarTabla();
        }
    }//GEN-LAST:event_btAgregarActionPerformed

    private void txtCodigoEditarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoEditarKeyTyped
        char validar = evt.getKeyChar();
        int asscii = (int) validar;
        if (!Character.isDigit(validar) && asscii != 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "INGRESE SOLO NUMEROS", "ERROR DE DATOS", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtCodigoEditarKeyTyped

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed

        Telefono editarTelefono = controladorTelefono.verTelefono(Integer.valueOf(txtCodigoEditar.getText()));

        if (editarTelefono != null) {
            txtCodigoEditar.setEnabled(false);
            txtNumeroEditar.setEnabled(true);
            cmbTipoEditar.setEnabled(true);
            cmbOperadoraEditar.setEnabled(true);
            txtNumeroEditar.setText(editarTelefono.getNumero());
            btGuardar.setEnabled(true);
            btEditar.setEnabled(false);
            switch (editarTelefono.getTipo()) {
                case "MOVIL":
                    cmbTipoEditar.setSelectedIndex(2);
                    break;
                case "FIJO":
                    cmbTipoEditar.setSelectedIndex(1);
                    break;
                default:
                    cmbTipoEditar.setSelectedIndex(3);
                    break;
            }
            switch (editarTelefono.getOperadora()) {
                case "MOVISTAR":
                    cmbOperadoraEditar.setSelectedIndex(1);
                    break;
                case "CLARO":
                    cmbOperadoraEditar.setSelectedIndex(2);
                    break;
                case "CNT":
                    cmbOperadoraEditar.setSelectedIndex(3);
                    break;
                case "TUENTI":
                    cmbOperadoraEditar.setSelectedIndex(4);
                    break;
                case "ETAPA":
                    cmbOperadoraEditar.setSelectedIndex(5);
                    break;
                default:
                    cmbOperadoraEditar.setSelectedIndex(6);
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "NO EXISTE NINGUN NUMERO CON ESE CODIGO", "ERROR DE DATOS", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        if (txtCodigoEditar.getText().equals("") || txtNumeroEditar.getText().equals("")
                || cmbTipoEditar.getSelectedItem().toString().equals("SELECCIONAR") || cmbOperadoraEditar.getSelectedItem().toString().equals("SELECCIONAR")) {
            JOptionPane.showMessageDialog(null, "LLENE TODOS LOS CAMPOS", "EDITAR", JOptionPane.ERROR_MESSAGE);
        } else {
            controladorUsuario.actualizarTelefono(Integer.valueOf(txtCodigoEditar.getText()), txtNumeroEditar.getText(),
                    cmbTipoEditar.getSelectedItem().toString(), cmbOperadoraEditar.getSelectedItem().toString());

            JOptionPane.showMessageDialog(null, "TELEFONO AGREGADO CORRECTAMENTE", "AGREGADO", JOptionPane.INFORMATION_MESSAGE);
            txtCodigoEditar.setText("");
            txtNumeroEditar.setText("");
            cmbTipoEditar.setSelectedIndex(0);
            cmbOperadoraEditar.setSelectedIndex(0);
            txtCodigoEditar.setEnabled(true);
            txtNumeroEditar.setEnabled(false);
            cmbTipoEditar.setEnabled(false);
            cmbOperadoraEditar.setEnabled(false);
            btGuardar.setEnabled(false);
            btEditar.setEnabled(true);
            ActualizarTabla();
        }
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btListarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarTodosActionPerformed
        ActualizarTabla();
    }//GEN-LAST:event_btListarTodosActionPerformed

    public void ActualizarTabla(){
        List<Telefono> listaTelefonos = controladorUsuario.verTelefonos();

        DefaultTableModel modelo = (DefaultTableModel) tblDirectorio.getModel();
        modelo.setRowCount(0);
        tblDirectorio.setModel(modelo);
        Object[] fila = new Object[4];

        for (Telefono telefono : listaTelefonos) {
            fila[0] = telefono.getCodigo();
            fila[1] = telefono.getNumero();
            fila[2] = telefono.getTipo();
            fila[3] = telefono.getOperadora();
            modelo.addRow(fila);
        }
        this.tblDirectorio.setModel(modelo);
    }
    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tblDirectorio.getModel();
        if (tblDirectorio.getSelectedRow() != -1) {
            int confirmar = JOptionPane.showConfirmDialog(null, "ELIMINAR EL TELEFONO SELECCIONADO?");
            if (JOptionPane.OK_OPTION == confirmar) {
                int fila = tblDirectorio.getSelectedRow();
                int codigo = Integer.valueOf(tblDirectorio.getValueAt(fila, 0).toString());
                controladorUsuario.eliminarTelefono(codigo);
                ActualizarTabla();
                JOptionPane.showMessageDialog(null, "TELEFONO ELIMINADO", "ERROR", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "NO SE HA SELECCIONADO NINGUN TELEFONO PARA ELIMINAR", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btEliminarActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        Telefono telefonoBuscado = controladorTelefono.verTelefono(Integer.valueOf(txtCodigo.getText()));

        DefaultTableModel modelo = (DefaultTableModel) tblDirectorio.getModel();
        modelo.setRowCount(0);
        tblDirectorio.setModel(modelo);

        Object[] fila = new Object[4];
        fila[0] = telefonoBuscado.getCodigo();
        fila[1] = telefonoBuscado.getNumero();
        fila[2] = telefonoBuscado.getTipo();
        fila[3] = telefonoBuscado.getOperadora();

        modelo.addRow(fila);

        this.tblDirectorio.setModel(modelo);

    }//GEN-LAST:event_btBuscarActionPerformed

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        char validar = evt.getKeyChar();
        int asscii = (int) validar;
        if (!Character.isDigit(validar) && asscii != 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "INGRESE SOLO NUMEROS", "ERROR DE DATOS", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtNumeroKeyTyped

    private void txtNumeroEditarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroEditarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroEditarKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btListarTodos;
    private javax.swing.JComboBox<String> cmbOperadora;
    private javax.swing.JComboBox<String> cmbOperadoraEditar;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JComboBox<String> cmbTipoEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDirectorio;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoBuscar;
    private javax.swing.JTextField txtCodigoEditar;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtNumeroEditar;
    // End of variables declaration//GEN-END:variables
}
