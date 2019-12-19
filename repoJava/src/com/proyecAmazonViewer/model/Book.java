package com.proyecAmazonViewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Book  extends Publicacion implements IVisualizable {
    private int id;
    private String isbn;
    private boolean readed;
    private int timeReaded;

    public Book(String title, Date editionDate, String editorial, String[] authors) {
        super(title, editionDate, editorial);
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

    public static ArrayList<Book> makeBookList(){
        ArrayList<Book> books = new ArrayList<>();

        for (int i = 0; i <=5 ; i++) {
            books.add(new Book("Book: " + i, 22,"fxf", "Abc"));

        }
        return books;
    }
}
