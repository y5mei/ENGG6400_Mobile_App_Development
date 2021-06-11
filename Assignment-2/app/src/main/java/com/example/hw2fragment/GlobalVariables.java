package com.example.hw2fragment;

import android.app.Application;

public class GlobalVariables extends Application {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
