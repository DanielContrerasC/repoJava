package com.proyecAmazonViewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Book  extends Publicacion implements IVisualizable {
    private int id;
    private String isbn;
    private boolean reader;
    private int timeReaded;

    public Book(String title, Date editionDate, String editorial, String[] authors, String isbn, boolean reader, int timeReaded) {
        super(title, editionDate, editorial, authors);
        this.isbn = isbn;
        this.reader = reader;
        this.timeReaded = timeReaded;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isReader() {
        return reader;
    }

    public void setReader(boolean reader) {
        this.reader = reader;
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

    public static ArrayList<Book> makeBookList(){
        ArrayList<Book> books = new ArrayList<>();
        return books;
    }
}
