package tl2.p3.ej1;

public class TestIMC {

	public static void main(String[] args) {

		System.out.println("cantidad de argumentos: " + args.length);
		if (args.length >= 2) {
			System.out.println("peso: " + args[0]);
			System.out.println("altura: " + args[1]);
			IMC imc = new IMC(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
			double rt = imc.calcular();
			System.out.println("el indice de mas corporal es: " + rt);
			indicarComoSeEncuentra(rt);

		} else
			System.out.println("la cantidad de argumentos no es suficiente");
	}

	public static void indicarComoSeEncuentra(Double rt) {
		if (rt < 18)
			System.out.println("Ud. se encuentra por debajo de lo establecido! ");
		else if (rt > 25)
			System.out.println("Ud. se encuentra por encima de lo establecido!");
		else
			System.out.println("Ud. parece saludable!");
	}

}
