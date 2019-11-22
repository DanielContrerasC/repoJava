package com.repoJava.danielC;

public class SentenciaForYForeach {
    public static void main(String[] args) {

        /*
        Con la sentencia for se puede manejar el indice y generar mas contenido
        en la sentencia segun sea los requerimientos del desarrollo que se esta
        ejecutado
         */

        for (int i = 0; i <=5 ; i++) {

            System.out.println("i es menor que 5 " +i);
        }

        System.out.println();
        int [] numeros = new int[5];
        for (int c = 0; c<5; c++){
            numeros[c]=c;
            System.out.println("Numeros ["+c+"]: " +numeros[c]);
        }
        /*
        el for each es una forma mas rapida de poder ejecutar el bucle.
        aunque no c tiene acceso a el indice
         */


        for (int j:numeros ) {
            System.out.println(j);

        }

        
        
    }
}
