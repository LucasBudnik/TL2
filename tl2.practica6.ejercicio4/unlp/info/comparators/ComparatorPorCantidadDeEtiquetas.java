package unlp.info.comparators;

import java.util.Comparator;

import unlp.info.components.WebSite;

public class ComparatorPorCantidadDeEtiquetas implements Comparator<WebSite> {
	public int compare(WebSite w1, WebSite w2) {
		return w1.getEtiquetas().size() - w2.getEtiquetas().size();
	}
}
