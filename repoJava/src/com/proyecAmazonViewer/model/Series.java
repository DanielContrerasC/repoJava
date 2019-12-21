package com.proyecAmazonViewer.model;

import java.util.ArrayList;

public class Series extends Film {

    private int id;
    private int sessionQuantity;
    private ArrayList<Chapter> chapters;

    public Series(String title, String genre, String creator, int duration, int sessionQuantity, ArrayList<Chapter> chapters) {
        super(title, genre, creator, duration);
        this.sessionQuantity=sessionQuantity;
        this.chapters=chapters;


    }

    public int getId(){
        return id;
    }

    public int getSessionQuantity() {

        return sessionQuantity;
    }

    public void setSessionQuantity(int sessionQuantity) {

        this.sessionQuantity = sessionQuantity;
    }

    public ArrayList<Chapter> getChapters() {

        return chapters;
    }

    public void setChapters(ArrayList<Chapter> chapters) {

        this.chapters = chapters;
    }
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "\n ::SERIE ::" +
    			"\n Title: " + getTitle()+
    			"\n Genero: "+ getGenre()+
    			"\n Year: " + getYear()+
    			"\n Creator: "+getCreator()+
    			"\n Duration: " +getDuration();
    }

    public static ArrayList<Series> makeSeriesList(){
        ArrayList<Series> series = new ArrayList<>();

        for (int i = 1; i<=5; i++){
            series.add(new Series("Series " +i, "genero "+ i, "creator: " +i, 1200, 5, Chapter.makeChaptersList()));
        }
        return series;
    }


}
