package com.proyecAmazonViewer.model;

public class Movie {

     public int id;
     public String title;
    public String genre;
    public  String creator;
    public int duration;
    public short year;
    public boolean viewer;
    public int timeViewer;

    public Movie(String title, String genre,short year){
        super();
        this.title=title;
        this.genre =genre;
        this.year =year;
    }


}
