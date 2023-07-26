package extras;

import java.util.Scanner;

/*
 Realizar un programa para calcular la facturación de un producto.
 Al iniciarse el programa, nos pedirá el precio del producto y 
 seguidamente las unidades. Después, se solicitará la zona de entrega,
 que determinará el descuento a aplicar según el siguiente criterio:
 
 - zonas A y B, 10% de descuento
 - zonas C,D y E, 5% de descuento
 - zona F, 3% de descuento
 - cualquier otra zona, 0 % de descuento
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		
		System.out.println("El precio que se debe pagar es "+arrancar());
	}

	static double arrancar() {

		try (var sc = new Scanner(System.in)) {
			System.out.println("Indica el precio del producto");
			var precio = Double.parseDouble(sc.nextLine());
			System.out.println("Indica las unidades que quieres encargar");
			var unidades = Integer.parseInt(sc.nextLine());
			System.out.println("Indica la zona de entrega");
			var zona = sc.next().charAt(0);

			precio = precio * unidades;

			double pago = switch (zona) {
			case 'A', 'B' -> {
				precio = precio - (precio * 10 / 100);
				yield precio;
			}
			case 'C', 'D', 'E' -> {
				precio = ((precio * unidades) * 5) / 100;
				yield precio;
			}
			case 'F' -> {
				precio = ((precio * unidades) * 3) / 100;
				yield precio;
			}
			default -> {
				yield precio;
			}
			};
			return pago;

		} catch (NumberFormatException e) {
			e.printStackTrace();
			return 0;
		}
	}
}
