package pruebas2;

import java.util.Scanner;

public class MainCasteo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double a;
		double b;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresar el valor de A:");
		a = teclado.nextDouble();
		System.out.println("Ingrese el valor de B:");
		b = teclado.nextDouble();

		double aMasb = a + b;
		int aMasbInt = (int) aMasb;

		double aMenosb = a - b;
		double bMenosa = b - a;

		double aPorb = a * b;

		if (b != 0) {
			double aDivb = a / b;
		} else {
			System.out.println("No se puede dividir por cero. (valor de B)");
		}
		if (a != 0) {
			double bDiva = b / a;
		} else {
			System.out.println("No se puede dividir por cero. (valor de A)");
		}

		System.out.println("La suma de los dos valores es:" + (String.format("%.20f",aMasb)));
		System.out.println("y de con numeros enteros, sería: " + aMasbInt );
		
		System.out.println("La resta de A menos B es:" + (String.format("%.20f",aMenosb)));
		System.out.println("y de con numeros enteros, sería: " + (int)aMenosb );
		
		System.out.println("La resta de B menos A es:" + (String.format("%.20f",bMenosa)));
		System.out.println("y de con numeros enteros, sería: " + (int)bMenosa );
		
		System.out.println("La multiplicacion es:" + (String.format("%.20f",aPorb)));
		System.out.println("y de con numeros enteros, sería: " + (int)aPorb );	
		

		
		teclado.close();

	}

}
