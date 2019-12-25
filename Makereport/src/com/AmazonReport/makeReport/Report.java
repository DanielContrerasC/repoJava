package com.AmazonReport.makeReport;

import java.io.*;

public class Report {

    private String nameFile;
    private String Title;
    private String content;
    private String extension;

    public String getNameFile() {
        return nameFile;
    }

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void makeReport(){

        if ((getNameFile()!= null)&&(getTitle() != null)&&(getContent()!=null)){

            // Crear el archivo
            try {
                File file= new File(getNameFile()+"."+getExtension());
                FileOutputStream fos = new FileOutputStream(file);
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                BufferedWriter bw = new BufferedWriter(osw);
                bw.write(getContent());
                bw.close();


            } catch (IOException e) {
                e.printStackTrace();
            }

        }else{
            System.out.println("Ingresa los datos del archivo");
        }

    }
}
