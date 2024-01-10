package tl2.p3.ej1;

public class IMC {
	private double peso;
	private double altura;

	public IMC(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double calcular() {
		return (this.getPeso() / (this.getAltura() * this.getAltura()));
	}

}
