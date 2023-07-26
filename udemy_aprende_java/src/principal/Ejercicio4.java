package principal;

/*
Realizar un programa que nos indique hasta que número natural, empezando por
el 1, tendremos que sumar para llegar a superar el 1000.
*/

public class Ejercicio4 {

	public static void main(String[] args) {

		System.out.println("El resultado es " + obtenerVeces(1, 1000));

	}

	static int obtenerVeces(int a, int b) {
		var contador = 0;
		var suma = a;

		while (suma < b) {
			contador++;
			suma += contador;

		}
		return contador;
	}
}
