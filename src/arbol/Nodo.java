package arbol;

import java.util.ArrayList;
import java.util.List;
import accion.AccionEjecutable;

@SuppressWarnings("unchecked")
public class Nodo<T>{

	private Comparable<T> padre;
	private Comparable<T> dato;
	private char identificador;
	private Nodo<T> derecha;
	private Nodo<T> izquierda;

	public Nodo() {
		this.padre = null;
		this.dato = null;
		this.derecha = null;
		this.izquierda = null;
	}

	public Nodo(Comparable<T> padre, Comparable<T> dato) {
		this.padre = padre;
		this.dato = dato;
		this.derecha = null;
		this.izquierda = null;
	}

	/**
	 * @param padre the padre to set
	 */
	public void setPadre(Comparable<T> padre) {
		this.padre = padre;
	}

	/**
	 * @return the padre
	 */
	public Object getPadre() {
		return padre;
	}

	/**
	 * @return the dato
	 */
	public Comparable<T> getDato() {
		return dato;
	}

	/**
	 * @param dato the dato to set
	 */
	public void setDato(Comparable<T> dato) {
		this.dato = dato;
	}

	/**
	 * @return the derecha
	 */
	public Nodo<T> getDerecha() {
		return derecha;
	}

	/**
	 * @param derecha the derecha to set
	 */
	public void setDerecha(Nodo<T> derecha) {
		this.derecha = derecha;
	}

	/**
	 * @return the izquierda
	 */
	public Nodo<T> getIzquierda() {
		return izquierda;
	}

	/**
	 * @param izquierda the izquierda to set
	 */
	public void setIzquierda(Nodo<T> izquierda) {
		this.izquierda = izquierda;
	}

	/**
	 * @return the identificador
	 */
	public char getIdentificador() {
		return identificador;
	}

	/**
	 * @param identificador the identificador to set
	 */
	public void setIdentificador(char identificador) {
		this.identificador = identificador;
	}

	public Nodo<T> insertarIzquierda(Comparable<T> dato) {
		if (this.getIzquierda() != null) {
			return null;
		}
		if (dato.compareTo((T) this.getDato()) != 0) {
			Nodo<T> n = new Nodo<T>(this.getDato(), dato);
			n.setIdentificador('I');
			this.setIzquierda(n);
			return n;
		}
		return null;
	}

	public Nodo<T> insertarDerecha(Comparable<T> dato) {
		if (this.getDerecha() != null) {
			return null;
		}

		if (dato.compareTo((T) this.getDato()) != 0) {
			Nodo<T> n = new Nodo<T>(this.getDato(), dato);
			n.setIdentificador('D');
			this.setDerecha(n);
			return n;
		}

		return null;
	}

	public void recorrerElemento(AccionEjecutable accion) {

		if (this.getIzquierda() != null) {
			this.getIzquierda().recorrerElemento(accion);
		}
		
		accion.ejecutarNodo(this.getDato());

		if (this.getDerecha() != null) {
			this.getDerecha().recorrerElemento(accion);
		}
	}

	@Override
	public String toString() {
		return "\nPadre: " + padre + ", Identificador: " + identificador + ", Dato: " + dato + ", Derecha= " + derecha
				+ " \nIzquierda= " + izquierda + "\n";
	}

}
