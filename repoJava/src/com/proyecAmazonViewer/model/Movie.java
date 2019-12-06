package com.proyecAmazonViewer.model;

import java.util.Date;

public class Movie extends Film implements IVisualizable {

    private int id;
    private int timeViewer;

    public Movie(String title, String genre, String creator, int duration, short year) {
        super(title, genre, creator, duration);
        setYear(year);
    }


    public void showData(){
        //System.out.println("Title: " +title);
        //System.out.println("Genre: " + genre);
        //System.out.println("year: " +year);
    }

    public int getId() {
        return id;
    }

    public int getTimeViewer() {
        return timeViewer;
    }

    public void setTimeViewer(int timeViewer) {
        this.timeViewer = timeViewer;
    }

    @Override
    public String toString() {
        return " Title: " +getTitle()+
                "\n Genero: " +getGenre()+
                    "\n Year: " +getYear()+
                        "\n Creator: " +getCreator()+
                            "\n Duration: "+getDuration();
    }

    @Override
    public Date startToSee(Date dateI) {
        return dateI;
    }

    @Override
    public void stopToSee(Date dateI, Date dateF) {

        if (dateF.getSeconds()>dateI.getSeconds()){

            setTimeViewer(dateF.getSeconds() - dateI.getSeconds());
        }else{
            setTimeViewer(0);
        }

    }
}
