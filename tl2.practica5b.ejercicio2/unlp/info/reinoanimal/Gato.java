package unlp.info.reinoanimal;

public class Gato extends Animal {
	@Override
	//private no puede ser la herencia solo nos permite o protected o public
	public void saludo() {
		System.out.println("Miau!");
	}
}
