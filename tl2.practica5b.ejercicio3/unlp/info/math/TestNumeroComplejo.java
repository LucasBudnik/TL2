package unlp.info.math;

import java.util.Scanner;

public class TestNumeroComplejo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Complex c, c2;
		String op;
		do {
			System.out.println("Ingrese numero complejo: (Re[], Enter, Im[])");
			c = new Complex(in.nextDouble(), in.nextDouble());
			System.out.println("---------------------------------");
			System.out.println("Ingrese numero complejo: (Re[], Enter, Im[])");
			c2 = new Complex(in.nextDouble(), in.nextDouble());
			System.out.println();
			System.out.println("c: " + c.hashCode());
			System.out.println("c2: " + c2.hashCode());
			System.out.println();
			System.out.println("(" + c.toString() + ")+(" + c2.toString() + ")=" + c.add(c2).toString());
			System.out.println("(" + c.toString() + ")-(" + c2.toString() + ")=" + c.subtract(c2).toString());
			System.out.println("(" + c.toString() + ")*(" + c2.toString() + ")=" + c.multiply(c2).toString());
			System.out.println("(" + c.toString() + ")/(" + c2.toString() + ")=" + c.divide(c2).toString());
			System.out.println();
			System.out.println("desea seguir ...\n(S)i/(N)o");
			op = in.next();
		} while (op.equals("S"));
		in.close();
	}

}
