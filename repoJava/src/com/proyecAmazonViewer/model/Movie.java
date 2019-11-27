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
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public boolean isViewer() {
        return viewer;
    }

    public void setViewer(boolean viewer) {
        this.viewer = viewer;
    }

    public int getTimeViewer() {
        return timeViewer;
    }

    public void setTimeViewer(int timeViewer) {
        this.timeViewer = timeViewer;
    }
}
