package com.arun.ContentTransfer.controller;

import com.arun.ContentTransfer.model.Message;
import com.arun.ContentTransfer.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/sendEmail")
    public String sendEmail(@RequestBody Message message) {

        emailService.sendEmail(message.getToEmail(),"Content Sharing",message.getMessage());

        return "Email sent successfully!";
    }

    @PostMapping("/sendEmail")
    public String sendEmail(@RequestBody String body) {
        // Assuming plain text body is in format: toEmail:message
        String[] parts = body.split(":", 2);
        if (parts.length != 2) {
            return "Invalid request format";
        }

        String toEmail = parts[0];
        String message = parts[1];

        emailService.sendEmail(toEmail, "Content Sharing", message);

        return "Email sent successfully!";
    }
}
