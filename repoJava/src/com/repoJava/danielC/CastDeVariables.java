package com.repoJava.danielC;

public class CastDeVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//En programación hay situaciones en las se necesitan cambiar el tipo de dato en otro.Para hacerlo
//		podemos usar cast es decir que tomamos un dato y lo trnasformamos en potro tipo de dato.
		//Se puede realizar el cast para todos los datos primitivos, con excepción de boolean, por la 
		//naturalidad del tipo de dato boolean.
		
		//Cast
		//Tipo de Datos primitivos
		//Tipo de Objetos primitivos
		
		//Reconocer un tipo de dato en casteo.
		
		//double d=86.45;
		//int i = (int)d; cuando se observe una variable y esta tenga el valor en medio de un parentesis eso es un casteo
		
		//Ejemplos
		
		byte b = 6;
		// en este tipo de casteo No se ve por que es algo ya implicito
		short s = b;
		
		b=(byte)s; //si se quiere pasar de un short a un byte se necesita el casteo
		
		int i =1;
		double d = 2.5;
		//queremos que double entre en i colocamos la sintaxis de casteo
		i=(int)d;
		
		System.out.println(i);//Lo que hace el casteo es truncar el dato se imprime en cosola solo el numero 2 
		                      //Esta es la forma en la que funciona los tipo de datos flotantes a enteros.
		
		/*En este ejemplo vamos a llevar un numero entero a un valor char. En este caso es el 97 y este valor entra
		directamente al valor ascii 
		Los codigos ASCII son codigo UNICODE*/
		int codigo =97;
		char codigoASCII =(char)codigo;
		System.out.println(codigoASCII);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
