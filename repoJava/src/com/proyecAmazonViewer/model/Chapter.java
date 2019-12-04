package com.proyecAmazonViewer.model;

public class Chapter extends Movie {

    private int id;
    private int sessionNumber;


    public Chapter(String title, String genre, String creator, int duration, short year, int sessionNumber) {
        super(title, genre, creator, duration, year);
        this.sessionNumber=sessionNumber;
    }

    @Override
    public int getId() {
        return this.id;
    }

    public int getSessionNumber() {
        return sessionNumber;
    }

    public void setSessionNumber(int sessionNumber) {
        this.sessionNumber = sessionNumber;
    }


}
