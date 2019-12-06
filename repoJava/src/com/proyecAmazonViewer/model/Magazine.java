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

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\n :: MAGAZINE ::" +
                "\n Title: "+ getTitle() +
                "\n Edition: " +
        ;
    }
}
