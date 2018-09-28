package com.example.usuario.sendmessage.model;

import java.io.Serializable;

public class Message implements Serializable {
    private String author;
    private String message;

    public  Message(){

    }

    public Message(String author, String message) {
        this.author = author;
        this.message = message;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthor() {
        return author;
    }

    public String getMessage() {
        return message;
    }
}
