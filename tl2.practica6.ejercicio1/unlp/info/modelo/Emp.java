package unlp.info.modelo;
// definimos Emp dado que java nos indica que Empleado ya esta definido
public class Emp extends Per {

	private long legajo;
	private Double sueldo;

	public Emp(String nombre, String apellido, int edad, long legajo, Double sueldo) {
		super(nombre, apellido, edad);
		this.legajo = legajo;
		this.sueldo = sueldo;
	}

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
