package principal;

import java.util.Scanner;

/*
 Realizar un programa que solicite la introduccion de una cadena de texto por teclado,
 que consistira en una lista de nombres separados por una coma. A continuación, el programa
 solicitara al usuario un nombre y nos indicara el número de veces que ese nombre aparece
 en la lista de nombres introducida.

Ana,Pablo,Juan,Valerio,Pablo,Rebeca,Elena,Pablo,Julio,Laura,Valerio
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		obtenerNombres();
	}

	static void obtenerNombres() {
		var cont = 0;
		try (var sc = new Scanner(System.in)) {
			var cadena = sc.nextLine();
			var nombre = sc.nextLine();
			String[] nombres = cadena.split(",");

			for (var x : nombres) {
				if (x.equalsIgnoreCase(nombre)) {
					cont++;
				}
			}
			System.out.println("El nombre " + nombre + " fué repetido " + cont + " veces.");
		}
	}

}
