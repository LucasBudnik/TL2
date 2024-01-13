package unlp.info.math;

import java.util.Objects;

public final class Complex {
	private double re;
	private double im;

	public Complex(double re, double im) {
		this.im = im;
		this.re = re;
	}

	public double realPart() {
		return this.re;
	}

	public double imaginaryPart() {
		return this.im;
	}

	public Complex add(Complex c) {
		this.re += c.realPart();
		this.im += c.imaginaryPart();
		return this;
		// return new Complex(this.realPart() + c.realPart(), this.imaginaryPart() +
		// c.imaginaryPart());
	}

	public Complex subtract(Complex c) {
		this.re -= c.realPart();
		this.im -= c.imaginaryPart();
		return this;
		// return new Complex(this.realPart() - c.realPart(), this.imaginaryPart() -
		// c.imaginaryPart());
	}

	public Complex multiply(Complex c) {
		double parteImaginaria = this.imaginaryPart();
		// debemos guardarla antes de que se modifique y nos afecte el resultado de la
		// siguiente operacion
		this.im = (this.realPart() * c.imaginaryPart() + this.imaginaryPart() * c.realPart());
		this.re = (this.realPart() * c.realPart() - parteImaginaria * c.imaginaryPart());
		return this;
	}

	public Complex divide(Complex c) {
		Complex conjugado = new Complex(c.realPart(), -c.imaginaryPart());
		this.multiply(conjugado);
		c.multiply(conjugado);
		this.re /= c.realPart();
		this.im /= c.realPart();
		return this;
	}

	@Override
	public int hashCode() {
		return Objects.hash(im, re);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complex other = (Complex) obj;
		return Double.doubleToLongBits(im) == Double.doubleToLongBits(other.im)
				&& Double.doubleToLongBits(re) == Double.doubleToLongBits(other.re);
	}

	public String toString() {
		return this.realPart() + " + " + this.imaginaryPart() + "i";
	}

	public Complex valueOf(double re, double im) {
		return new Complex(re, im);
	}
}
