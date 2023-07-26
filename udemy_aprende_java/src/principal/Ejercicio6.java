package principal;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

/*
Realizar un programa que lea 10 números positivos por teclado y después nos muestre
dichos números ordenados de mayor a menor. Si se introduce un número negativo,
se volvera a solicitar al usuario.
*/

public class Ejercicio6 {

	public static void main(String[] args) {
//		ordenarConArrays(solicitarNumeros());
		ordenarConBurbuja(solicitarNumeros());
	}

	static int[] solicitarNumeros() {

		try (Scanner sc = new Scanner(System.in)) {
			int[] nums = new int[10];
			int num;
			for (int i = 0; i < 10; i++) {
				System.out.println("Introduce un número");
				num = Integer.parseInt(sc.nextLine());
				while (num < 0) {
					System.out.println("¡Has introducido un número negativo!");
					System.out.println("Vuelve a intentarlo");
					num = Integer.parseInt(sc.nextLine());
				}
				nums[i] = num;
			}
			return nums;
		} catch (NumberFormatException e) {
			System.out.println("Datos mal introducidos");
			return null;
		}
	}

	static void ordenarConArrays(int[] array) {
		Integer[] nums = IntStream.of(array).boxed().toArray(Integer[]::new);

		Arrays.sort(nums, Collections.reverseOrder());
		System.out.println(Arrays.toString(nums));
	}

	static void ordenarConBurbuja(int[] nums) {

		int aux;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				if (nums[j] > nums[i]) {
					aux = nums[i];
					nums[i] = nums[j];
					nums[j] = aux;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
	}
}
