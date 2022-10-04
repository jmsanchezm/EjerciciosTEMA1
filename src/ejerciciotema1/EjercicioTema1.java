package ejerciciotema1;

import java.util.Scanner;

public class EjercicioTema1 {

	public static void main(String[] args) {
//Declaramos variables.
			double numeroDecimal; //Será el valor introducido por el usuario.
			double numeroEntero; // Será el número que le devolveremos al usuario sumándole 0,5.
//Creamos el Scanner para que la máquina lea los datos introducido por el usuario.
		Scanner read= new Scanner (System.in);
//Solicitamos al usuario un número con decimales.
		System.out.print("Introduzca un número con decimales: ");
//Obligamos al Scanner que lea la línea.
				numeroDecimal = read.nextDouble();
//Al número introducido le sumamos 0,5, que nos dará como resultado un número mayor al anterior.
				numeroEntero = numeroDecimal + 0.5;
/* Usando casting, pasamos el número dado a número entero. Con esto, se le mostrará en pantalla
al usuario el resultado aproximado.*/
		System.out.print("El número redondeado es: " + (int) numeroEntero);
//Finalmente, cerramos el Scanner.
		read.close();

	}

}
