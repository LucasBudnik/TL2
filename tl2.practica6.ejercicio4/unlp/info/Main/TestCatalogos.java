package unlp.info.Main;

import unlp.info.components.*;
import unlp.info.GenerateRandom.*;

public class TestCatalogos {
	public static void main(String[] args) {
		System.out.println("CREAMOS UN CATALOGO");
		Catalogo catalogo = new Catalogo();
		// Creamos 100 catalogos
		System.out.println("AÑADIMOS 100 CATALOGOS ALEATORIOS");
		for (int i = 0; i < 100; i++) {
			catalogo.addWebSite(GeneradorWebSiteAleatorio.generarWebSiteAleatorio());
		}
		System.out.println("MOSTRAMOS NUESTRO CATALOGO");
		System.out.println(catalogo.toString());

//		System.out.println("TRANSFORMAMOS EL CATALOGO EN UN ITERADOR PARA RECORRERLO");
//
//		catalogo.iterator();
//		for (WebSite w : catalogo) {
//			w.toString();
//		}
	}
}
