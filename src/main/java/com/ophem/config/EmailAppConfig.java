package com.ophem.config;


import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.ophem")
public class EmailAppConfig {

	@Bean
	InternalResourceViewResolver vr () {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
	
	@Bean
	public JavaMailSender getJavaMailSender() {

		JavaMailSenderImpl mailSenderImpl = new JavaMailSenderImpl();
		mailSenderImpl.setHost("smtp.gmail.com");
		mailSenderImpl.setUsername("jayhmztest@gmail.com");
		mailSenderImpl.setPassword("jayhmz@10");
		
		mailSenderImpl.setJavaMailProperties(props());
		
		return mailSenderImpl;

	}
	
	Properties props() {
		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.starttls.required", "true");
		properties.put("mail.smtp.starttls.required", "true");
		properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		properties.put("mail.debug", "true");
		properties.put("mail.smtp.socketFactory.port", "465");
		properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		
		return properties;
	}


}
