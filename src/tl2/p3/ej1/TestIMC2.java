package tl2.p3.ej1;

import java.util.Scanner;

public class TestIMC2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese (Peso [kg], Altura [m]) usar '.' y no ',': ");
		IMC imc = new IMC(in.nextDouble(), in.nextDouble());
		double rt = imc.calcular();
		System.out.println("el indice de mas corporal es: " + rt);
		indicarComoSeEncuentra(rt);
		in.close();
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
