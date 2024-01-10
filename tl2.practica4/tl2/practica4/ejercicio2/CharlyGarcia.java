package tl2.practica4.ejercicio2;

public class CharlyGarcia {

	private static CharlyGarcia INSTANCE = null;

	private CharlyGarcia() {

	}

	public static CharlyGarcia getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new CharlyGarcia();
		}
		return INSTANCE;
	}

	public void cantar() {
		System.out.println("Charly Garcia está cantando");
	}
}
