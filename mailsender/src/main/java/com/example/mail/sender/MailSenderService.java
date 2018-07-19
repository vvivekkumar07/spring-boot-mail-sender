package com.example.mail.sender;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class MailSenderService {

    @Autowired
    public JavaMailSender emailSender;
    
    @Autowired
    public Environment env;
	
	public void mailSender() {
		SimpleMailMessage email = new SimpleMailMessage();
		email.setTo("vivek.test@testsmtp.com");
		email.setSubject("BloodDonor - change password");
		email.setText("Please change your password");
		email.setFrom("vivek.test@testsmtp.com");
		emailSender.send(email);

	}

}
