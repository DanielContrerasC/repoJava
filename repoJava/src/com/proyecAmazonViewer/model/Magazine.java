package com.proyecAmazonViewer.model;

import java.util.Date;

public class Magazine extends Publicacion{

    private int id;

    public Magazine(String title, Date editionDate, String editorial, String[] authors) {
        super(title, editionDate, editorial, authors);
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "\n ::MAGAZINE ::" +
    			"\n Title: " +getTitle()+
    			"\n Editorial: " +getEditorial()+
    			"\n Editon Date: "+getEditionDate();
    }

}
