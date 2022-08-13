package JavaUtil;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import jframe.Usuario;
 
public class OCIemail {
 
    // Replace FROM with your "From" address.
    // This address must be added to Approved Senders in the console.
    static final String FROM = "...";
    static final String FROMNAME = "...";
 
    // Replace TO with a recipient address.
    static final String TO = Usuario.emailRec;
 
    // Replace smtp_username with your Oracle Cloud Infrastructure SMTP username generated in console.
    static final String SMTP_USERNAME = "...";
 
    // Replace smtp_password with your Oracle Cloud Infrastructure SMTP password generated in console.
    static final String SMTP_PASSWORD = "...";
 
    // Oracle Cloud Infrastructure Email Delivery hostname.
    static final String HOST = "smtp.gmail.com";
 
    // The port you will connect to on the SMTP endpoint. Port 25 or 587 is allowed.
    static final int PORT = 587;
 
       static final String SUBJECT = "Recuperação de Senha";
       static final String BODY = String.join(
 
           System.getProperty("line.separator"),
           "<html lang=\"pt-br\">",
           "<meta charset=\"UTF-8\">",
           "<div style=\"border: 2px solid rgba(34,57,121); width: 440px; height: 320px; background-image: linear-gradient(to bottom, rgba(34,57,121), rgba(0,112,192));\">",
           "<div style=\"margin-top: -22px;\">",
           "<img src=\"https://i.imgur.com/yF6wopV.png\" alt=\"Icone Haktoo\" style=\"height: 50px; width: 40px; padding: 5px; margin-top: -4px;\" align=\"left\">",
           "<h1 style=\"color: #fff; padding-top: 12px;\">Haktoo</h1>",
           "<hr style=\"color: #fff; margin-left: 10px; margin-right: 10px; margin-top: -10px;\">",
           "<h2 style=\"color: #fff; padding: 10px; font-family: Arial, Helvetica, sans-serif;\">Código de Segurança:</h2>",
           "<center>",
           "<div style=\"width: 200px; height: 50px; background-color: #fff; margin-left: 10px;\">",
           String.format("<h3 style=\"text-align: center; padding-top: 15px;font-family: Arial, Helvetica, sans-serif;\">%d</h3>", Usuario.token),
           "</div>",
           "</center>",
           "<div style=\"padding: 10px;\">",
           "<p style=\"color: #fff; font-family: Arial, Helvetica, sans-serif; font-size: 1.7vh;\">Para redefinir sua Senha, insira este código de segurança.<br>Você será redirecionado a tela de de Recuperação.</p>",
           "</div></div></div>",
           "</html>"
       );
 
    public static void executar() throws Exception {
 
        // Create a Properties object to contain connection configuration information.
 
       Properties props = System.getProperties();
       props.put("mail.transport.protocol", "smtp");
       props.put("mail.smtp.port", PORT);
 
       //props.put("mail.smtp.ssl.enable", "true"); //the default value is false if not set
       props.put("mail.smtp.auth", "true");
       props.put("mail.smtp.auth.login.disable", "true");  //the default authorization order is "LOGIN PLAIN DIGEST-MD5 NTLM". 'LOGIN' must be disabled since Email Delivery authorizes as 'PLAIN'
       props.put("mail.smtp.starttls.enable", "true");   //TLSv1.2 is required
       props.put("mail.smtp.starttls.required", "true");  //Oracle Cloud Infrastructure required
 
        // Create a Session object to represent a mail session with the specified properties.
       Session session = Session.getDefaultInstance(props);
 
        // Create a message with the specified information.
        MimeMessage msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress(FROM,FROMNAME));
        msg.setRecipient(Message.RecipientType.TO, new InternetAddress(TO));
        msg.setSubject(SUBJECT);
        msg.setContent(BODY,"text/html");
 
        // Create a transport.
        Transport transport = session.getTransport();
           
 
        // Send the message.
 
        try
        {
 
            System.out.println("Sending Email now...standby...");
 
 
            // Connect to OCI Email Delivery using the SMTP credentials specified.
            transport.connect(HOST, SMTP_USERNAME, SMTP_PASSWORD);    
 
            // Send email.
            transport.sendMessage(msg, msg.getAllRecipients());
            System.out.println("Email sent!");
 
        }
 
        catch (Exception ex) {
 
            System.out.println("The email was not sent.");
            System.out.println("Error message: " + ex.getMessage());
 
        }
 
        finally
 
        {
 
            // Close & terminate the connection.
            transport.close();
 
        }
 
    }
 
}