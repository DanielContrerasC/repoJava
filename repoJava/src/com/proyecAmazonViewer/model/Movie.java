package com.proyecAmazonViewer.model;

import java.util.ArrayList;
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

        if (dateF.getTime()>dateI.getTime()){

            setTimeViewer((int) (dateF.getTime() - dateI.getTime()));
        }else{
            setTimeViewer(0);
        }

    }
    public static ArrayList<Movie> makeMoviesList(){
        ArrayList<Movie> movies =new ArrayList<>();


        for (int i = 1; i <= 5; i++) {
            movies.add(new Movie("Movie" +i, "Genero " +i, "Creador "+i, 120 +i, (short)(2017+i)));
        }

        return movies;
    }
}
