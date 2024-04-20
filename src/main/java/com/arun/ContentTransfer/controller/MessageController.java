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
}
