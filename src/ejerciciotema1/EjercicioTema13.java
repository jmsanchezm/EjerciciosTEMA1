package ejerciciotema1;

import java.util.Scanner;

public class EjercicioTema13 {

	public static void main(String[] args) {
//Declaramos variables.
			int num1; /*En este valor se guardará unos de los valores introducidos por el usuario.
Y al que hay que sumarle para llegar a múltiplo de num2*/
			int num2; //En este valor se guardará unos de los valores introducidos por el usuario.
			int resto; //Se guardará el resto del módulo.
			int numFinal; // Variable que se le mostrará al usuario en pantalla.
//Creamos el Scanner.
			Scanner read= new Scanner (System.in);
//Solicitamos al usuario un número, en este caso será num1.
		System.out.print("Introduzca un número: ");
//Obligamos al Scanner a que lea lo introducido por el usuario.
				num1 = read.nextInt();
//Solicitamos al usuario otro número.Se guardará como la variable num2.
		System.out.print("Introduzca otro número: ");
//Obligamos al Scanner a que lea lo introducido por el usuario.
				num2 = read.nextInt();
//Calculamos el resto de la división utilizando el módulo.
				resto = num1 % num2 ;
//Para calcular el número que se le mostrará en pantalla al usuario, se restará num2 menos el resto dado anterior.
				numFinal = num2 - resto ;
//Utilizando un ternario, daremos la condición de si el resultado es cero, se muestre cero, por el contrario, se muestre el numFinal.
							numFinal = resto == 0 ? 0 : numFinal;
//Mostramos en pantalla al usuario el resultado.
		System.out.print("Hay que sumarle " + numFinal + " para que sea múltiplo de " + num2);
//Cerramos el Scanner.
							read.close();

		}
	
}