package parte_final.modelo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Contacto {
	private String nombre, email;
	private int age;

	@Override
	public String toString() {
		return "'nombre:'" + nombre + '\'' + ", email:'" + email + '\'' + ", edad:" + age;
	}

}
