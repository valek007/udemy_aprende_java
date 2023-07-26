package principal;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
Realizar un programa que muestre el siguiente menú:

1. Agregar nota
2. Ver nota media
3. Ver aprobados
4. Salir

Al elegir 1, se le pedira al usuario introducir una nota.
El programa almacena un máximo de 10 notas, por si llegas
al final se mostrara un mensaje de advertencia.

Al elegir 2, se mostrara la nota media de todas las notas
ya introducidas.

Al elegir 3, se mostrara los aprobados que existen hasta el momento.

Después de procesar cualquier opción, nos volvera a mostrar el menú.

Al elegir 4, finaliza el programa
*/
public class Ejercicio7 {

	static int cont = 0;
	static double[] notas = new double[5];

	public static void main(String[] args) {
		arrancarPrograma();
	}

	static void mostrarMenu() {
		System.out.println("1. Agregar nota");
		System.out.println("2. Ver nota media");
		System.out.println("3. Ver aprobados");
		System.out.println("4. Salir");
	}

	static boolean sumaNota(Scanner sc) {
		if (cont == 5) {
			System.out.println("Has alcanzado el máximo de notas que puedes introducir.");
			return false;
		}
		System.out.println("Introduce la nota " + cont);
		var nota = Double.parseDouble(sc.nextLine());
		if (nota >= 0 && nota <= 10) {
			notas[cont] = nota;
			cont++;
		} else {
			System.out.println("La nota tiene que ser entre 0 y 10");
		}
		return true;
	}

	static void arrancarPrograma() {

		try (var sc = new Scanner(System.in)) {
			var opc = 0;
			do {
				mostrarMenu();
				opc = Integer.parseInt(sc.nextLine());
				switch (opc) {
				case 1 -> {
					if (sumaNota(sc))
						System.out.println("La nota se ha introducido.\n");
				}
				case 2 -> System.out.println("La media es: " + Arrays.stream(notas).average().orElse(0.0));
				case 3 -> {
					String notasAprobadas = Arrays.stream(notas).filter(n -> n > 4).mapToObj(Double::toString)
							.collect(Collectors.joining(" "));
					System.out.println("Las notas aprobadas son: " + notasAprobadas);
				}
				case 4 -> System.out.println("Has salido del programa");
				default -> System.out.println("Opción incorrecta");
				}
			} while (opc != 4);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("Error de introducción de datos");
		}
	}
}
