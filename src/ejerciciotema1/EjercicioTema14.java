package ejerciciotema1;

import java.util.Scanner;

public class EjercicioTema14 {

	public static void main(String[] args) {
		//Declaramos variables.
		float base; //En esta variable se guardará el valor introducido, en este caso, de la base del triángulo.
		float altura; //En esta variable se guardará el valor introducido, en este caso, de la altura del triángulo.
		float area; //En esta variable será el resultado del cálculo del área.
		//Creamos el Scanner
		Scanner read= new Scanner (System.in);
		//Solicitamos al usuario el valor de la base.
		System.out.println("Introduzca la base del triángulo: ");
		//Obligamos al Scanner a que lea el dato introducido.
				base = read.nextFloat();	
		//Solicitamos al usuario el valor de la altura.
		System.out.println("Introduzca la altura del triángulo: ");
		//Obligamos al Scanner a que lea el dato introducido.
				altura = read.nextFloat();
		//Para calcular el área utilizaremos la fórmula del cálculo de área. Se dará como resultado la variable area.
				area = base*altura/2;
		//Mostramos en pantalla al usuario el resultado.
		System.out.println("El área del triángulo es de " + area +".");
		//Finalmente, cerramos el Scanner.
		read.close();
	}

}
