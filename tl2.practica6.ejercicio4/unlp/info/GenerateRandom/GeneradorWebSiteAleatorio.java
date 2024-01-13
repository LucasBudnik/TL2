package unlp.info.GenerateRandom;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import unlp.info.components.*;
import unlp.info.Enums.Etiqueta;

public class GeneradorWebSiteAleatorio {
	private static Random random = new Random();
	private static final int MAXIMO = 1000;

	public static String getDireccionAleatoria() {
		return "http://www.ejemplo" + random.nextInt(1000) + ".com";
	}

	public static Integer getVisitasAleatorias() {
		return random.nextInt(MAXIMO);
	}

	public static Date getCreacionAleatoria() {
		return new Date(System.currentTimeMillis() - random.nextInt(365) * 24L * 3600 * 1000);
	}

	public static List<Etiqueta> getEtiquetasAleatorias() {
		List<Etiqueta> etiquetasAleatorias = new ArrayList<>();
		for (int i = 0; i < random.nextInt(5) + 1; i++) {
			etiquetasAleatorias.add(Etiqueta.values()[random.nextInt(Etiqueta.values().length)]);
		}
		return etiquetasAleatorias;
	}

	public static WebSite generarWebSiteAleatorio() {
		return new WebSite(getDireccionAleatoria(), getVisitasAleatorias(), getCreacionAleatoria(),
				getEtiquetasAleatorias());

	}

}
