package nomiujo2;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Acceso extends javax.swing.JFrame {

     int x,y;
     static String usu,contra;
    public Acceso() {
        initComponents();
    }
/*Conexion C=new Conexion();
Connection con=C.conectar();
PreparedStatement stm;*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUsu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtContra = new javax.swing.JPasswordField();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingrese al Sistema");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre de Usuario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 158, 18));

        txtUsu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtUsu.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 140, 27));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 90, 22));

        txtContra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtContra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContraKeyPressed(evt);
            }
        });
        getContentPane().add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 140, 29));

        jButton4.setText("Registrar nuevo usuario");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        jButton3.setText("¿Olvido su contraseña?");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        btnAceptar.setBackground(new java.awt.Color(102, 255, 204));
        btnAceptar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tick_48.png"))); // NOI18N
        btnAceptar.setToolTipText("Aceptar");
        btnAceptar.setBorder(null);
        btnAceptar.setBorderPainted(false);
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tick_32.png"))); // NOI18N
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 60, 60));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Erase.png"))); // NOI18N
        jButton5.setToolTipText("Salir");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minimize8.png"))); // NOI18N
        jButton7.setToolTipText("Minimizar");
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Textures-Texture-Bamboo-Fondos--1080x1920.jpg"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel3MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        x=evt.getX();
        y=evt.getY();
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseDragged
        Point point =MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x-x,point.y-y);
    }//GEN-LAST:event_jLabel3MouseDragged

    private void txtUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuActionPerformed

    private void txtContraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraKeyPressed
        int a=evt.getKeyCode();
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            btnAceptar.doClick();
        }
    }//GEN-LAST:event_txtContraKeyPressed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        try{
            usu=txtUsu.getText();
            contra=txtContra.getText();
            Principal p=new Principal();
            if(usu.equals("admin") || contra.equals("admin")){
            p.setVisible(rootPaneCheckingEnabled);}
            else JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
        }catch(Exception e){
        
    }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      dispose(); /* ConfirmarSalida cs=new ConfirmarSalida();
        cs.setLocationRelativeTo(cs);
        cs.setVisible(rootPaneCheckingEnabled);*/
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.setExtendedState(WIDTH);
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JPasswordField txtContra;
    public static javax.swing.JTextField txtUsu;
    // End of variables declaration//GEN-END:variables
}
