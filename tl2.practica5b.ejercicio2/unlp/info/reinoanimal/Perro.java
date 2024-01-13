package unlp.info.reinoanimal;

public class Perro extends Animal {
	@Override
	// package: como vemos la herencia solo nos permite que sea o protected o public
	protected void saludo() {
		System.out.println("Guau!");
	}
}
