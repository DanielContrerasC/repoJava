package com.repoJava.danielC;

public class DatosConPuntoDecimal {
	
	//Uper Camel Case para nombre de las clases y nombre de los archivos

	public static void main(String[] args) {
		
		System.out.println(":)");
		// TODO Auto-generated method stub
		
		// La forma de reconocer los datos primitivos es porque su tipo de dato esta todo en minusculas
		//
		
		//Rango de menoria de byte = -128 a 127 
		//Rango  de memoria de short =-32768 a 32767
		//Rango de memoria de int =-2,147,483,648 o 2,147,483,647
		//Rango de memoria de long = -9,223,372,036,854,775,808 o +9,223,372,036,854,775,808
		
		
		byte edad =127;
		short year =-32768;
		int in_user = 1001;
		long id_twitter = 123456789123456789L;
		
		//Punto Flotante 
		//Rango de memoria 1.40129846432481707e-45 o 4bites
		//Rango de memoria Double 4.94065645841246544e-324d 8bites
			
		//los tipos de datos float se pueden usar para almacenar valores pequeños
		//redondeados a uno o dos decimeles, por ejemplo los promedfios de las notas
		//de los estudiantes  8.5 etc.Los datos double se pueden utilizar para manejar
		//los valores financieros
			float diametro= 34.25f;
			double precio = 1234567.12345678;
			
			//Texto
			// Rango de memoria Unicode 2bites
			char genero = 'f';
			
			//Tipo de datos logicos
			//Rango true o false, 2 bytes
			
			boolean isVisible = true;
			boolean funciona  = false;
			
			//Naming en Java
			//Reglas que tiene java para la declarcion de Variables
			//Java es sensible a mayúsculas y minúsculas.
			//Pueden comnezar con _ ó $
			// No pueden comenzar con numeros
			//Las constantes se escriben en Mayúsculas
			//CamenlCase-Uper Camel case para los nombres de las clases y nombres de archivos
			//es decir que la primera letra que escriba debe ser mayúscula.Lower Camel case-
			//para nombres de variables, objetos y metodos, quiere decir que la primera letra 
			// que la escriba debe ser minúscula
			
			int variable =2;
			System.out.println(variable);
			//System.out.println(Variable); //Error variable no declarada ---Variable cannot be resolved to a variable
			int _variable =3;
			int $variable =4;
			
			System.out.println(variable + "= variable, " + _variable + " = _variable, " + $variable + " = $variable" );
			
			//Nombres en java 
			//Letras posteriores piueden ser letras, numero, $ y "_"
			//Las constantes se escriben en mayusculas y contienen "_"
			
			//Constantes
			
			int VALOR =0;
			int VALOR_MAXIMO=1;
			
			//Uper Camel Case para nombre de las clases y nombre de los archivos
			
			//--public class NombreDeLaClase {}
			
			//Lower Camel Case para nombres de variables y nombres de metodos
			
			int minValor=4;
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
					
					
			
	}

}
