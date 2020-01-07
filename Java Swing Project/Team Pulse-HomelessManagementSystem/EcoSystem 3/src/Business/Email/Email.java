/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.email;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


/**
 *
 * @author gloha
 */
public class Email {
   public static void sendMail(String recepient, String title,String Content) throws Exception {
   Properties properties =new Properties();
   properties.put("mail.smtp.auth",true);
   properties.put("mail.smtp.starttls.enable","true");
   properties.put("mail.smtp.host","smtp.gmail.com");
   properties.put("mail.smtp.port","587");
   
   final String myAccountEmail ="pvidhi107@gmail.com";
   final String password="pvidhi107";
    String S;
    
   Session session =Session.getInstance(properties, new Authenticator(){
   @Override
   
   protected PasswordAuthentication getPasswordAuthentication(){
   
   return new PasswordAuthentication(myAccountEmail, password);
           }
   });
   
  
   
       System.out.println("Message Sent Successfully");
      
          
          
               
            Message message =new MimeMessage(session);
               message.setFrom(new InternetAddress(myAccountEmail)); 
               message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
               
           message.setSubject(title);
//           message.setText("STFU");
           
        String msg=Content;
        MimeBodyPart mime=new MimeBodyPart();
        mime.setContent(msg,"text/html");
        Multipart multi=new MimeMultipart();
        multi.addBodyPart(mime);
        message.setContent(multi);
           
           
       
   Transport.send(message);
   
            
   } 
   
   
}


