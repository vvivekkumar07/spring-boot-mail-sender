package com.example.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.mail.sender.MailSenderService;

@SpringBootApplication
public class MailsenderApplication implements CommandLineRunner{
	
	@Autowired
	private MailSenderService mailSenderService;

	public static void main(String[] args) {
		SpringApplication.run(MailsenderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		mailSenderService.mailSender();
		
	}
}
