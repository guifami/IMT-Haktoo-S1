/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jframe;

import java.sql.*;
import javax.swing.JOptionPane;
import Project.ConnectionProvider;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;


/**
 *
 * @author Guilherme Ruiz
 */
public class QuizAdmin extends javax.swing.JFrame {

    public String questionId="1";    
    public String answer;
    public int min=0;
    public int sec=0;
    public int marks=0;
    public String studentAnswer="";
    public boolean aS;
    public boolean bS;
    public boolean cS;
    public boolean dS;
    

    public void answerCheck(){
        if(a.isSelected())
        {
            studentAnswer = a.getText();
        }
        else if(b.isSelected())
        {
            studentAnswer = b.getText();
        }
        else if(c.isSelected())
        {
            studentAnswer = c.getText();
        }
        else
        {
            studentAnswer = d.getText();
        }
        
        if(studentAnswer.equals(answer)){
            marks = marks + 1;
            String marks1 = String.valueOf(marks);
            marcacao.setText(marks1);
        }
        
        //MUDAR O NUMERO DA QUESTAO
        int questionId1 = Integer.parseInt(questionId);
        questionId1 = questionId1 + 1;
        questionId=String.valueOf(questionId1);
        
        
        //LIMPAR SELECIONADOS
        a.setSelected(false);
        b.setSelected(false);
        c.setSelected(false);
        d.setSelected(false);
        
        //ULTIMA QUESTAO
        if(questionId.equals("10")){
            proximo.setVisible(false);
            enviar.setEnabled(true);
        }else{
            enviar.setEnabled(false);
        }
    }
    public void question(){
        try{
            Connection con = ConnectionProvider.getCon();
            Statement pst = con.createStatement();
            ResultSet rsl = pst.executeQuery("SELECT * FROM QUESTOES WHERE ID='"+questionId+"'");
            while(rsl.next()){
                nrquestao.setText(rsl.getString(1));
                pergunta.setText(rsl.getString(2));
                a.setText(rsl.getString(3));
                b.setText(rsl.getString(4));
                c.setText(rsl.getString(5));
                d.setText(rsl.getString(6));
                answer = rsl.getString(7);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void submit(){

        try{
            Connection con = ConnectionProvider.getCon();
            Statement sst = con.createStatement();
            
            sst.executeUpdate("INSERT INTO ESTUDANTE VALUES ('"+Usuario.ra+"', '"+Usuario.nick+"', '"+Usuario.curso+"', '"+marks+"')");
            String marks1=String.valueOf(marks);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    /**
     * Creates new form CadastroPage
     */
    public QuizAdmin() {
        initComponents();
        enviar.setEnabled(false);
    }
    
    Timer time;
    public QuizAdmin(String raNumber){
        initComponents();
        enviar.setEnabled(false);
                    
        //PRIMEIRA QUESTAO E DETALHES DO ESTUDANTE
        ra_label.setText(Usuario.ra);
        nome.setText(Usuario.nick);
        try{
            Connection con = ConnectionProvider.getCon();
            Statement ppst = con.createStatement();
//            ResultSet rs = ppst.executeQuery("SELECT * FROM ESTUDANTE WHERE RA='"+raNumber+"'");
//            while(rs.next()){
//                nome.setText(rs.getString(2));
//            }
            ResultSet rsl = ppst.executeQuery("SELECT * FROM QUESTOES WHERE ID='"+questionId+"'");
            while(rsl.next()){
                nrquestao.setText(rsl.getString(1));
                pergunta.setText(rsl.getString(2));
                a.setText(rsl.getString(3));
                b.setText(rsl.getString(4));
                c.setText(rsl.getString(5));
                d.setText(rsl.getString(6));
                answer = rsl.getString(7);
            }
                
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        //CRONOMETRO
        
        setLocationRelativeTo(this);
        time = new Timer(1000,new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e){
            timersec.setText(String.valueOf(sec));
            timermin.setText(String.valueOf(min));
            
            if(sec==60){
                sec=0;
                min++;
                if(min==10){
                    time.stop();
                    setEnabled(false);
                    setVisible(false);
                    CustomTimeBoxAdmin ctba = new CustomTimeBoxAdmin();
                    ctba.setVisible(true);
                    answerCheck();
                    submit(); 
                }
            }
            sec++;
        }
    });
        time.start();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        marcacao = new javax.swing.JLabel();
        nrquestao = new javax.swing.JLabel();
        proximo = new rojerusan.RSButtonHover();
        jLabel26 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        a = new javax.swing.JRadioButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        b = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        c = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        d = new javax.swing.JRadioButton();
        enviar = new rojerusan.RSButtonHover();
        jLabel27 = new javax.swing.JLabel();
        ra_label = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel31 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        pergunta = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        timersec = new javax.swing.JLabel();
        timermin1 = new javax.swing.JLabel();
        timermin = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(34, 57, 121));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 102, 204));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Questão:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 130, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Acertos:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 20, 120, -1));

        marcacao.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        marcacao.setForeground(new java.awt.Color(34, 57, 121));
        marcacao.setText("0");
        jPanel1.add(marcacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 20, 50, -1));

        nrquestao.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        nrquestao.setForeground(new java.awt.Color(51, 51, 51));
        nrquestao.setText("00");
        jPanel1.add(nrquestao, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 50, -1));

        proximo.setBackground(new java.awt.Color(255, 255, 255));
        proximo.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 51)));
        proximo.setText("Próxima questão");
        proximo.setColorHover(new java.awt.Color(0, 153, 51));
        proximo.setColorText(new java.awt.Color(0, 153, 51));
        proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximoActionPerformed(evt);
            }
        });
        jPanel1.add(proximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 630, -1, -1));

        jLabel26.setFont(new java.awt.Font("Verdana", 1, 17)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(34, 57, 121));
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/duvidas_frequentes.png"))); // NOI18N
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 230, 310, 450));

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        a.setBackground(new java.awt.Color(245, 245, 245));
        a.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        a.setText("Lorem Ipsum is simply dummy text of the printing");
        a.setIconTextGap(12);
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });
        jPanel2.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 880, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(34, 57, 121));
        jLabel23.setText("A");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 30, 30));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(34, 57, 121));
        jLabel24.setText("B");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 30, 30));

        b.setBackground(new java.awt.Color(245, 245, 245));
        b.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        b.setText("Lorem Ipsum is simply dummy text of the printing");
        b.setIconTextGap(12);
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });
        jPanel2.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 880, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(34, 57, 121));
        jLabel25.setText("C");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 30, 30));

        c.setBackground(new java.awt.Color(245, 245, 245));
        c.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        c.setText("Lorem Ipsum is simply dummy text of the printing");
        c.setIconTextGap(12);
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });
        jPanel2.add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 880, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(34, 57, 121));
        jLabel18.setText("D");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 30, 30));

        d.setBackground(new java.awt.Color(245, 245, 245));
        d.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        d.setText("Lorem Ipsum is simply dummy text of the printing");
        d.setIconTextGap(12);
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });
        jPanel2.add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 880, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 900, 360));

        enviar.setBackground(new java.awt.Color(255, 255, 255));
        enviar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 0, 51)));
        enviar.setText("Enviar");
        enviar.setColorHover(new java.awt.Color(204, 0, 51));
        enviar.setColorText(new java.awt.Color(204, 0, 51));
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });
        jPanel1.add(enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 660, -1, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setText("RA:");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 60, -1));

        ra_label.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        ra_label.setForeground(new java.awt.Color(34, 57, 121));
        ra_label.setText("00.00000-0");
        jPanel1.add(ra_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 180, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1450, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(34, 57, 121));
        jLabel31.setText("10");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 20, 50, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 51, 51));
        jLabel30.setText("Total de questões:");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 270, -1));

        pergunta.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        pergunta.setForeground(new java.awt.Color(34, 57, 121));
        pergunta.setText("Lorem Ipsum is simply dummy text of the printing and typeset to try something that save all things ?");
        pergunta.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(pergunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 1370, 50));

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 1450, 720));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Atual:");
        kGradientPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 20, 90, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Tempo máximo:");
        kGradientPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 250, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Nome:");
        kGradientPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 100, 30));

        nome.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        nome.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 480, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("10 min");
        kGradientPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 20, 100, -1));

        timersec.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        timersec.setForeground(new java.awt.Color(255, 204, 0));
        timersec.setText("00");
        kGradientPanel1.add(timersec, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 20, 40, -1));

        timermin1.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        timermin1.setForeground(new java.awt.Color(255, 204, 0));
        timermin1.setText(":");
        kGradientPanel1.add(timermin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 10, 50, 50));

        timermin.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        timermin.setForeground(new java.awt.Color(255, 204, 0));
        timermin.setText("00");
        kGradientPanel1.add(timermin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 20, 40, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Panda Haktoo sem fundo 2.png"))); // NOI18N
        kGradientPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 70, 60));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("HAKTOO");
        kGradientPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 180, 50));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1530, 830));

        setSize(new java.awt.Dimension(1523, 828));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximoActionPerformed
        answerCheck();
        question();
        // TODO add your handling code here:
    }//GEN-LAST:event_proximoActionPerformed

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        if(a.isSelected())
        {
            studentAnswer = a.getText();
            aS = true;
        }
        else if(b.isSelected())
        {
            studentAnswer = b.getText();
            bS = true;
        }
        else if(c.isSelected())
        {
            studentAnswer = c.getText();
            cS = true;
        }
        else
        {
            studentAnswer = d.getText();
            dS = true;
        }
        CustomConfirmBox ccb = new CustomConfirmBox("Você realmente quer Enviar suas respostas?", this, this);
        ccb.setVisible(true);

        
        // TODO add your handling code here:
    }//GEN-LAST:event_enviarActionPerformed

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        if(a.isSelected()){
            b.setSelected(false);
            c.setSelected(false);
            d.setSelected(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_aActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        if(b.isSelected()){
            a.setSelected(false);
            c.setSelected(false);
            d.setSelected(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_bActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        if(c.isSelected()){
            b.setSelected(false);
            a.setSelected(false);
            d.setSelected(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cActionPerformed

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
        if(d.isSelected()){
            b.setSelected(false);
            c.setSelected(false);
            a.setSelected(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_dActionPerformed

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
            java.util.logging.Logger.getLogger(QuizAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new QuizAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton a;
    private javax.swing.JRadioButton b;
    private javax.swing.JRadioButton c;
    private javax.swing.JRadioButton d;
    private rojerusan.RSButtonHover enviar;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel marcacao;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel nrquestao;
    private javax.swing.JLabel pergunta;
    private rojerusan.RSButtonHover proximo;
    private javax.swing.JLabel ra_label;
    private javax.swing.JLabel timermin;
    private javax.swing.JLabel timermin1;
    private javax.swing.JLabel timersec;
    // End of variables declaration//GEN-END:variables
}

