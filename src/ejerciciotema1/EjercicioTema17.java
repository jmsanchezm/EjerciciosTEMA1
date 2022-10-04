package ejerciciotema1;

import java.util.Scanner;

public class EjercicioTema17 {

	public static void main(String[] args) {
		//Declaramos variables
		int mm; //Se guardará la cantidad de milímetros introducida por el usuario. 
		int cm; //Se guardará la cantidad de centímetros introducida por el usuario. 
		int m; //Se guardará la cantidad de metros introducida por el usuario. 
		int medTotal; // Será el resultado de la suma de las cantidades anteriores.
		//Creamos el Scanner
		Scanner read = new Scanner (System.in);
		//Solicitamos la usuario un cantidad de milímetros.
		System.out.println("Introduzca una cantidad en milímetros: ");
			//Obligamos al Scanner leer el teclado.
			mm = read.nextInt();
		//Solicitamos la usuario un cantidad de milímetros.
		System.out.println("Introduzca una cantidad en centimetros: ");
			//Obligamos al Scanner leer el teclado.
			cm = read.nextInt();
		//Solicitamos la usuario un cantidad de milímetros.
		System.out.println("Introduzca una cantidad en metros: ");
			//Obligamos al Scanner leer el teclado.
			m = read.nextInt();
			//Pasamos las unidades a una sola unidad de medida.
			mm = mm/10;
			m = m * 10;
			//Sumamos las cantidades dadas.
			medTotal = mm + m + cm;
		//Se le mostrará al usuario el resultado de la suma.
		System.out.println("La cantidad total de centímetros es " + medTotal + " cm.");
		//Cerramos el Scanner.
		read.close();
	}

}
