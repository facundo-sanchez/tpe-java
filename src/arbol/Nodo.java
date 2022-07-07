package arbol;

import java.util.ArrayList;
import java.util.List;

import accion.AccionEjecutable;

public class Nodo implements Comparable<Nodo> {

	private Object padre;
	private Object dato;
	private char identificador;
	private Nodo derecha;
	private Nodo izquierda;

	public Nodo(Object padre, Object dato) {
		this.padre = padre;
		this.dato = dato;
		this.derecha = null;
		this.izquierda = null;
	}

	/**
	 * @return the dato
	 */
	public Object getDato() {
		return dato;
	}

	/**
	 * @param dato the dato to set
	 */
	public void setDato(Object dato) {
		this.dato = dato;
	}

	/**
	 * @return the derecha
	 */
	public Nodo getDerecha() {
		return derecha;
	}

	/**
	 * @param derecha the derecha to set
	 */
	public void setDerecha(Nodo derecha) {
		this.derecha = derecha;
	}

	/**
	 * @return the izquierda
	 */
	public Nodo getIzquierda() {
		return izquierda;
	}

	/**
	 * @param izquierda the izquierda to set
	 */
	public void setIzquierda(Nodo izquierda) {
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

//	@Override
	public Nodo insertarIzquierda(Comparable<Object> dato) {
		if (this.getIzquierda() != null) {
			return null;
		}
		if (dato.compareTo(this.getDato()) != 0) {
			Nodo n = new Nodo(this.getDato(), dato);
			n.setIdentificador('I');
			this.setIzquierda(n);
			return n;
		}
		return null;
	}

//	@Override
	public Nodo insertarDerecha(Comparable<Object> dato) {
		if (this.getDerecha() != null) {
			return null;
		}
		
		if(dato.compareTo(this.getDato()) != 0) {
			Nodo n = new Nodo(this.getDato(), dato);
			n.setIdentificador('D');
			this.setDerecha(n);
			return n;
		}

		return null;
	}

//	@Override
	public List<Object> buscarElemento(AccionEjecutable accion) {
		List<Object> result = new ArrayList<Object>();
		result.add(this.getDato() + " " + this.getIdentificador());
		if (this.getIzquierda() != null) {
//			result.add(accion.ejecutarNodo(this));
			result.addAll(this.getIzquierda().buscarElemento(accion));
		}
		if (this.getDerecha() != null) {
//			result.add(accion.ejecutarNodo(this));
			result.addAll(this.getDerecha().buscarElemento(accion));
		}
		return result;
	}

//	@Override
	public int compare(Object o1, Object o2) {
		return 1;
	}

	@Override
	public String toString() {
		return "\nPadre: " + padre + ", Identificador: " + identificador + ", Dato: " + dato + ", Derecha= " + derecha
				+ " \nIzquierda= " + izquierda + "\n";
	}

	@Override
	public int compareTo(Nodo o) {
		return 0;
	}

}
