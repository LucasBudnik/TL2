package unlp.info.math;

public class Complex {
	private double re;
	private double im;

	public Complex(double re, double im) {
		this.im = im;
		this.re = re;
	}

	public double realPart() {
		return this.re;
	}

	public double impaginaryPart() {
		return this.im;
	}

	public Complex add(Complex c) {
		return new Complex(this.realPart() + c.realPart(), this.imaginaryPart() + c.imaginaryPart());
	}
}
