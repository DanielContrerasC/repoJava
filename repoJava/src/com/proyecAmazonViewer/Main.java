package com.proyecAmazonViewer;
import com.proyecAmazonViewer.model.Book;
import com.proyecAmazonViewer.model.Chapter;
import com.proyecAmazonViewer.model.Movie;
import com.proyecAmazonViewer.model.Series;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*para corregir el error se le hizo un casting con Short al campo years por que marca el error de que no es un campo entero*/
        //Movie movie= new Movie("Coco", "Animation", (short)2017 );
        //movie.setTitle("Rambo");
        showMenu();
    }

    public static void showMenu(){

        int exit =1;
        do{
            System.out.println("BIENVENIDOS A AMAZON VIEW");
            System.err.println("");
            System.out.println("Selecciona el menu de la opcion deseada");
            System.out.println("1. Movies ");
            System.out.println("2. Series ");
            System.out.println("3. Books  ");
            System.out.println("4. Magazines");
            System.out.println("5. Make Report");
            System.out.println("6. Make report Today");//mostrara ordenes por fecha
            System.out.println("0. Exit ");
            System.out.println();

            Scanner sc =new Scanner(System.in);
            //int response = Integer.valueOf(sc.nextLine());
            int response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 0:
                    //salir
                    exit = 0;
                    break;
                case 1:
                    showMovies();
                    break;
                case 2:
                    showSeries();
                    break;
                case 3:
                    showBooks();
                    break;
                case 4:
                    showMagazines();
                    break;
                case 5:
                    makeReport(new Date());
                    break;
                case 6:
                    makeReport(new Date());
                default:
                    System.out.println();
                    System.out.println("....!!Selecciona Una Opcion¡¡....");
                    System.out.println();
                    break;
            }

        }while (exit != 0);

    }

    public static void showMovies(){
        int exit= 0;

        ArrayList<Movie> movies = Movie.makeMoviesList();
        do{
            System.out.println();
            System.out.println(":: MOVIES ::");
            System.out.println();

            for (int i = 0; i < movies.size(); i++) {
                System.out.println(i + 1 + ". " + movies.get(i).getTitle()+" Visto: "+ movies.get(i).isViewed());
            }

            System.out.println("0.Regresar al menu anterior. ");
            System.out.println();

            //Leer Respuesta Ususario
            Scanner sc = new Scanner(System.in);
            int response = Integer.valueOf(sc.nextLine());

            if (response==0){
                showMenu();
            }

            Movie movieSelected = movies.get(response-1);
            movieSelected.setViewer(true);
            Date dateI = movieSelected.startToSee(new Date());

            for (int i = 0; i <100000 ; i++) {
                System.out.println("........");
            }

            //Termina de verla
            movieSelected.stopToSee(dateI, new Date());
            System.out.println();
            System.out.println("Viste: " + movieSelected);
            System.out.println("Por: " +movieSelected.getTimeViewer() + " milisegundos");

        }while (exit!=0);
    }

    public static void showSeries(){
        int exit= 1;
        ArrayList<Series> series = Series.makeSeriesList();
        do{
            System.out.println();
            System.out.println("::SERIES ::");
            System.out.println();

            for (int i = 0; i <series.size() ; i++) {//1. Serie 1
                System.out.println(i +1 + " . " + series.get(i).getTitle()+" Visto " + series.get(i).isViewed());
            }
            System.out.println("0. Regresa al menu");
            System.out.println();

            // Leer la respuesta usuario

            Scanner sc = new Scanner((System.in));
            int response = Integer.valueOf(sc.nextLine());

            if (response==0){
                showMenu();
            }

            showChapters(series.get(response-1).getChapters());


        }while (exit!=0);
    }

    public static void showChapters(ArrayList<Chapter> chaptersOfSeriesSelected){
        int exit =0;
        do {
            System.out.println();
            System.out.println(":: CHPATERS ::");
            System.out.println();

            for (int i =0; i<chaptersOfSeriesSelected.size(); i++){
                System.out.println(i + 1 +" . "+ chaptersOfSeriesSelected.get(i).getTitle()+ "Visto " +chaptersOfSeriesSelected.get(i).isViewed());

            }

            System.out.println("0. Regresa al Menu");
            System.out.println();

            //Leer reespuesta usuario
            Scanner sc = new Scanner(System.in);
            int response =Integer.valueOf(sc.nextLine());

            if(response == 0){
                showMenu();
            }

            Chapter chapterSelected = chaptersOfSeriesSelected.get(response-1);
            chapterSelected.setViewer(true);
            Date dateI = chapterSelected.startToSee(new Date());

            for (int i = 0; i < 10000; i++) {
                System.out.println(".........");

            }

            //Terminar de verla

            chapterSelected.stopToSee(dateI, new Date());
            System.out.println();
            System.out.println("Viste: "+ chapterSelected);
            System.out.println("Por: " + chapterSelected.getTimeViewer()+" Milisegundos");
        }while (exit == 0);

    }

    public static void showBooks(){
        int exit= 0;
        do{
            System.out.println();
            System.out.println("::BOOKS ::");
            System.out.println();


        }while (exit!=0);
    }

        public static void showMagazines(){
            int exit= 0;
                do{
                    System.out.println();
                    System.out.println("::MOVIES ::");
                    System.out.println();
                }while (exit!=0);
         }
         public static void makeReport(){


         }

         public static void makeReport(Date date){

         }

    }


