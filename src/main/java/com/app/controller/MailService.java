//package com.app.controller;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.MailException;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.stereotype.Service;
//
//import com.app.model.User;
//
//@Service
//public class MailService {
//    @Autowired
//    private JavaMailSender javaMailSender;
//    
//    @Autowired
//    public MailService(JavaMailSender javaMailSender) {
//    	this.javaMailSender= javaMailSender;
//    }
//    
//    public void sendEmail(User user) throws MailException {
//    	SimpleMailMessage mail = new SimpleMailMessage();
//		mail.setTo(user.getEmail());
//		mail.setSubject("Successful Sign Up!!");
//		mail.setText("Hurray ! \n Dear "+user.getName()+" You have Successfully Signed Up");
//		javaMailSender.send(mail);
//    }
//   
//}
