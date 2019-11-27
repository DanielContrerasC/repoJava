package com.proyecAmazonViewer.model;

import java.util.Date;

public class Book {
    private int id;
    private String title;
    private Date editionDate;
    private String editorial;
    private String[] autors;
    private String isbn;
    private boolean reader;
    private int timeReaded;

    public Book(String title, Date editionDate, String editorial, String isbn) {
        super();
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;
        this.isbn = isbn;
    }
}
