package com.proyecAmazonViewer.model;

import java.util.Date;

public class Book  extends Publicacion implements IVisualizable {
    private int id;
    private String isbn;
    private boolean readed;
    private int timeReaded;

    public Book(String title, Date editionDate, String editorial, String[] authors) {
        super(title, editionDate, editorial, authors);
        setAuthors(authors);

    }



    public int getId() {

        return id;
    }


    public String getIsbn() {

        return isbn;
    }

    public void setIsbn(String isbn) {

        this.isbn = isbn;
    }

    public boolean isReaded() {
        return readed;
    }

    public void setReaded(boolean readed) {

        this.readed = readed;
    }

    public int getTimeReaded() {

        return timeReaded;
    }

    public void setTimeReaded(int timeReaded) {
        this.timeReaded = timeReaded;
    }
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	String detailBook="\n ::BOOK ::"+
    					  "\n Title: "+getTitle()+
    					  "\n Editorial: " +getEditorial()+
    					  "\n Editorial Date: "+getEditionDate()+
    					  "\n Authors: ";
    	for (int i=0; i<getAuthors().length;i++) {
    		detailBook += "\t" +getAuthors()[i];
    	}
    	return detailBook;
    }

    @Override
    public Date startToSee(Date dateI) {
        return dateI;
    }

    @Override
    public void stopToSee(Date dateI, Date dateF) {

        if (dateF.getSeconds()>dateI.getSeconds()){

            setTimeReaded(dateF.getSeconds() - dateI.getSeconds());
        }else{
            setTimeReaded(0);
        }

    }


}
