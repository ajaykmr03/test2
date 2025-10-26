import java.io.IOException;
import java.io.PrintWriter;
import javax.mail.*;
import javax.mail.internet.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.util.Properties;

@WebServlet("/Sendemail")
public class Sendemail extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String messageText = request.getParameter("message");

        final String fromEmail = "ajikmr0308@gmail.com"; // change to your email
        final String password = "ekpb urrg rblu lwiv"; // change to your email password
        final String toEmail = "ajikmr0308@gmail.com"; // email where you want to receive messages

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com"); // For Gmail
        props.put("mail.smtp.port", "587"); // Gmail port
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true"); // TLS

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        });

        try {
            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(fromEmail, "Contact Form"));
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            msg.setSubject("New Contact Form Submission from " + name);

            String htmlMessage = "<h3>Message from: " + name + " (" + email + ")</h3>"
                                + "<p>" + messageText + "</p>";

            msg.setContent(htmlMessage, "text/html");

            Transport.send(msg);

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
           
            out.print("<script>"
                               +"alert('Send Successfully..!');"
                                       +"location.href='newown.jsp';"
                                       +"</script>"
                               );


        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
