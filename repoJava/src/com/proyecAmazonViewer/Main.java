package com.proyecAmazonViewer;
import com.proyecAmazonViewer.model.Movie;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
                                                               /*para corregir el error se le hizo un casting con Short al campo years por que marca el error de que no es un campo entero*/
        Movie movie= new Movie("Coco", "Animation", (short)2017 );
        //showMenu();


    }

    public static void showMenu(){

        int exit =0;
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
            int response =1;

            switch (response){
                case 0:
                    //salir
                    exit =0;
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
                case 6:
                    makeReport(new Date());
                    break;
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
        do{
            System.out.println();
            System.out.println("::MOVIES ::");
            System.out.println();
        }while (exit!=0);
    }

    public static void showSeries(){
        int exit= 0;
        do{
            System.out.println();
            System.out.println("::SERIES ::");
            System.out.println();
        }while (exit!=0);
    }

    public static void showChapters(){}

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


