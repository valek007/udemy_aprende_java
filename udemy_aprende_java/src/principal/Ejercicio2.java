package principal;

public class Ejercicio2 {

	public static void main(String[] args) {
		// tipos de bucle for

		// for tipo 1
		var i = 0;
		for (; i < 10;) {
			System.out.println("Hola mundo 1");
			i++;
		}
		
		// for tipo 2
		for (var x = 0; x < 10; x++) {
			System.out.println("Hola mundo 2");
		}

		// bucle infinito
		for (;;) {
			System.out.println("Hola mundo 3");
		}

	}

}
