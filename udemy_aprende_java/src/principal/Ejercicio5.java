package principal;

import java.util.Arrays;

/*
Realizar un programa que, dado un array que almacena 10 números
enteros cualquiera, nos muestre la media de los valores almacenados
y también nos muestre el valor máximo.
*/

public class Ejercicio5 {

	public static void main(String[] args) {
		muestraResultado();
	}

	static int dameNumero() {
		return (int) (Math.random() * 99);
	}

	static void muestraResultado() {

		int[] nums = { dameNumero(), dameNumero(), dameNumero(), dameNumero(), dameNumero(), dameNumero(), dameNumero(),
				dameNumero(), dameNumero() };

		System.out.println("Los números son :" + Arrays.toString(nums));

		var suma = 0;
		var max = 0;

		for (var i : nums) {
			suma += i;
			max = (max > i) ? max : i;
		}

		System.out.println("La media es " + suma / nums.length);
		System.out.println("El valor máximo es " + max);
	}

}
