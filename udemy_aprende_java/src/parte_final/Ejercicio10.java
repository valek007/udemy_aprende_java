package parte_final;

import parte_final.presentacion.AgendaContactos;

/*
 Realizar un programa que muestre un menú con las siguientes opciones:

1.-Añadir contacto
2.-Buscar contacto
3.-Mostrar todos
4.-Salir

-Opción 1: Si hay espacio libre(se podrán guardar un máximo de 10 contactos),
se solicitará al usuario la introducción de los datos del contacto(nombre, edad, email)
y el contacto quedará guardado.

-Opción 2. Se solicitará el nombre del contacto y si se encuentra,
se mostrarán sus datos. Si hay más de un contacto con ese nombre se mostrará
el primero que se encuentre.

-Opción 3. Se mostrarán los datos de todos los contactos almacenados.
 */

public class Ejercicio10 {

	public static void main(String[] args) {
		AgendaContactos agenda = new AgendaContactos();
		agenda.arrancar();
		
	}
}
