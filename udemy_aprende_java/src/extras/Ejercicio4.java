package extras;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		
		//Dice si esta la cadena vacia
		String cadena = "";
		System.out.println(cadena.isBlank());
		
		//Lo repite varias veces
		cadena = "Hola ";
		System.out.println(cadena.repeat(5));
		
		//Elimina espacios de la derecha y izquierda
		cadena = "    Hola Amigo    ";
		System.out.println(cadena.strip());
		System.out.println(cadena.trim());
	}

}
