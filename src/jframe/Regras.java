/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jframe;

/**
 *
 * @author Guilherme Ruiz
 */
public class Regras extends javax.swing.JFrame {

    /**
     * Creates new form CadastroPage
     */
    public Regras() {
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
        menu_resultado = new rojerusan.RSButtonHover();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
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

        menu_home.setBackground(new java.awt.Color(34, 57, 121));
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

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Panda Haktoo sem fundo 2.png"))); // NOI18N
        kGradientPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 60));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("HAKTOO");
        kGradientPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 180, 50));

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

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel6.setText("a fins de gamificar o método tradicional de aprendizado.");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 1000, 60));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/seta.jpg"))); // NOI18N
        jLabel12.setText(" Voltar");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 750, 160, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel13.setText("ser consultada na aba Resultado.");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 550, 1000, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.gray);
        jLabel2.setText("Guilherme Ruiz, Leonardo Cazotto, Lucas Pennone, Rafael Rúbio.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 800, 480, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel15.setText("O HAKTOO é um jogo de perguntas e respostas selecionadas");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 1000, 60));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel18.setText("As perguntas foram selecionadas pelo(a) professor(a) administrador(a)");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 1150, 60));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel19.setText("e, logo após o término do Quiz será exibida sua pontuação que poderá");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 1140, 60));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel16.setText("O Quiz é composto por 10 questões de múltipla escolha onde apenas");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 1120, 60));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel17.setText("uma alternativa é a correta. Você terá 10 minutos para finalizar o Quiz.");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 1130, 60));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel21.setText("Bem vindo(a)!");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 230, -1));

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
        HomePage home = new HomePage();
        home.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_homeMouseClicked

    private void menu_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_homeActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_menu_homeActionPerformed

    private void menu_resultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_resultadoMouseClicked
        ResultadoPage rpa = new ResultadoPage();
        rpa.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_resultadoMouseClicked

    private void menu_resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_resultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_resultadoActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        HomePage home = new HomePage();
        home.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseClicked

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
            java.util.logging.Logger.getLogger(Regras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Regras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Regras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Regras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Regras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel logout;
    private rojerusan.RSButtonHover menu_home;
    private rojerusan.RSButtonHover menu_resultado;
    // End of variables declaration//GEN-END:variables
}

