package extras;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		var serv=new Servicio();
		var datos = serv.devolverPersonas();
		for(var p:datos) {
			System.out.println(p.nombre()+"-"+p.email());
		}
		
	}	
}

class Servicio{
	public Persona2[] devolverPersonas() {
		var personas = new Persona2[3];
			personas[0]=new Persona2("p1",19,"p1@gmail.com");
			personas[1]=new Persona2("p2",19,"p2@gmail.com");
			personas[2]=new Persona2("p3",19,"p3@gmail.com");
			return personas;
		}
}


