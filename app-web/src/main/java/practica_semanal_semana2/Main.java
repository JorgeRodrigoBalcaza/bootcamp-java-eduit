package practica_semanal_semana2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresar una fecha válida (dd/mm/aaaa)");
		System.out.println("Dia: ");
		int dd = teclado.nextInt();
		System.out.println("Mes: ");
		int mm = teclado.nextInt();
		System.out.println("Año: ");
		int yyyy = teclado.nextInt();

		String correcto = "La fecha es correcta";
		String incorrecto = "La fecha NO es correcta";

		if (dd >= 1 && dd <= 31 && mm >= 1 && mm <= 12 && yyyy >= 1900 && yyyy <= 2099) {
			if (mm == 02 && dd == 29) {
				if ((yyyy % 4 == 0 && yyyy % 100 != 0) || (yyyy % 100 == 0 && yyyy % 400 == 0)) {
					System.out.println("Año bisiesto");
					System.out.println(correcto);
					fecha(dd, mm, yyyy);

				} else {
					System.out.println("El año no es bisiesto");
					System.out.println(incorrecto);
					fecha(dd, mm, yyyy);

				}
			}
			if ((mm == 2 || mm == 4 || mm == 6 || mm == 9 || mm == 11) && (dd == 31)) {
				System.out.println(incorrecto);
				fecha(dd, mm, yyyy);

			}
			if (mm == 2 && dd == 30) {
				System.out.println(incorrecto);
				fecha(dd, mm, yyyy);

			}

		} else {
			System.out.println(incorrecto);
			fecha(dd, mm, yyyy);

		}

		teclado.close();

	}

	public static void fecha(int dd, int mm, int yyyy) {
		System.out.println(dd + "/" + mm + "/" + yyyy);
	}

}
