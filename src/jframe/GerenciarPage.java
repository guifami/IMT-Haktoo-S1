/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jframe;


/**
 *
 * @author Guilherme Ruiz
 */
public class GerenciarPage extends javax.swing.JFrame {

    /**
     * Creates new form CadastroPage
     */
    public GerenciarPage() {
        initComponents();
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
        jSeparator1 = new javax.swing.JSeparator();
        menu_home = new rojerusan.RSButtonHover();
        menu_gerenciar = new rojerusan.RSButtonHover();
        menu_resultado = new rojerusan.RSButtonHover();
        menu_gerenciar1 = new rojerusan.RSButtonHover();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        rSButtonHover1 = new rojerusan.RSButtonHover();
        rSButtonHover3 = new rojerusan.RSButtonHover();
        rSButtonHover4 = new rojerusan.RSButtonHover();
        rSButtonHover5 = new rojerusan.RSButtonHover();
        jLabel1 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(34, 57, 121));
        kGradientPanel1.setkGradientFocus(300);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 102, 204));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        kGradientPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 220, 10));

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

        menu_gerenciar.setBackground(new java.awt.Color(34, 57, 121));
        menu_gerenciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/baixados (1).png"))); // NOI18N
        menu_gerenciar.setText("Gerenciar");
        menu_gerenciar.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        menu_gerenciar.setIconTextGap(12);
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

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/male_user_50px.png"))); // NOI18N
        jLabel5.setText("HAKTOO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 170, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(34, 57, 121));
        jLabel12.setText("Gerenciamento de Questões");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 490, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel13.setText("Nesta página você é capaz de manter <<CRUD>> as questões do Quiz.");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 1170, 60));

        rSButtonHover1.setBackground(new java.awt.Color(255, 153, 102));
        rSButtonHover1.setBorder(null);
        rSButtonHover1.setText("Deletar");
        rSButtonHover1.setColorHover(new java.awt.Color(255, 153, 160));
        rSButtonHover1.setFont(new java.awt.Font("Imprint MT Shadow", 1, 48)); // NOI18N
        rSButtonHover1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonHover1MouseClicked(evt);
            }
        });
        rSButtonHover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonHover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 190, 200, 90));

        rSButtonHover3.setBackground(new java.awt.Color(34, 57, 121));
        rSButtonHover3.setBorder(null);
        rSButtonHover3.setText("Criar");
        rSButtonHover3.setColorHover(new java.awt.Color(102, 102, 255));
        rSButtonHover3.setFont(new java.awt.Font("Imprint MT Shadow", 1, 48)); // NOI18N
        rSButtonHover3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonHover3MouseClicked(evt);
            }
        });
        rSButtonHover3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover3ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonHover3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 200, 90));

        rSButtonHover4.setBackground(new java.awt.Color(0, 102, 204));
        rSButtonHover4.setBorder(null);
        rSButtonHover4.setText("Consultar");
        rSButtonHover4.setColorHover(new java.awt.Color(102, 102, 255));
        rSButtonHover4.setFont(new java.awt.Font("Imprint MT Shadow", 1, 48)); // NOI18N
        rSButtonHover4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonHover4MouseClicked(evt);
            }
        });
        rSButtonHover4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover4ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonHover4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 260, 90));

        rSButtonHover5.setBorder(null);
        rSButtonHover5.setText("Alterar");
        rSButtonHover5.setColorHover(new java.awt.Color(102, 102, 255));
        rSButtonHover5.setFont(new java.awt.Font("Imprint MT Shadow", 1, 48)); // NOI18N
        rSButtonHover5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonHover5MouseClicked(evt);
            }
        });
        rSButtonHover5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover5ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonHover5, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 190, 200, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/undraw_building_websites_i78t.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 960, 760));

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

        setSize(new java.awt.Dimension(1523, 828));
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

    private void rSButtonHover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover1ActionPerformed

    private void menu_gerenciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_gerenciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_gerenciarActionPerformed

    private void rSButtonHover3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover3ActionPerformed

    private void rSButtonHover4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover4ActionPerformed

    private void rSButtonHover5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover5ActionPerformed

    private void rSButtonHover3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonHover3MouseClicked
        AdicionarQuestao addQ = new AdicionarQuestao();
        addQ.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover3MouseClicked

    private void rSButtonHover4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonHover4MouseClicked
        ConsultarQuestao consultQ = new ConsultarQuestao();
        consultQ.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_rSButtonHover4MouseClicked

    private void rSButtonHover5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonHover5MouseClicked
        AlterarQuestao altQ = new AlterarQuestao();
        altQ.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover5MouseClicked

    private void rSButtonHover1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonHover1MouseClicked
        DeletarQuestao delQ = new DeletarQuestao();
        delQ.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover1MouseClicked

    private void menu_resultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_resultadoMouseClicked
        ResultadoPageAdmin rpa = new ResultadoPageAdmin();
        rpa.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_resultadoMouseClicked

    private void menu_resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_resultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_resultadoActionPerformed

    private void menu_gerenciar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_gerenciar1MouseClicked
        LimparResultados lr = new LimparResultados();
        lr.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_gerenciar1MouseClicked

    private void menu_gerenciar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_gerenciar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_gerenciar1ActionPerformed

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
            java.util.logging.Logger.getLogger(GerenciarPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new GerenciarPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel logout;
    private rojerusan.RSButtonHover menu_gerenciar;
    private rojerusan.RSButtonHover menu_gerenciar1;
    private rojerusan.RSButtonHover menu_home;
    private rojerusan.RSButtonHover menu_resultado;
    private rojerusan.RSButtonHover rSButtonHover1;
    private rojerusan.RSButtonHover rSButtonHover3;
    private rojerusan.RSButtonHover rSButtonHover4;
    private rojerusan.RSButtonHover rSButtonHover5;
    // End of variables declaration//GEN-END:variables
}

