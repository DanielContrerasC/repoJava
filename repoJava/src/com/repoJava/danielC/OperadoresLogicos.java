package com.repoJava.danielC;

public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean n=false;
        boolean m=true;
        /*
        Estos operadores se usan mucho o regularmente en las sentencias if, while, for para la toma de decisiones o la repetición de algún procedimiento, para comprender mejor los operadores lógicos se necesita conocer la Tablas de verdad:
        En resumen la tabla Conjunción o AND:
        1.- para que de como resultado Verdadero los valores de a y b tiene que ser Verdaderos
        2.- si un valor en a o b es falso el resultado sera Falso

        La tabla Disyunción o OR:
        1.- es lo contrario de el AND para que su resultado sea Verdadero basta con que algun valor en a o b sea Verdadero
        2.- para que su resultado sea Falso los valores en a y b tiene que ser Falsos
         */

        System.out.println("n && m -> " +(n && m));
        System.out.println("n || m -> " +(n||m));
        System.out.println("!n->  " +(!n) );
        System.out.println("!m->  " +(!m) );
    }
}
