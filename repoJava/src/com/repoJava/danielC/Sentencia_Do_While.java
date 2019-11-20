package com.repoJava.danielC;

public class Sentencia_Do_While {
    public static void main(String[] args) {
        /*
        SEntencia Do While

            Sintaxis
            do{
                Instrucciones

            }while(condicion)

            En esta sentencia, al menos se ejecutara una vez las instrucciones
            que esten dentro del  de los corchetes y el while los comparara y si la sentencia se
            cumple nuevamente entra en el ciclo  de  Do While.

                 */
        int exit =0;
        do{
            System.out.println("BIENVENIDOS A AMAZON VIEW");
            System.err.println("");
            System.out.println("Selecciona el menu de la opcion deseada");
            System.out.println("1. Movies ");
            System.out.println("2. Series ");
            System.out.println("3. Books  ");
            System.out.println("4. Magazines");
            System.out.println("0. Exit ");

        }while (exit !=0);

    }
}
