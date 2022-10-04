package ejerciciotema1;

import java.util.Scanner;

public class EjercicioTema12 {

	public static void main(String[] args) {
//Declaramos variables.
		int numeroIntroducido; // Servirá para guardar el valor introducido por el usuario.
		int resto; // En esta variable se guardará el resto dado en el módulo.
		int multiplo7; //
//Creamos el Scanner 
		Scanner read = new Scanner (System.in);
//Solicitamos a un usuario un número.
		System.out.print("Introduzca un número entero para ver cuánto le falta hasta llegar a múltiplo de 7: ");
//Obligamos al Scanner a que lea el número introducido.
			numeroIntroducido = read.nextInt();
//Calculamos el módulo, que nos dará como resultado el resto de la división.
			resto = numeroIntroducido % 7 ;
//Luego, le restamos a 7 el resto para que ver cuánto nos falta para llegar al siguiente múltiplo de 7.
			multiplo7 = 7 - resto ;
//Usando un operador ternario, le ponemos la condición de si el resto es cero, se quede como cero, y si no es cero, se qiede el resto.
			multiplo7 = resto == 0 ? 0 : multiplo7;
//Mostramos en pantalla al usuario el resultado.
			System.out.print("Para llegar al siguiente múltiplo de 7  hacen falta " + multiplo7 + ".");
//Finalmente, cerramos el Scanner.
			read.close();
	}

}
