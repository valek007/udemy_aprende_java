package principal;

import java.util.Scanner;

/*
 Realiza un programa, capaz de contar el total de vocales de una cadena de texto introducida por consola.
 
 -Estamos aprendiendo Java
 */

public class Ejercicio8 {

	public static void main(String[] args) {
		System.out.println(obtenerVocales());
	}
	
	static String obtenerVocales() {
		
		try (var sc = new Scanner(System.in)) {
			var cadena = sc.nextLine();
			cadena = cadena.toLowerCase();
			var cont = 0;
			char letra;
			for(var i = 0; i < cadena.length(); i++) {
				
				letra = cadena.charAt(i);
				switch (letra) {
				case 'a','e','i','o','u','y':
					cont++;
					break;
				default:
					break;
				}
			}
			return "Total de vocales: "+cont;
		}
	}
}
