package ejerciciotema1;

import java.util.Scanner;

public class EjercicioTema16 {

	public static void main(String[] args) {
		//Declaramos variables
		int segundos; //Se guardará el dato introducido.
		int min; // Se guardará el resultado de la división entre el resto y 60.
		int resto; // Se guardará el resultado del módulo de segundos entre 60.
		int hora; // Se guardará el resultado de la división entre segundos y 3600.
		//Creamos el Scanner
		Scanner read = new Scanner (System.in);
		//Solicitamos al usuario una cantidad de segundos.
		System.out.println("Intropduzca una cantidad de segundos: ");
		//Obligamos al Scanner, leer el teclado.
			segundos = read.nextInt();
			// Hacemos las operaciones necesarias.
			hora = segundos / 3600;
			resto = segundos% 3600;
			min = resto/60;
			segundos = resto%60;
		//Con esto, le mostrará el resultado al usuario	
		System.out.println("Son " + hora + "horas, "+ min + " minutos, " + segundos +" segundos." );
		//Finalmente, cerramos el Scanner.
		read.close();
	}

}
