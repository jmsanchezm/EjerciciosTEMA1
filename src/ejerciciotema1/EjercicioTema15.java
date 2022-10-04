package ejerciciotema1;

import java.util.Scanner;

public class EjercicioTema15 {

	public static void main(String[] args) {
		//Declaramos variables.
		int a, b, c, x; //En estas variables se guardarán datos introducidos por el usuario.
		int y;//En esta se guardará el valor del resultado de la fórmula dada en el enunciado.
		//Creamos el Scanner 
		Scanner read = new Scanner (System.in);
		//Solicitamos al usuario datos y obligamos al Scanner a que lea el teclado.
		System.out.println("Introduzca el valor de a: ");
			a = read.nextInt();
		System.out.println("Introduzca el valor de b: ");
			b = read.nextInt();
		System.out.println("Intoduzca el valor de c: ");
			c = read.nextInt();
		System.out.println("Introdzca el valor de x:");
			x = read.nextInt();
		//Utilizamos la fórmula para calcular y.
			y = (a*(x*x))+(b*x)+c;
		//Se le mostrará el resultado al usuario.
		System.out.println("El valor de y es: " + y);
		//Finalmente, cerramos el Scanner.
		read.close();
		
	}
}
