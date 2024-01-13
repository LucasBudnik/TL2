package unlp.info.components;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import unlp.info.Enums.Etiqueta;
import unlp.info.comparators.ComparatorCantidadDeVisitas;
import unlp.info.comparators.ComparatorPorCantidadDeEtiquetas;

public class Catalogo implements Iterable<WebSite> {
	List<WebSite> catalogo;

	public Catalogo() {
		catalogo = new ArrayList<WebSite>();
	}

	public void addWebSite(WebSite website) {
		catalogo.add(website);
	}

	@Override
	public Iterator<WebSite> iterator() {
		return catalogo.iterator();
	}

	public Catalogo filtrarPorCantidadDeVisitas(int cantidadDeVisitas) {
		Catalogo retorno = new Catalogo();
		for (WebSite w : this) {
			if (w.getVisitas() >= cantidadDeVisitas) {
				retorno.addWebSite(w);
			}
		}
		return retorno;
	}

	public Catalogo filtrarEtiqueta(Etiqueta etiqueta) {
		Catalogo retorno = new Catalogo();
		for (WebSite w : this) {
			for (Etiqueta e : w.getEtiquetas()) {
				if (e == etiqueta) {
					retorno.addWebSite(w);
					break;
				}
			}
		}
		return retorno;
	}

	public Catalogo filtrarCantidadDeEtiquetas(int cant) {
		Catalogo retorno = new Catalogo();
		for (WebSite w : this) {
			if (w.getEtiquetas().size() >= cant)
				retorno.addWebSite(w);
		}
		return retorno;
	}

	public Catalogo ordenarPorVisitas() {
		Collections.sort(this.catalogo, new ComparatorCantidadDeVisitas());
		return this;
	}

	public Catalogo ordenarPorCantidadDeEtiquetas() {
		Collections.sort(this.catalogo, new ComparatorPorCantidadDeEtiquetas());
		return this;
	}
	
	public StringBuilder convert() {
		StringBuilder b = new StringBuilder();
		for(WebSite w : this.catalogo) {
			b.append(w.toString()+ "\n------------------------\n");
		}
		return b;
	}
	
	@Override
	public String toString() {
		return "Catalogo:\n" + this.convert() + ".";
	}
	
	

}