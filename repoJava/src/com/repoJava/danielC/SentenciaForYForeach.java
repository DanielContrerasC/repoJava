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

        /*
        Que significa.
         break: sirve para finalizar el ciclo en el que se encuentrepara
        para el caso de for o un while,para el swich sirve para en cuanto se cumpla la condicion
        del case, no evalue mas.

        continue : Sirve para omitir una instruccion dentro del ciclo o saltarse uno de los pasos

        return : Al usarlo en metodos, le indicamos que dato debe retornar(para esto el metodo
        no debe de ser void ), en el caso de los ciclos es para interrunpir ese ciclo y pasar
        a las siguientes sentencias de control.






         */

        
        
    }
}
