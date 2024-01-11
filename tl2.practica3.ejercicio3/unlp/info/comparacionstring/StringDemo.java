package unlp.info.comparacionstring;

public class StringDemo {
	public static void main(String[] args) {
		String str1 = "Leones y Tigres y Osos!"; // Lit
		String str2 = "Leones y Tigres y Osos!"; // Lit
		String str3 = str2; // Lit
		String str4 = new String("Leones y Tigres y Osos!"); // OBJ
		String str5 = " Y yo!"; // LIT
		String str6 = "Leones y Tigres y Osos! Y yo!"; // lit
		String str7 = str1 + str5; // lit
		/*----------------------------------*/
		System.out.println(str1 == str2); // true Comparacion de dos literales
		System.out.println(str1 == str3); // true Comparacion de dos literales
		System.out.println(str1 == str4); // false Comparacion Literal y Object
		System.out.println(str2 == str3); // true Comparacion Dos literales igualados

		System.out.println(str2 == str4); // false Comparacion Literal y Object
		System.out.println(str3 == str4); // false Comparacion Literal y Object
		System.out.println(str6 == str7); // unico error. Es False
		// Esto se debe a el JVM Segun ChatGpt

		/*----------------------------------*/
		System.out.println(str1.equals(str4)); // true mediante equals podemos comparar
		// tanto String Object con String Object como String Object con Literal String
		// siempre y cuando no se trate de un objeto con implementacion propia del
		// equals
		// lo cual depende del criterio de programador el resultado
		System.out.println(str6.equals(str7)); // true misma justificacion del anterior.
	}
}
