package com.ophem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService{

	@Autowired
	JavaMailSender mailsender;
	
	@Override
	public void sendmail(String email, String subject, String message) {
		
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(email);
		mail.setSubject(subject);
		mail.setText(message);
		
		mailsender.send(mail);
	}

}
