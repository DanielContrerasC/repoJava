package com.proyecAmazonViewer.model;

public class Movie {

    private int id;
    private String title;
    private String genre;
    private String creator;
    private int duration;
    private short year;
    private boolean viewer;
    private int timeViewer;

    public Movie(){
        super();
        this.title=title;
        this.genre =genre;
        this.creator=creator;
        this.duration=duration;
        this.year =year;

    }
    public Movie(String title, String genre, short year){
        super();
        this.title =title;
        this.genre=genre;
        this.year=year;

    }

    public void showData(){
        System.out.println("Title: " +title);
        System.out.println("Genre: " + genre);
        System.out.println("year: " +year);
    }



}
