- Provee un mecanismo similar a la herencia multiple
- Es una coleccion de definiciones de metodos sin implementacion y de declaraciones de variables de clase constantes bajo un nombre (Es como una plantilla de metodos sin implementar (La clase jefe ) ).
- Proporciona mecanismos para que una clase defina comportamientos diferente al de sus superclases
- Establece que debe hacer la clase que la implementa sin indicar el como.
/---------------------------------------------------------------------/
## Como se define una interface
public interface UnaInter extends SuperInter1, SuperInter2,...{
	**Declaracion de metodos**: implicitamente public y abstract
	**Declaracion de constantes**: implicitamente public, static y final.
}
[[Que no hacer en Interfaces]]
/---------------------------------------------------------------------/
[[Implementación de Interfaces]]
[[Interfaces y Upcasting]]
/---------------------------------------------------------------------/
[[Que no hacer en Interfaces]]
/---------------------------------------------------------------------/
[[Interfaces vs. Clases Abstractas]]
/---------------------------------------------------------------------/
[[Ordenando objetos]]