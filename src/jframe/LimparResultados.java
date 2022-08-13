/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jframe;

import Project.ConnectionProvider;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme Ruiz
 */
public class LimparResultados extends javax.swing.JFrame {

    /**
     * Creates new form CadastroPage
     */
    public LimparResultados() {
        initComponents();
        try{
            Connection con = ConnectionProvider.getCon();
            Statement pst = con.createStatement();
            ResultSet rs = pst.executeQuery("SELECT COUNT(ID) FROM QUESTOES");
            
        }catch(Exception e){
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, e);
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jSeparator2 = new javax.swing.JSeparator();
        menu_home = new rojerusan.RSButtonHover();
        menu_gerenciar = new rojerusan.RSButtonHover();
        menu_resultado = new rojerusan.RSButtonHover();
        menu_gerenciar1 = new rojerusan.RSButtonHover();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        deletar = new rojerusan.RSButtonHover();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(34, 57, 121));
        kGradientPanel1.setkGradientFocus(100);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 102, 204));
        kGradientPanel1.setkTransparentControls(false);
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        kGradientPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 220, 10));

        menu_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Home_26px_2.png"))); // NOI18N
        menu_home.setText("Home");
        menu_home.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        menu_home.setIconTextGap(12);
        menu_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_homeMouseClicked(evt);
            }
        });
        menu_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_homeActionPerformed(evt);
            }
        });
        kGradientPanel1.add(menu_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 120, 420, 60));

        menu_gerenciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/baixados (1).png"))); // NOI18N
        menu_gerenciar.setText("Gerenciar");
        menu_gerenciar.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        menu_gerenciar.setIconTextGap(12);
        menu_gerenciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_gerenciarMouseClicked(evt);
            }
        });
        menu_gerenciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_gerenciarActionPerformed(evt);
            }
        });
        kGradientPanel1.add(menu_gerenciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 260, 390, 60));

        menu_resultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Library_32px.png"))); // NOI18N
        menu_resultado.setText("Resultado");
        menu_resultado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        menu_resultado.setIconTextGap(12);
        menu_resultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_resultadoMouseClicked(evt);
            }
        });
        menu_resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_resultadoActionPerformed(evt);
            }
        });
        kGradientPanel1.add(menu_resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 190, 380, 60));

        menu_gerenciar1.setBackground(new java.awt.Color(34, 57, 121));
        menu_gerenciar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/30 (1).png"))); // NOI18N
        menu_gerenciar1.setText("Limpar Resultados");
        menu_gerenciar1.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        menu_gerenciar1.setIconTextGap(12);
        menu_gerenciar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_gerenciar1MouseClicked(evt);
            }
        });
        menu_gerenciar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_gerenciar1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(menu_gerenciar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 700, 390, 60));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Panda Haktoo sem fundo 2.png"))); // NOI18N
        kGradientPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 60));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("HAKTOO");
        kGradientPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 180, 50));

        logout.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Exit_26px_2.png"))); // NOI18N
        logout.setText("Logout");
        logout.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, java.awt.Color.white));
        logout.setIconTextGap(15);
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        kGradientPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 770, 420, 60));

        jPanel1.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 830));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 51));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/atencao.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 160, 140));

        deletar.setBackground(new java.awt.Color(255, 255, 255));
        deletar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 0, 51)));
        deletar.setText("Excluir");
        deletar.setColorHover(new java.awt.Color(204, 0, 51));
        deletar.setColorText(new java.awt.Color(204, 0, 51));
        deletar.setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        deletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletarMouseClicked(evt);
            }
        });
        deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarActionPerformed(evt);
            }
        });
        jPanel1.add(deletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 670, 200, 60));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(34, 57, 121));
        jLabel13.setText("os resultados dos alunos");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 470, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/seta.jpg"))); // NOI18N
        jLabel16.setText(" Voltar");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 750, 160, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 102));
        jLabel7.setText("LIMPAR");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 140, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Resultado serão apagados do banco de dados. ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 840, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("secundário de BACKUP.");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, 1050, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Ao clicar em Excluir, todos os dados da aba");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 840, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 51));
        jLabel12.setText("CUIDADO!");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 200, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Você deseja deletar o resultado de todos os alunos?");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 940, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Ao deletar, nenhum dado estará sujeito a armazenamento");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, 1050, -1));

        close.setFont(new java.awt.Font("SansSerif", 0, 25)); // NOI18N
        close.setForeground(new java.awt.Color(153, 153, 153));
        close.setText("X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 10, 20, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1530, 830));

        setSize(new java.awt.Dimension(1523, 824));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menu_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_homeMouseClicked
        HomePageAdmin homeAdmin = new HomePageAdmin();
        homeAdmin.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_homeMouseClicked

    private void menu_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_homeActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_menu_homeActionPerformed

    private void menu_gerenciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_gerenciarMouseClicked
        GerenciarPage gp = new GerenciarPage();
        gp.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_gerenciarMouseClicked

    private void menu_gerenciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_gerenciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_gerenciarActionPerformed

    private void deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarActionPerformed
        //int confirmacao = JOptionPane.showConfirmDialog(null, "Você realmente quer Deletar todos os registros?","Select",JOptionPane.YES_NO_OPTION);
        CustomConfirmBox ccb = new CustomConfirmBox("Você realmente deseja Deletar todos os registros?", this);
        ccb.setVisible(true);
        
    }//GEN-LAST:event_deletarActionPerformed

    private void menu_resultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_resultadoMouseClicked
        ResultadoPageAdmin rpa = new ResultadoPageAdmin();
        rpa.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_resultadoMouseClicked

    private void menu_resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_resultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_resultadoActionPerformed

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        GerenciarPage gp = new GerenciarPage();
        gp.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel16MouseClicked

    private void menu_gerenciar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_gerenciar1MouseClicked
        LimparResultados lr = new LimparResultados();
        lr.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_gerenciar1MouseClicked

    private void menu_gerenciar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_gerenciar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_gerenciar1ActionPerformed

    private void deletarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deletarMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        //int confirmacao = JOptionPane.showConfirmDialog(null, "Você deseja voltar a tela de login?","Select",JOptionPane.YES_NO_OPTION);;
        CustomConfirmBox ccb = new CustomConfirmBox("Você deseja voltar a tela de login?", this);
        ccb.setVisible(true);
    }//GEN-LAST:event_logoutMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        CustomConfirmBox ccb = new CustomConfirmBox("Você deseja fechar o programa?", this);
        ccb.setVisible(true);
    }//GEN-LAST:event_closeMouseClicked

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
            java.util.logging.Logger.getLogger(LimparResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LimparResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LimparResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LimparResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new LimparResultados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private rojerusan.RSButtonHover deletar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel logout;
    private rojerusan.RSButtonHover menu_gerenciar;
    private rojerusan.RSButtonHover menu_gerenciar1;
    private rojerusan.RSButtonHover menu_home;
    private rojerusan.RSButtonHover menu_resultado;
    // End of variables declaration//GEN-END:variables
}

