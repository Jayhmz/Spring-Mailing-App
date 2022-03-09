package com.ophem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ophem.model.EmailDTO;
import com.ophem.services.EmailService;

@Controller
public class EmailController {
	
	@Autowired
	EmailService emailservice;

	@GetMapping("/")
	public String show(@ModelAttribute("mail") EmailDTO email) {
		return "emailpage";
	}

	@PostMapping("/sendmail")
	public String sendMail(@ModelAttribute("mail") EmailDTO email) {
		emailservice.sendmail(email.getEmail(), email.getSubject(), email.getMessage());
		return "emailpage";
	}
	
	
}
