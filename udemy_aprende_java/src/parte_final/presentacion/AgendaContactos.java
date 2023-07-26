package parte_final.presentacion;

import java.util.Scanner;

import parte_final.logica.GestorContactos;

public class AgendaContactos {

	private static GestorContactos gc = new GestorContactos();

	void mostrarMenu() {
		System.out.println("1.-Añadir contacto");
		System.out.println("2.-Buscar contacto");
		System.out.println("3.-Mostrar todos");
		System.out.println("4.-Salir");
	}

	public void arrancar() {
		try (var sc = new Scanner(System.in)) {
			var opc = 0;
			do {
				mostrarMenu();
				opc = Integer.parseInt(sc.nextLine());
				switch (opc) {
				case 1 -> {
					if (gc.agregarContacto(sc))
						System.out.println("El contacto se ha introducido correctamente\n");
					else
						System.out.println("Se ha alcanzado el limite de " + gc.CAPACIDAD_AGENDA + " contactos.\n");
				}
				case 2 -> {
					if(gc.buscarContacto(sc)) {
						System.out.println(gc.nombre_busqueda+" se encuentra en la agenda\n");
					} else {
						System.out.println(gc.nombre_busqueda+" no se encuentra en la agenda\n");
					}
				}

				case 3 -> gc.mostrarContactos();
				case 4 -> System.out.println("Has salido");
				default -> System.out.println("Datos no validos");
				}

			} while (opc != 4);
		} catch (

		NumberFormatException e) {
			System.out.println("Datos no validos");
		}
	}
}
