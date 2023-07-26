package parte_final.logica;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

import parte_final.modelo.Contacto;

public class GestorContactos {

	public final int CAPACIDAD_AGENDA = 10;
	public String nombre_busqueda;
	private Contacto[] agenda = new Contacto[CAPACIDAD_AGENDA];
	private static int contador_contactos = 0;

	public boolean agregarContacto(Scanner sc) {

		System.out.println("Introduce el nombre");
		String nombre = sc.nextLine();
		System.out.println("Introduce el correo email");
		String email = sc.nextLine();
		System.out.println("Introduce la edad");
		int edad = Integer.parseInt(sc.nextLine());
		if (contador_contactos < CAPACIDAD_AGENDA) {
			agenda[contador_contactos] = new Contacto(nombre, email, edad);
			contador_contactos++;
			return true;
		} else {
			return false;
		}

	}

	public boolean buscarContacto(Scanner sc) {

		System.out.println("Introduce el nombre del contacto que quieres encontrar");
		var nombre = sc.nextLine();
		nombre_busqueda = nombre;
		try {
			Optional<Contacto> resultado = Arrays.stream(agenda).filter(contacto -> contacto.getNombre().equals(nombre))
					.findFirst();
			if (resultado.isPresent()) {
				return true;
			} else {
				return false;
			}
		} catch (NullPointerException e) {
			return false;
		}

	}

	public void mostrarContactos() {

		Contacto[] copia = Arrays.copyOf(agenda, contador_contactos);
		System.out.println("Contactos:");
		for (Contacto contacto : copia) {
			if (contacto != null)
				System.out.println(contador_contactos + ".---" + contacto);
		}
		System.out.println();
	}
}
