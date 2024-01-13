package griego;

class Alpha {
	protected int x;

	/*
	 * como vemos nuestro especificador de acceso es protected
	 * el cual se puede invocar desde una subclase y ademas 
	 * provee acceso package
	 * */
	protected void otroMetodoA() {
		System.out.println("Un método protegido");
	}
}