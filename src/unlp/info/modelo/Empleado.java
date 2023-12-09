package unlp.info.modelo;

public class Empleado extends Persona {
	private long legajo;
	private double sueldo;

	public Empleado(String nombre, String apellido, int Edad, long legajo, double sueldo) {
		super(nombre, apellido, Edad);
		this.legajo = legajo;
		this.sueldo = sueldo;
	}

	public long getLegajo() {
		return legajo;
	}

	public void setLegajo(long legajo) {
		this.legajo = legajo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String toString() {
		return super.getNombre() + ", " + super.getApellido() + ", " + super.getEdad() + ", " + this.getLegajo() + ", "
				+ this.getSueldo();
	}

}
