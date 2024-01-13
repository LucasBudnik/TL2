package unlp.info.Main;

import java.util.Scanner;

import unlp.info.GenerateRandom.GeneradorWebSiteAleatorio;
import unlp.info.components.*;
import unlp.info.Enums.*;

public class Catalogador {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("SCANNER CREATED");

		System.out.print("INTO 'CATALOGOS':\t");
		int N = in.nextInt();

		Catalogo c = new Catalogo();
		System.out.println("'CATALOGO' CREATED");
		for (int i = 0; i < N; i++) {
			c.addWebSite(GeneradorWebSiteAleatorio.generarWebSiteAleatorio());
			System.out.println("ADDED NEW WEBSITE");
		}

		System.out.println(c.toString());
		System.out.println("ADDED ALL WEBSITES");

		System.out.println("INTO MIN ETIQUETAS");
		Catalogo c1 = c.filtrarCantidadDeEtiquetas(in.nextInt());
		System.out.println("************************************************");
		System.out.println(c1.toString());

		System.out.println("INTO MIN VISITS");
		Catalogo c2 = c.filtrarPorCantidadDeVisitas(in.nextInt());

		System.out.println("************************************************");
		System.out.println(c2.toString());

		System.out.println("INTO ETIQUETA:");
		Catalogo c3 = filtroPorEtiqueta(0, c, in);

		System.out.println("************************************************");
		System.out.println(c3.toString());

		System.out.println("MOSTRAMOS LA LISTA INICIAL ORDENADA POR CANTIDAD DE ETIQUETAS");
		System.out.println("************************************************");
		System.out.println(c.ordenarPorCantidadDeEtiquetas().toString());
		System.out.println("MOSTRAMOS LA LISTA INICIAL ORDENADA POR CANTIDAD DE VISITAS");
		System.out.println("************************************************");
		System.out.println(c.ordenarPorVisitas().toString());

		in.close();
	}

	public static Catalogo filtroPorEtiqueta(int opcion, Catalogo c, Scanner in) {
		do {
			System.out.println("SELECCIONE OPCION:\n1.CULTURAL\n2.DEPORTIVO\n3.SOCIAL\n4.TECNOLOGIA");
			opcion = in.nextInt();
			if (opcion > 4 || opcion < 1)
				System.out.println("Opcion Invalida, Por favor vuelva a intentarlo");
		} while ((opcion > 4) || (opcion < 1));

		switch (opcion) {
		case 1:
			return c.filtrarEtiqueta(Etiqueta.CULTURAL);
		case 2:
			return c.filtrarEtiqueta(Etiqueta.DEPORTIVO);
		case 3:
			return c.filtrarEtiqueta(Etiqueta.SOCIAL);
		case 4:
			return c.filtrarEtiqueta(Etiqueta.TECNOLOGIA);
		default:
			System.out.println("nunca va a llegar aca.");
			break;
		}
		return null;
	}
	
	

}
