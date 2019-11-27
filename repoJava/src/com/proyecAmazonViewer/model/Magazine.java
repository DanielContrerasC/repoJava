package com.proyecAmazonViewer.model;

import java.util.Date;

public class Magazine {

    private int id;
    private String title;
    private Date editionDate;
    private String editorial;ls 
    private String[] autors;

    public Magazine(String title, Date editionDate, String editorial) {
        super();
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;
    }
}
