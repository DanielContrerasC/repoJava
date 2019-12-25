package com.AmazonReport.makeReport;

public class Main {

    public static void main(String[] args){

    Report report = new Report();
    report.setNameFile("Reporte");
    report.setTitle("Titulo del Reporte:: \n");
    report.setExtension("txt");
    String content= "";
    for( int i = 0; i< 5; i ++){
        content +=" \n Reporte: " + i;
    }
    report.setContent(content);
    report.makeReport();

    }
}
