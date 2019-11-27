package com.proyecAmazonViewer.model;

public class Chapter {

    private int id;
    private String title;
    private int duration;
    private short year;
    private boolean viewer;
    private int timeViewer;
    private int sessionNumber;

    public Chapter(String title, int duration, short year) {
        this.title = title;
        this.duration = duration;
        this.year = year;
    }
}
