
package nomiujo2;

import java.awt.MouseInfo;
import java.awt.Point;

public class RegistrarPersonal extends javax.swing.JFrame {
int x,y;
    public RegistrarPersonal() {
        initComponents();
                    lblHoras.setVisible(false);
            txtHoras.setVisible(false);
            lblEspecialidad.setVisible(false);
            txtEspecialidad.setVisible(false);
            jcbEdificio.setVisible(false);
            lblEdificio.setVisible(false);
            panelDeducciones.setVisible(false);
            lblCargo.setVisible(false);
            txtCargo.setVisible(false);
            lblSueldoB.setVisible(false);
            txtSueldoB.setVisible(false);

            jrbPrima.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNom1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApe1 = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTlf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        txtIngre = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jcbCargo = new javax.swing.JComboBox();
        lblHoras = new javax.swing.JLabel();
        txtHoras = new javax.swing.JTextField();
        lblEspecialidad = new javax.swing.JLabel();
        txtEspecialidad = new javax.swing.JTextField();
        lblEdificio = new javax.swing.JLabel();
        jcbEdificio = new javax.swing.JComboBox();
        panelDeducciones = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        lblCargo = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        lblSueldoB = new javax.swing.JLabel();
        txtSueldoB = new javax.swing.JTextField();
        jrbPrima = new javax.swing.JRadioButton();
        txtBuscar = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre:");

        jLabel3.setText("Apellido:");

        jLabel5.setText("Cédula/RIF:");

        jLabel8.setText("Numero de tlf:");

        jLabel6.setText("Dirección:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTlf, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNom1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtApe1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtNom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtApe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtTlf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Datos Personales", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(txtIngre, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 21, 149, -1));

        jLabel12.setText("Fecha de ingreso:");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 20, 109, 23));

        jLabel11.setText("Tipo de Personal:");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 54, 109, 23));

        jcbCargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", "Planta", "Docente" }));
        jcbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCargoActionPerformed(evt);
            }
        });
        jPanel5.add(jcbCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 54, 149, -1));

        lblHoras.setText("Horas de trabajo:");
        jPanel5.add(lblHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 91, 107, -1));
        jPanel5.add(txtHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 88, 64, -1));

        lblEspecialidad.setText("Especialidad:        ");
        jPanel5.add(lblEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 117, -1, -1));
        jPanel5.add(txtEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 147, -1));

        lblEdificio.setText("Edificio:      ");
        jPanel5.add(lblEdificio, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 148, -1, -1));

        jcbEdificio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", "Jose Manuel Velaz", "...", "..." }));
        jcbEdificio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEdificioActionPerformed(evt);
            }
        });
        jPanel5.add(jcbEdificio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 148, 147, -1));

        panelDeducciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Deducciones"));

        jRadioButton1.setText("SSO");

        jRadioButton2.setText("FAOV");

        jRadioButton7.setText("CAPIUJO");

        javax.swing.GroupLayout panelDeduccionesLayout = new javax.swing.GroupLayout(panelDeducciones);
        panelDeducciones.setLayout(panelDeduccionesLayout);
        panelDeduccionesLayout.setHorizontalGroup(
            panelDeduccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeduccionesLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jRadioButton2)
                .addGap(38, 38, 38)
                .addComponent(jRadioButton7)
                .addGap(31, 31, 31))
        );
        panelDeduccionesLayout.setVerticalGroup(
            panelDeduccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeduccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDeduccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton7))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel5.add(panelDeducciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        lblCargo.setText("Cargo:");
        jPanel5.add(lblCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 30));
        jPanel5.add(txtCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 150, -1));

        lblSueldoB.setText("Sueldo Base");
        jPanel5.add(lblSueldoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));
        jPanel5.add(txtSueldoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 150, -1));

        jrbPrima.setText("Prima");
        jrbPrima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbPrimaActionPerformed(evt);
            }
        });
        jPanel5.add(jrbPrima, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jTabbedPane1.addTab("Datos Laborales", jPanel5);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 350, 350));

        txtBuscar.setToolTipText("Introduzca la cedula");
        txtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscarMouseClicked(evt);
            }
        });
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 140, 30));

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        jButton4.setToolTipText("Buscar");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 60, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        jButton1.setToolTipText("Guardar");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 50, 50));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar pp.png"))); // NOI18N
        jButton3.setToolTipText("Limpiar");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 50, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search_48.png"))); // NOI18N
        jButton5.setToolTipText("Consultar");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/volver.png"))); // NOI18N
        jButton2.setToolTipText("Volver");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 60, 60));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Textures-Texture-Bamboo-Fondos--1080x1920.jpg"))); // NOI18N
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel36MousePressed(evt);
            }
        });
        jLabel36.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel36MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCargoActionPerformed
        if(jcbCargo.getSelectedItem().equals("Docente")){
            lblHoras.setVisible(true);
            txtHoras.setVisible(true);
            lblEspecialidad.setVisible(true);
            txtEspecialidad.setVisible(true);
            jcbEdificio.setVisible(true);
            lblEdificio.setVisible(true);
            panelDeducciones.setVisible(true);
            lblCargo.setVisible(false);
            txtCargo.setVisible(false);
            lblSueldoB.setVisible(false);
            txtSueldoB.setVisible(false);

            jrbPrima.setVisible(false);
        }
        if(jcbCargo.getSelectedItem().equals("Planta")){
            lblCargo.setVisible(true);
            txtCargo.setVisible(true);
            lblSueldoB.setVisible(true);
            txtSueldoB.setVisible(true);
            jcbEdificio.setVisible(true);
            lblEdificio.setVisible(true);
            panelDeducciones.setVisible(true);
            jrbPrima.setVisible(true);
            lblHoras.setVisible(false);
            txtHoras.setVisible(false);
            lblEspecialidad.setVisible(false);
            txtEspecialidad.setVisible(false);
        }
        if(jcbCargo.getSelectedItem().equals("Seleccione...")){
            lblHoras.setVisible(false);
            txtHoras.setVisible(false);
            lblEspecialidad.setVisible(false);
            txtEspecialidad.setVisible(false);
            jcbEdificio.setVisible(false);
            lblEdificio.setVisible(false);
            panelDeducciones.setVisible(false);
            lblCargo.setVisible(false);
            txtCargo.setVisible(false);
            lblSueldoB.setVisible(false);
            txtSueldoB.setVisible(false);

            jrbPrima.setVisible(false);
        }
    }//GEN-LAST:event_jcbCargoActionPerformed

    private void jcbEdificioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEdificioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbEdificioActionPerformed

    private void jrbPrimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbPrimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbPrimaActionPerformed

    private void txtBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMouseClicked
        txtBuscar.setText("");
    }//GEN-LAST:event_txtBuscarMouseClicked

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        char a=evt.getKeyChar();
        if(a<'0'||a>'9') evt.consume();
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     /*   try{
            nom1=txtNom1.getText();

            ape1=txtApe1.getText();

            cedula=txtCedula.getText();
            direc=txtDireccion.getText();
            ingre=txtIngre.getText();

            tlf=txtTlf.getText();
            cargo=(String) jcbCargo.getSelectedItem();
            JOptionPane.showMessageDialog(null, "¡Los datos se han guardado exitosamente!");
            txtNom1.setText("");

            txtTlf.setText("");
            txtApe1.setText("");

            txtCedula.setText("");
            txtDireccion.setText("");
            txtIngre.setText("");

            jcbCargo.setSelectedItem("Seleccione...");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "¡Error al guardar los datos!");
        }
*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        txtNom1.setText("");

        txtTlf.setText("");
        txtApe1.setText("");

        txtCedula.setText("");
        txtDireccion.setText("");
        txtIngre.setText("");

        jcbCargo.setSelectedItem("Seleccione...");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Personal p=new Personal();
        p.setLocationRelativeTo(p);
        p.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel36MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MousePressed
        x=evt.getX();
        y=evt.getY();
    }//GEN-LAST:event_jLabel36MousePressed

    private void jLabel36MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseDragged
        Point point =MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x-x,point.y-y);
    }//GEN-LAST:event_jLabel36MouseDragged

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
            java.util.logging.Logger.getLogger(RegistrarPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarPersonal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JComboBox jcbCargo;
    private javax.swing.JComboBox jcbCargo1;
    private javax.swing.JComboBox jcbCargo2;
    private javax.swing.JComboBox jcbCargo3;
    private javax.swing.JComboBox jcbCargo4;
    private javax.swing.JComboBox jcbEdificio;
    private javax.swing.JRadioButton jrbPrima;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblEdificio;
    private javax.swing.JLabel lblEspecialidad;
    private javax.swing.JLabel lblHoras;
    private javax.swing.JLabel lblSueldoB;
    private javax.swing.JPanel panelDeducciones;
    private javax.swing.JTextField txtApe1;
    private javax.swing.JTextField txtApe2;
    private javax.swing.JTextField txtApe3;
    private javax.swing.JTextField txtApe4;
    private javax.swing.JTextField txtApe5;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCedula1;
    private javax.swing.JTextField txtCedula2;
    private javax.swing.JTextField txtCedula3;
    private javax.swing.JTextField txtCedula4;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDireccion1;
    private javax.swing.JTextField txtDireccion2;
    private javax.swing.JTextField txtDireccion3;
    private javax.swing.JTextField txtDireccion4;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JTextField txtHoras;
    private javax.swing.JTextField txtIngre;
    private javax.swing.JTextField txtIngre1;
    private javax.swing.JTextField txtIngre2;
    private javax.swing.JTextField txtIngre3;
    private javax.swing.JTextField txtIngre4;
    private javax.swing.JTextField txtNom1;
    private javax.swing.JTextField txtNom2;
    private javax.swing.JTextField txtNom3;
    private javax.swing.JTextField txtNom4;
    private javax.swing.JTextField txtNom5;
    private javax.swing.JTextField txtSueldoB;
    private javax.swing.JTextField txtTlf;
    private javax.swing.JTextField txtTlf1;
    private javax.swing.JTextField txtTlf2;
    private javax.swing.JTextField txtTlf3;
    private javax.swing.JTextField txtTlf4;
    // End of variables declaration//GEN-END:variables
}
