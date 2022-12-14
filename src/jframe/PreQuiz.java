/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jframe;

import Project.ConnectionProvider;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.*;


/**
 *
 * @author Guilherme Ruiz
 */
public class PreQuiz extends javax.swing.JFrame {
public String raNumber;

    /**
     * Creates new form CadastroPage
     */
    public PreQuiz() {
        initComponents();
        ra_label.setText(Usuario.ra);
        ra_label.setEditable(false);
        SimpleDateFormat dFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        date_now.setText(dFormat.format(date));
        
    }
    
    public PreQuiz(String raNumber) {
        initComponents();
      
    }
    
    public boolean validateDetails(){
        if(ra_label.getText().equals("")){
            CustomDialogBox ccb = new CustomDialogBox("Campo obrigatório: Insira seu RA.");
            ccb.setVisible(true);
            return false;
        }
        if(nome.getText().equals("")){
            CustomDialogBox ccb = new CustomDialogBox("Campo obrigatório: Insira seu nome completo.");
            ccb.setVisible(true);
            return false;
        }
        if(txt_curso.getText().equals("")){
            CustomDialogBox ccb = new CustomDialogBox("Campo obrigatório: Insira seu curso.");
            ccb.setVisible(true);
            return false;
        }
        if(!ra_label.getText().equals(Usuario.ra)){
            CustomDialogBox ccb = new CustomDialogBox("RA não compatível com o cadastrado.");
            ccb.setVisible(true);
            return false;
        }
        if(nome.getText().length() > 100){
            CustomDialogBox ccb = new CustomDialogBox("Nome completo não pode ter mais de 100 caracteres.");
            ccb.setVisible(true);
            return false;
        }
        if(txt_curso.getText().length() > 50){
            CustomDialogBox ccb = new CustomDialogBox("Curso não pode conter mais de 50 caracteres.");
            ccb.setVisible(true);
            return false;
        }
        if(ra_label.getText().equals("")){
            CustomDialogBox ccb = new CustomDialogBox("Campo obrigatório, insira seu RA.");
            ccb.setVisible(true);
            return false;
        }
        if(nome.getText().equals("")){
            CustomDialogBox ccb = new CustomDialogBox("Campo obrigatório, insira seu Nome completo.");
            ccb.setVisible(true);
            return false;
        }
        if(txt_curso.getText().equals("")){
            CustomDialogBox ccb = new CustomDialogBox("Campo obrigatório, insira seu Curso.");
            ccb.setVisible(true);
            return false;
        }
        return true;
    }
    
    public void registrarDetalhes(){
        Usuario.ra = ra_label.getText();
        Usuario.nick = nome.getText();
        Usuario.curso = txt_curso.getText();
        String marks = "0";
        try{
            Connection con = ConnectionProvider.getCon();
            Statement psst = con.createStatement();
            ResultSet rrs = psst.executeQuery("SELECT COUNT(*) FROM QUESTOES");
            while(rrs.next()){
                if(rrs.getInt(1) != 10){
                    CustomDialogBox ccb = new CustomDialogBox("O Quiz ainda não possui 10 Perguntas.");
                    ccb.setVisible(true);
                }
                else{
                    setVisible(false);
                    new Quiz(raNumber).setVisible(true);
                }
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
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
        jSeparator1 = new javax.swing.JSeparator();
        menu_home = new rojerusan.RSButtonHover();
        menu_resultado = new rojerusan.RSButtonHover();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nome = new app.bolivia.swing.JCTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        comecar = new rojerusan.RSButtonHover();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        date_now = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txt_curso = new app.bolivia.swing.JCTextField();
        jLabel12 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        ra_label = new app.bolivia.swing.JCTextField();
        jLabel19 = new javax.swing.JLabel();

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

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("HAKTOO");
        kGradientPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 180, 50));

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.gray);
        jLabel2.setText("Guilherme Ruiz, Leonardo Cazotto, Lucas Pennone, Rafael Rúbio.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 800, 490, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(34, 57, 121));
        jLabel17.setText("HAKTOO Quiz Game");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 380, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(34, 57, 121));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Read_Online_26px.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, 60));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(34, 57, 121));
        jLabel10.setText("Nome completo");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 250, 40));

        nome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(34, 57, 121)));
        nome.setForeground(new java.awt.Color(34, 57, 121));
        nome.setCaretColor(new java.awt.Color(102, 102, 102));
        nome.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        nome.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        nome.setPlaceholder("Enter your full name:");
        nome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nomeFocusLost(evt);
            }
        });
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });
        jPanel1.add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 340, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel13.setText("Clique em Começar para inciar a atividade, você terá 10 minutos até a conclusão");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 530, 1190, 60));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel11.setText("do quiz. No final, será exibido sua pontuação com base nos acertos e erros.");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 580, 1110, 60));

        comecar.setBackground(new java.awt.Color(255, 153, 102));
        comecar.setBorder(null);
        comecar.setText("Começar");
        comecar.setColorHover(new java.awt.Color(255, 153, 160));
        comecar.setFont(new java.awt.Font("Imprint MT Shadow", 1, 48)); // NOI18N
        comecar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comecarMouseClicked(evt);
            }
        });
        comecar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comecarActionPerformed(evt);
            }
        });
        jPanel1.add(comecar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 680, 310, 100));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 17)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(34, 57, 121));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/projeto.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 110, 390, 390));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(34, 57, 121));
        jLabel18.setText("Data:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 30, 90, 30));

        date_now.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        date_now.setForeground(new java.awt.Color(0, 102, 204));
        jPanel1.add(date_now, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 30, 220, 30));

        jLabel22.setFont(new java.awt.Font("Verdana", 1, 17)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(34, 57, 121));
        jLabel22.setText("Curso Graduação");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 190, 40));

        jLabel23.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(34, 57, 121));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Books_26px.png"))); // NOI18N
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 30, 60));

        txt_curso.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(34, 57, 121)));
        txt_curso.setForeground(new java.awt.Color(34, 57, 121));
        txt_curso.setCaretColor(new java.awt.Color(102, 102, 102));
        txt_curso.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_curso.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txt_curso.setPlaceholder("Ex: Ciência da Computação");
        txt_curso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_cursoFocusLost(evt);
            }
        });
        txt_curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cursoActionPerformed(evt);
            }
        });
        jPanel1.add(txt_curso, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, 340, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/seta.jpg"))); // NOI18N
        jLabel12.setText(" Voltar");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 750, 160, -1));

        close.setFont(new java.awt.Font("SansSerif", 0, 25)); // NOI18N
        close.setForeground(new java.awt.Color(153, 153, 153));
        close.setText("X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 10, 20, 20));

        jLabel20.setFont(new java.awt.Font("Verdana", 1, 17)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(34, 57, 121));
        jLabel20.setText("Registro do Usuário");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 190, 40));

        ra_label.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(34, 57, 121)));
        ra_label.setForeground(new java.awt.Color(34, 57, 121));
        ra_label.setCaretColor(new java.awt.Color(102, 102, 102));
        ra_label.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        ra_label.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ra_label.setPlaceholder("Ex: 00.00000-0");
        ra_label.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ra_labelFocusLost(evt);
            }
        });
        ra_label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ra_labelActionPerformed(evt);
            }
        });
        jPanel1.add(ra_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 340, -1));

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(34, 57, 121));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_View_Details_26px.png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 30, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1530, 830));

        setSize(new java.awt.Dimension(1523, 829));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cursoActionPerformed

    private void txt_cursoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_cursoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cursoFocusLost

    private void comecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comecarActionPerformed
    if(validateDetails()){
        registrarDetalhes();
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_comecarActionPerformed

    private void comecarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comecarMouseClicked


            
        // TODO add your handling code here:
    }//GEN-LAST:event_comecarMouseClicked

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void nomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomeFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFocusLost

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

    private void ra_labelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ra_labelFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_ra_labelFocusLost

    private void ra_labelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ra_labelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ra_labelActionPerformed

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
            java.util.logging.Logger.getLogger(PreQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PreQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PreQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PreQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PreQuiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private rojerusan.RSButtonHover comecar;
    private javax.swing.JLabel date_now;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel logout;
    private rojerusan.RSButtonHover menu_home;
    private rojerusan.RSButtonHover menu_resultado;
    private app.bolivia.swing.JCTextField nome;
    private app.bolivia.swing.JCTextField ra_label;
    private app.bolivia.swing.JCTextField txt_curso;
    // End of variables declaration//GEN-END:variables
}

