package principal;

/*
Realizar un programa que, dada una nota almacenada en una variable, nos diga
si es un suspenso (1-4), aprobado (5-6), notable (7-8), sobresaliente (9-10).
Para cualquier otro valor que nos diga que la nota no es válida.
*/
public class Ejercicio1 {

	public static void main(String[] args) {

		var nota = (int) (Math.random() * 10);

		System.out.println("Has sacado la nota " + nota + " y es un " + resultadoExamen(nota));
	}

	static String resultadoExamen(int nota) {

		String resultado = switch (nota) {
		case 1, 2, 3, 4 -> "suspenso";
		case 5, 6 -> "aprobado";
		case 7, 8 -> "notable";
		case 9, 10 -> "sobresaliente";
		default -> "nota no valida";
		};

		return resultado;
	}

}
