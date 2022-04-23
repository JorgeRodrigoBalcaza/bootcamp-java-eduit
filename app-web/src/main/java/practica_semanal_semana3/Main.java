package practica_semanal_semana3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Ingrese la cantidad a alumnos a cargar");
		Scanner teclado = new Scanner(System.in);
		int cantAlumnos = teclado.nextInt();
		Alumno[] alumnos = new Alumno[cantAlumnos];
		System.out.println("Ingrese la cantidad de examenes que tuvo el curso:");
		int cantExamenes = teclado.nextInt();

		float promedioMax = 0;
		float promedioMin = 0;

		for (int i = 0; i < cantAlumnos; i++) {
			System.out.println("Ingrese el nombre del alumno " + (i + 1) + " ");
			String nombre = teclado.next();
			System.out.println("Ingrese el apellido del alumno " + (i + 1) + " ");
			String apellido = teclado.next();

			// cree la instacia de alumno
			Alumno alumno = new Alumno();
			alumno.setNombre(nombre);
			alumno.setApellido(apellido);
			float total = 0;
			float[] examenes = new float[cantExamenes];

			for (int j = 0; j < cantExamenes; j++) {
				/*
				 * System.out.println("Ingrese el numero de examen"); int numeroExamen =
				 * teclado.nextInt();
				 */
				System.out.println(
						"Ingresar la nota del examen N°: " + (j + 1) + " del alumno: " + nombre + " " + apellido);
				float nota = teclado.nextFloat();

				/*
				 * Examen examen = new Examen(); examen.setNumero(numeroExamen);
				 * examen.setNota(nota);
				 */

				examenes[j] = nota;
				total += nota;

			}

			alumno.setPromedio(total / cantExamenes);
			// cargo el alumno en el array
			alumnos[i] = alumno;

		}

		for (int i = 0; i < cantAlumnos; i++) {
			int min = 0;

			for (int j = 1; j < cantAlumnos - i; j++) {
				if (alumnos[j].getPromedio() < alumnos[min].getPromedio()) {
					min = j;
				}
			}

			Alumno tmp = alumnos[min];
			alumnos[min] = alumnos[cantAlumnos - i - 1];
			alumnos[cantAlumnos - i - 1] = tmp;
		}

		System.out.println(alumnos[0].getNombre() + " " + alumnos[0].getApellido() + " - Promedio: " + alumnos[0].getPromedio());
		
		for (int i = 1; i < cantAlumnos; i++) {
			if(alumnos[i].getPromedio() == alumnos[0].getPromedio()) {
				System.out.println(alumnos[i].getNombre() + " " + alumnos[i].getApellido() + " - Promedio: " + alumnos[i].getPromedio());
			} else {
				break;
			}
		}
		
		System.out.println(alumnos[cantAlumnos - 1].getNombre() + " " + alumnos[cantAlumnos - 1].getApellido() + " - Promedio: " + alumnos[cantAlumnos - 1].getPromedio());

		for (int i = cantAlumnos - 2; i >= 0; i--) {
			if(alumnos[i].getPromedio() == alumnos[cantAlumnos - 1].getPromedio()) {
				System.out.println(alumnos[i].getNombre() + " " + alumnos[i].getApellido() + " - Promedio: " + alumnos[i].getPromedio());
			}  else {
				break;
			}
		}
		System.out.println("Alumnos que promocionan: ");
		for (int i = 0; i < cantAlumnos ; i++) {
			if (alumnos[i].getPromedio() >= 7.0f ) { 
				System.out.println(alumnos[i].getNombre() + " " + alumnos[i].getApellido());
			} else {
				break;
			}
			
		}
		
		System.out.println("Alumnos que reprobaron: ");
		for (int i = cantAlumnos - 1; i >= 0 ; i--) {
			if (alumnos[i].getPromedio() < 7.0f ) { 
				System.out.println(alumnos[i].getNombre() + " " + alumnos[i].getApellido());
			} else {
				break;
			}
			
		}
		
		
	}

}
