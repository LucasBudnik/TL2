package unlp.info.modelo;

public class Persona implements Comparable<Persona> {
	private String nombre, apellido;
	private int edad;

	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int compareTo(Persona o) {
		if (this.getApellido().equals(o.getApellido())) {
			return this.getNombre().compareTo(o.getNombre());
		}
		return this.getApellido().compareTo(o.getApellido());
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}

}
