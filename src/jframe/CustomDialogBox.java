/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jframe;

import javax.swing.SwingConstants;

/**
 *
 * @author guifami
 */
public class CustomDialogBox extends javax.swing.JFrame {

    /**
     * Creates new form CustomConfirmBox
     */
    
    public CustomDialogBox(){
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public CustomDialogBox(String text) {
        initComponents();
        txtMsg.setHorizontalAlignment(SwingConstants.CENTER);
        setLocationRelativeTo(null);
        txtMsg.setText(text);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        ok = new rojerusan.RSButtonHover();
        jLabel2 = new javax.swing.JLabel();
        txtMsg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtMsg1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 240));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setMinimumSize(new java.awt.Dimension(550, 275));
        kGradientPanel1.setName(""); // NOI18N
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(550, 275));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ok.setBackground(new java.awt.Color(204, 0, 51));
        ok.setText("Ok");
        ok.setColorHover(new java.awt.Color(255, 0, 51));
        ok.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        kGradientPanel1.add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 130, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(80, 80, 80));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 30, 40));

        txtMsg.setFont(new java.awt.Font("STIXIntegralsUp", 1, 18)); // NOI18N
        txtMsg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kGradientPanel1.add(txtMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 530, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/atencaoCustom.png"))); // NOI18N
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 130, 120));

        txtMsg1.setFont(new java.awt.Font("STIXIntegralsUp", 1, 18)); // NOI18N
        txtMsg1.setText("ATENÇÃO");
        txtMsg1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kGradientPanel1.add(txtMsg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 100, 50));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Panda Haktoo sem fundo 2.png"))); // NOI18N
        kGradientPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 80, 60));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        setVisible(false);
        this.dispose();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_okActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        setVisible(false);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(CustomDialogBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomDialogBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomDialogBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomDialogBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomDialogBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private rojerusan.RSButtonHover ok;
    private javax.swing.JLabel txtMsg;
    private javax.swing.JLabel txtMsg1;
    // End of variables declaration//GEN-END:variables
}