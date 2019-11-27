package com.proyecAmazonViewer.model;

public class Series {

    private int id;
    private String title;
    private String genre;
    private String creator;
    private int duration;
    private short year;
    private boolean viewer;
    private int timeViewer;

    int sessionQuantity;
    //chapters[]


    public Series(String title, String genre, int duration) {
        super();
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }
}
