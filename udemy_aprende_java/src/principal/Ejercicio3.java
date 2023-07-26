package principal;

/*
 Realizar un programa que calcule la suma de todos los números pares
 comprendidos entre dós números de datos
 */

public class Ejercicio3 {

	public static void main(String[] args) {

		System.out.println("La suma de los pares es " + sumaNumerosPares(2, 7));
	}

	static int sumaNumerosPares(int a, int b) {
		var resultado = 0;
		var i = (a < b) ? a : b;
		var max = (a > b) ? a : b;

		for (; i <= max; i++) {
			if (i % 2 == 0) {
				resultado += i;
			}
		}
		return resultado;
	}
}
