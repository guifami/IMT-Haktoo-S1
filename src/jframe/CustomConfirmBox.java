/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jframe;

import Project.ConnectionProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.Timer;

/**
 *
 * @author guifami
 */
public class CustomConfirmBox extends javax.swing.JFrame {

    /**
     * Creates new form CustomConfirmBox
     */
    
    private JFrame frameOrigin;
    private int marks;
    private Timer time;
    private String studentAnswer="";
    private String answer;
    private boolean aS;
    private boolean bS;
    private boolean cS;
    private boolean dS;
    private boolean admin = false;
    
    public CustomConfirmBox(){
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public CustomConfirmBox(String text, JFrame frameOrigin, Quiz quiz){
        initComponents();
        this.frameOrigin = frameOrigin;
        this.marks = quiz.marks;
        this.time = quiz.time;
        this.studentAnswer = quiz.studentAnswer;
        this.answer = quiz.answer;
        this.aS = quiz.aS;
        this.bS = quiz.bS;
        this.cS = quiz.cS;
        this.dS = quiz.dS;
        txtMsg.setHorizontalAlignment(SwingConstants.CENTER);
        setLocationRelativeTo(null);
        txtMsg.setText(text);
    }
    
        public CustomConfirmBox(String text, JFrame frameOrigin, QuizAdmin quiz){
        initComponents();
        this.frameOrigin = frameOrigin;
        this.marks = quiz.marks;
        this.time = quiz.time;
        this.studentAnswer = quiz.studentAnswer;
        this.answer = quiz.answer;
        this.aS = quiz.aS;
        this.bS = quiz.bS;
        this.cS = quiz.cS;
        this.dS = quiz.dS;
        this.admin = true;
        txtMsg.setHorizontalAlignment(SwingConstants.CENTER);
        setLocationRelativeTo(null);
        txtMsg.setText(text);
    }
    
    public CustomConfirmBox(String text, JFrame frameOrigin) {
        initComponents();
        this.frameOrigin = frameOrigin;
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
        nao = new rojerusan.RSButtonHover();
        jLabel1 = new javax.swing.JLabel();
        sim1 = new rojerusan.RSButtonHover();
        jLabel2 = new javax.swing.JLabel();
        txtMsg = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtMsg1 = new javax.swing.JLabel();

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

        nao.setBackground(new java.awt.Color(204, 0, 51));
        nao.setText("Não");
        nao.setColorHover(new java.awt.Color(255, 0, 51));
        nao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naoActionPerformed(evt);
            }
        });
        kGradientPanel1.add(nao, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 130, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/duvidaconfirmicon.png"))); // NOI18N
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 140, 120));

        sim1.setBackground(new java.awt.Color(27, 54, 121));
        sim1.setText("Sim");
        sim1.setColorHover(new java.awt.Color(0, 112, 192));
        sim1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sim1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sim1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(sim1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 130, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(80, 80, 80));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 30, 40));

        txtMsg.setFont(new java.awt.Font("STIXIntegralsUp", 1, 20)); // NOI18N
        txtMsg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kGradientPanel1.add(txtMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 520, 50));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Panda Haktoo sem fundo 2.png"))); // NOI18N
        kGradientPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 80, 60));

        txtMsg1.setFont(new java.awt.Font("STIXIntegralsUp", 1, 20)); // NOI18N
        txtMsg1.setText("CONFIRMAÇÃO");
        txtMsg1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kGradientPanel1.add(txtMsg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 180, 50));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void naoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naoActionPerformed
    setVisible(false);    
    // TODO add your handling code here:
    }//GEN-LAST:event_naoActionPerformed

    private void sim1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sim1ActionPerformed

        if(txtMsg.getText().equals("Você deseja voltar a tela de login?")){
            //setVisible(false);
            LoginPage lp = new LoginPage();
            lp.setVisible(true);
            frameOrigin.dispose();
            this.dispose();
        }
        if(txtMsg.getText().equals("Você realmente quer Enviar suas respostas?")){
            if (aS || bS || cS || dS)
                if(studentAnswer.equals(answer)){
                    marks = marks + 1;
                }
            try{
                Connection con = ConnectionProvider.getCon();
                Statement sst = con.createStatement();
                sst.executeUpdate("INSERT INTO ESTUDANTE VALUES ('"+Usuario.ra+"', '"+Usuario.nick+"', '"+Usuario.curso+"', "+marks+")");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            time.stop();
            setVisible(false);
            if (!admin){
                ResultadoPage rp = new ResultadoPage();
                rp.setVisible(true);
            }else{
                ResultadoPageAdmin rpa = new ResultadoPageAdmin();
                rpa.setVisible(true);
            }
            frameOrigin.dispose();
            this.dispose();
        }
        if(txtMsg.getText().equals("Você deseja fechar o programa?")){
            setVisible(false);
            System.exit(0);
        }
        if(txtMsg.getText().equals("Você realmente deseja Deletar todos os registros?")){
            try{
                Connection con = ConnectionProvider.getCon();
                Statement pstq = con.createStatement();
                ResultSet rs= pstq.executeQuery("SELECT * FROM ESTUDANTE");
                pstq.executeUpdate("DELETE FROM ESTUDANTE");
                setVisible(false);
                ResultadoPageAdmin rpa = new ResultadoPageAdmin();
                rpa.setVisible(true);
                frameOrigin.dispose();
                this.dispose();
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        if(txtMsg.getText().equals("Você deseja Excluir esta questão?")){
                try{
                Connection con = ConnectionProvider.getCon();
                PreparedStatement psst = con.prepareStatement("DELETE FROM QUESTOES WHERE ID=?");
                psst.setString(1,Usuario.consultaIdExcluir);
                psst.executeUpdate();
                
                JFrame jf = new JFrame();
                jf.setAlwaysOnTop(true);
                CustomSuccessBox csb = new CustomSuccessBox("Exercício excluído com Sucesso.");
                csb.setVisible(true);
                this.dispose();
                frameOrigin.dispose();

                }catch(Exception e){
                    JFrame jf = new JFrame();
                    jf.setAlwaysOnTop(true);
                    JOptionPane.showMessageDialog(jf,e);
                }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_sim1ActionPerformed

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
            java.util.logging.Logger.getLogger(CustomConfirmBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomConfirmBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomConfirmBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomConfirmBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomConfirmBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private rojerusan.RSButtonHover nao;
    private rojerusan.RSButtonHover sim1;
    private javax.swing.JLabel txtMsg;
    private javax.swing.JLabel txtMsg1;
    // End of variables declaration//GEN-END:variables
}