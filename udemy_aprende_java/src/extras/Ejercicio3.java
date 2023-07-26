package extras;

public class Ejercicio3 {


	@SuppressWarnings({ "unused", "preview" })
	public static void main(String[] args) {
		
		Object ob = "my cad";
		
		//Antes del java 17
		if(ob instanceof String) {
			String cad = (String) ob;
			if(cad==null) {
				System.out.println("es null");
			}else if(cad.length()>4){
				System.out.println("cadena larga "+cad.length());
			}else {
				System.out.println("cadena corta "+cad.length());
			}
		}else {
			System.out.println("no es una cadena");
		}
		
		//En java 17
		Object ob2 = "my cad2";
		switch (ob2) {
		case null->System.out.println("Es null");
//		case String s &&(s.length()>4)->System.out.println("cadena larga "+s.length());
//		case String s if(s.length()>4)->System.out.println("cadena larga "+s.length());
		case String s->System.out.println("cadena corta "+s.length());
		default->System.out.println("no es una cadena");
		}
		
	}

}
