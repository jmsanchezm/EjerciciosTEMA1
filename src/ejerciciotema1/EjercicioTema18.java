package ejerciciotema1;

import java.util.Scanner;

public class EjercicioTema18 {

	public static void main(String[] args) {
		int entradasInfantiles;
		int entradasAdultos;
		final double PRECIO_INFANTIL = 15.50;
		final int PRECIO_ADULTO = 20 ;
		double total;
		double descuento;
		double cifraDescuento;
		double cifraFinal;
		Scanner read = new Scanner(System.in);
		System.out.println("Introduzca la cantidad de entradas infantiles: ");
			entradasInfantiles = read.nextInt();
		System.out.println("Introduzca la cantidad de entradas para adultos: ");
			entradasAdultos = read.nextInt();
			
			total = (PRECIO_INFANTIL*entradasInfantiles) + (PRECIO_ADULTO*entradasAdultos);
			descuento = (total*5) /100;
			cifraDescuento = total + descuento;
			cifraFinal = total >=100 ? cifraDescuento : total;
		
		System.out.println("El total a pagar es de " + cifraFinal + " euros.");
		
		

	}

}
