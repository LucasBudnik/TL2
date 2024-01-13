package unlp.info;

import java.util.Iterator;

public class Catalogo implements Iterable<WebSite> {
	List<WebSite> catalogo;

	public Catalogo() {
		catalogo = new ArrayList<WebSite>();
	}

	public void agregarWebSite(WebSite website) {
		catalogo.add(website);
	}

	@Override
	public Iterator<WebSite> iterator() {
		return catalogo.iterator();
	}
}
