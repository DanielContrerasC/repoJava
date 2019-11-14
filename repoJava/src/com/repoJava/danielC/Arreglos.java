package com.repoJava.danielC;

public class Arreglos {
	/*Los arreglos se pueden definir como OBJETOS en los que podemos
	 * guardar mas de una variable.
	 * 
	 * Declaracion de Arreglos  : Tipo de Dato [] nombreVariable;
	 * 							  Tipo de Dato nombreVariable[];
	 * 
	 * Definir el tamaño de los arreglos:
	 * 
	 * nombreVariable =new TipoDeDato[capacidad]
	 * 
	 * La cantidad de dimeciones va a depender de la cantidad de corchetes que se pongas 
	 * Y la cantidad de elementos se coloca dentro de los corchetes[] [] [] N-Dimenciones
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Arrays Ejemplo
		
		//int [] arregloInt;
		//Arreglo de una dimencion [] , y declarando la capacidad del arreglo[n-elementos]
		int [] arregloInt = new int[3];
		double arregloDouble []; 
		
		//Arreglo de dos dimenciones
		
		/*la asignacion es por renglones y columnas como si fuera
		 * un excel o una matris. El primer arreglo son los renglones y el segundo las columnas
		 */
		
		int [][] array2D=new int[2][3];// En este arreglo le caben 6 elemenos por que se hace la multiplicacion de 2 x 3
		
		int [][][] array3D =new int[3][3][2];// En este arreglo le caben 18 elementos por que se multiplico 3 x 3 x 2
		
		//int [][][][] array4D =new int[a][b][c][d];
		
		/*Arreglos de mas de 4 dimenciones. En este punto ya no se recomienda  este tipod de practicas
		ya que se vuelve ccomplicado la lectura  de los datos ademas de que el tipo de memoria donde se almacenan
		estos datos es volatil y se pierden cuando se termina el programa.Se recomienda ocupar las bases de datos*/
		
		char [][] days = {{'a','b', 'c'},{'a','b','c'}};
		
		char [][][] letters = { { {'a','b','c'},{'a','b','c'},{'a','b','c'}}, {{'a','b'},{'a','b'},{'a','b'} } };
		
		/*La forma de ubicar elementos sera por medio de indices
		 * 
		 *                                 COLUMNAS
		 * -----------------------------------|----------------------
		 *                         |          |               |
		 *                         |         \|/              |
		 ------------------------------------ /------------------------
		 *                         |                          |
		 *    RENGLONES- ---->     |                          |
		 ------------------------------------------------------------
		 Si queremos ubicar un elemento en el arreglo diremos RENGLON N ,COLUMNA N HE INTERIOR N(el interior para un elemento
		 dentro de otro arreglo) Seria (Renglom)(Columna)(Interior)
		  
		 */
		
		/*Asignando valores a los arreglos*/
		
		char[] names=new char[4];
		names[0]='H';
		names[1]='O';
		names[2]='L';
		names[3]='A';
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		
		//buscando un elemnto en un arreglo
		
		char [][][][] monkey=new char[2][3][2][2];
		monkey[1][0][0][1]='m';
		System.out.println(monkey [1][0][0][1]);		
		
			
		}

	}


