package com.arun.ContentTransfer.model;

public class Message {
    private String message;
    private String toEmail;

    Message(){

    }

    Message(String toEmail,String message){
        this.toEmail = toEmail;
        this.message = message;
    }

    public void setToEmail(String toEmail) {
        this.toEmail = toEmail;
    }

    public String getToEmail() {
        return toEmail;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
