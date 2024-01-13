package unlp.info.components;

import java.util.*;

import unlp.info.Enums.Etiqueta;

public class WebSite {
	private String direccion = "";
	private Integer visitas = 0;
	private Date creacion = null;
	private List<Etiqueta> etiquetas = new ArrayList<Etiqueta>();

	public WebSite(String direccion, Integer visitas, Date creacion, List<Etiqueta> etiquetas) {
		this.direccion = direccion;
		this.visitas = visitas;
		this.creacion = creacion;
		this.etiquetas = etiquetas;

	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getVisitas() {
		return visitas;
	}

	public void setVisitas(Integer visitas) {
		this.visitas = visitas;
	}

	public Date getCreacion() {
		return creacion;
	}

	public void setCreacion(Date creacion) {
		this.creacion = creacion;
	}

	public List<Etiqueta> getEtiquetas() {
		return this.etiquetas;
	}

	public void agregarEtiqueta(Etiqueta etiqueta) {
		this.etiquetas.add(etiqueta);
	}

	public StringBuilder convert() {
		StringBuilder s = new StringBuilder();
		for (Etiqueta e : this.etiquetas) {
			s.append(e.name() + "\n");
		}
		return s;
	}

	@Override
	public String toString() {
		return "WebSites: \ndireccion=" + direccion + "\nvisitas=" + visitas + "\ncreacion=" + creacion.toString()
				+ "\netiquetas=\n" + this.convert() + ".";
	}

}
