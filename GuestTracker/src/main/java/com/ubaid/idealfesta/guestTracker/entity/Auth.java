package com.ubaid.idealfesta.guestTracker.entity;

public class Auth {
    private String message;

    public Auth(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Auth{" +
                "message='" + message + '\'' +
                '}';
    }
}
