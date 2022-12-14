/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jframe;

import Project.ConnectionProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author guifami
 */
public class AlterarSenha extends javax.swing.JFrame {

    /**
     * Creates new form CustomConfirmBox
     */
    
    public AlterarSenha(){
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public boolean validaSenha(){
        if(Senha.getText().equals("")){
            CustomDialogBox cdb = new CustomDialogBox("Crie uma Senha.");
            cdb.setVisible(true);
            return false;
        }
        if(!Senha.getText().equals(confirmSenha.getText())){
            CustomDialogBox cdb = new CustomDialogBox("Ambos os campos precisam conter a mesma Senha.");
            cdb.setVisible(true);
            return false;
        }
        return true;
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
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        ok1 = new rojerusan.RSButtonHover();
        rSLabelImage2 = new rojerusan.RSLabelImage();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rSLabelImage3 = new rojerusan.RSLabelImage();
        confirmSenha = new rojerusan.RSPasswordTextPlaceHolder();
        Senha = new rojerusan.RSPasswordTextPlaceHolder();
        validacao = new javax.swing.JLabel();

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

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Panda Haktoo sem fundo 2.png"))); // NOI18N
        kGradientPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 80, 60));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(34, 57, 121));
        jLabel15.setText("HAKTOO");
        kGradientPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 180, 50));

        kGradientPanel2.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setMinimumSize(new java.awt.Dimension(550, 275));
        kGradientPanel2.setName(""); // NOI18N
        kGradientPanel2.setPreferredSize(new java.awt.Dimension(550, 275));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Panda Haktoo sem fundo 2.png"))); // NOI18N
        kGradientPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 80, 60));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(34, 57, 121));
        jLabel17.setText("HAKTOO");
        kGradientPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 180, 50));

        kGradientPanel3.setkEndColor(new java.awt.Color(0, 102, 204));
        kGradientPanel3.setkStartColor(new java.awt.Color(0, 102, 204));
        kGradientPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ok1.setBackground(new java.awt.Color(204, 0, 51));
        ok1.setText("Redefinir");
        ok1.setColorHover(new java.awt.Color(255, 0, 51));
        ok1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ok1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok1ActionPerformed(evt);
            }
        });
        kGradientPanel3.add(ok1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 130, -1));

        rSLabelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Forgot_Password_50px_4.png"))); // NOI18N
        kGradientPanel3.add(rSLabelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 30, 30));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Confirme sua Senha:");
        kGradientPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 190, 50));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Crie uma nova Senha:");
        kGradientPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 190, 50));

        rSLabelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Forgot_Password_50px_4.png"))); // NOI18N
        kGradientPanel3.add(rSLabelImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 30, 30));

        confirmSenha.setBackground(new java.awt.Color(0, 102, 204));
        confirmSenha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        confirmSenha.setForeground(new java.awt.Color(255, 255, 255));
        confirmSenha.setToolTipText("");
        confirmSenha.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        confirmSenha.setPhColor(new java.awt.Color(255, 255, 255));
        confirmSenha.setPlaceholder("Enter Password Again:");
        kGradientPanel3.add(confirmSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 280, -1));

        Senha.setBackground(new java.awt.Color(0, 102, 204));
        Senha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Senha.setForeground(new java.awt.Color(255, 255, 255));
        Senha.setToolTipText("");
        Senha.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        Senha.setPhColor(new java.awt.Color(255, 255, 255));
        Senha.setPlaceholder("Enter Password:");
        kGradientPanel3.add(Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 280, -1));

        kGradientPanel2.add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 740, 390));

        validacao.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        validacao.setText("Alterar minha Senha");
        validacao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kGradientPanel2.add(validacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 310, 50));

        kGradientPanel1.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 460));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ok1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok1ActionPerformed
        if(validaSenha()){
            try{
                Connection con = ConnectionProvider.getCon();
                PreparedStatement pst = con.prepareStatement("UPDATE USERS SET PASSWORD = ? WHERE RA = ?");
                pst.setString(1, confirmSenha.getText());
                pst.setString(2, Usuario.raRec);
                pst.executeUpdate();

                LoginPage lp = new LoginPage();
                lp.setVisible(true);
                this.dispose();
                CustomSuccessBox csb = new CustomSuccessBox("Senha Alterada com Sucesso!");
                csb.setVisible(true);

                JFrame jf = new JFrame();
                jf.setAlwaysOnTop(true);
                }catch(Exception e){
                    JFrame jf = new JFrame();
                    jf.setAlwaysOnTop(true);
                    JOptionPane.showMessageDialog(jf,e);
                }
            }
    }//GEN-LAST:event_ok1ActionPerformed

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
            java.util.logging.Logger.getLogger(AlterarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarSenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSPasswordTextPlaceHolder Senha;
    private rojerusan.RSPasswordTextPlaceHolder confirmSenha;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private rojerusan.RSButtonHover ok1;
    private rojerusan.RSLabelImage rSLabelImage2;
    private rojerusan.RSLabelImage rSLabelImage3;
    private javax.swing.JLabel validacao;
    // End of variables declaration//GEN-END:variables
}
