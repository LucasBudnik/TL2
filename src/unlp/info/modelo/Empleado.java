package unlp.info.modelo;

public class Empleado extends Persona{
	private long legajo;
	private double sueldo;
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
	
}
