package com.repoJava.danielC;

import javax.swing.*;

public class CiclosForAnidados {
    public static void main(String[] args) {

        //Definimos un array  de 3 filas x 5 colummnas

        int array[][] ={{1,2,3,4,5,}, {6,7,8,9,10},{11,12,13,14,15}};

        //recorremos el array multidimencional

        for(int i=0; i<array.length; i++){
            for (int j = 0; j <array[0].length ; j++) {
                System.out.println(array[i][j]);
            }
        }




    }
}
