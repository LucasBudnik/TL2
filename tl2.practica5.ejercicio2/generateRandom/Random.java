package generateRandom;

// no se pueden crear subclases de Random por ser final
public final class Random {
	// no se puede modificar el valor dado que la variable es final
	private static final int MAXIMOVALOR = 10;

	// no puedo crear instancias dado que el constructor es privado
	private Random() {
	}

	// no se puede realizar sobreCarga de metodos por ser getRandom final
	public static final int getRandom() {
		return (int) (Math.random() * (MAXIMOVALOR + 1));
	}
}
