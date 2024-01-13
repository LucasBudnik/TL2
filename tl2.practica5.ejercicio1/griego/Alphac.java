package griego;
/*
 * De buenas a primeras los especificadores de acceso son protected
 * tanto para las variables de instancia como para los metodos, por lo tanto
 * brindan acceso package y acceso a las subclases de esta(independientemente del paquete perteneciente)
 * */
public class Alphac {
	protected int x;

	protected void otroMetodoA() {
		System.out.println("Un método protegido");
	}
}