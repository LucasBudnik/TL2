package unlp.info;

import java.util.Date;

public class WebSite {
	private String direccion;
	private Integer visitas;
	private Date creacion;
	private Etiqueta etiquetas;
	
	public WebSite(String direccion, Integer visitas, Date creacion, Etiqueta etiquetas) {
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
	public Etiqueta getEtiquetas() {
		return etiquetas;
	}
	public void setEtiquetas(Etiqueta etiquetas) {
		this.etiquetas = etiquetas;
	}
	
	


}
