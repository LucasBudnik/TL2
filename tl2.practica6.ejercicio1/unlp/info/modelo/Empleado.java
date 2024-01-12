package unlp.info.modelo;

public class Empleado extends Persona {

	public Empleado(String nombre, String apellido, int edad, long legajo, Double sueldo) {
		super(nombre, apellido, edad);
		this.legajo = legajo;
		this.sueldo = sueldo;
	}

	private long legajo;
	private Double sueldo;

	public long getLegajo() {
		return legajo;
	}

	public void setLegajo(long legajo) {
		this.legajo = legajo;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return super.toString()+" Empleado [legajo=" + legajo + ", sueldo=" + sueldo + "]";
	}

}
