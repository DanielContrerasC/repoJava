package com.repoJava.danielC;

public class OperadoresDeIncrementoYDecremento {
    public static void main(String[] args) {

        //i++
        //++i
        //i++ incrementa el valor de i
        //++i iguala el valor de i

        /*La oeracion funciona segun el orden de las operaciones a ejecutar
                 */

        int i = 3;
        int l = 4;

        System.out.println( "i = " + i + " l = " +l);

        l++;
        System.out.println("l++ incrementando el valor de l. l + l = " +l);

        ++i;

        System.out.println("la primera operacion que hace es igualar el valor la segunda incrementa el valor de i ." + i );

    }
}
