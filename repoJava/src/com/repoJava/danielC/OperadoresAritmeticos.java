package com.repoJava.danielC;

public class OperadoresAritmeticos {

    /*Los operdores aritmeticos son los  siguientes.
        suma  a+b , Sustraccion o resta  a-b, multipĺicacion a *b,
        division a/b, modulo  a%b,

         Tambien el operdor suma nos sirve para concatenar (agregar) un dato a otro
     */

    public static void main(String[] args) {

        int a =1;
        int aa = a +a;
        System.out.println("el valor de  aa = " + aa);

        double x = 2.56;
        int y = 9;
        float w =(float)x+y;

        double k =4/0.000002;
        System.out.println("El valor de k es = "+k);

        System.out.println("el valor de w es = " +w * 2);

        System.out.println("El numero de usar el modulo de 7%2 es ="+7%2);

        int f =2;
        int g = 3;
        //f = f +g;
        f=+g;
        System.out.println( "valor de f ="+f);



    }
}
