package arbol;

import accion.AccionEjecutable;


@SuppressWarnings("unchecked")
public class Arbol<T> {
	private Nodo<T> raiz;

	public Arbol() {
	}

	/**
	 * @return the raiz
	 */
	public Nodo<T> getRaiz() {
		return raiz;
	}

	/**
	 * @param raiz the raiz to set
	 */
	private void setRaiz(Nodo<T> raiz) {
		this.raiz = raiz;
	}

	private boolean validarObjeto(Nodo<T> raiz, Comparable<T> e) {
		if (this.getRaiz() != null) {
			return raiz.getDato().getClass().equals(e.getClass());
		}

		return true;
	}

	private boolean validarBrazo(Nodo<T> brazo) {
		if (brazo == null) {
			return false;
		}
		return true;
	}

	private Nodo<T> insertarRaiz(Comparable<T> dato) {
		if (this.getRaiz() != null) {
			return null;
		}
		Nodo<T> n = new Nodo<T>(null, dato);
		n.setIdentificador('R');
		this.setRaiz(n);
		return n;
	}

	public Nodo<T> insertar(Comparable<T> dato) {
		if (validarObjeto(this.getRaiz(), dato)) {
			return insertar(this.getRaiz(), dato);
		}
		return null;
	}

	private Nodo<T> insertar(Nodo<T> padre, Comparable<T> dato) {
		if (this.raiz == null) {
			return insertarRaiz(dato);
		}
		if (dato.compareTo((T) padre.getDato()) <= 0) {
			if (!validarBrazo(padre.getIzquierda())) {
				return insertarIzquierda(padre, dato);
			}
			return insertar(padre.getIzquierda(), dato);
		} else {
			if (!validarBrazo(padre.getDerecha())) {
				return insertarDerecha(padre, dato);
			}
			return insertar(padre.getDerecha(), dato);
		}
	}

	private Nodo<T> insertarDerecha(Nodo<T> padre, Comparable<T> dato) {
		Nodo<T> n = padre.insertarDerecha(dato);
		return n;
	}

	private Nodo<T> insertarIzquierda(Nodo<T> padre, Comparable<T> dato) {
		Nodo<T> n = padre.insertarIzquierda(dato);
		return n;
	}
	
	public void recorrerElementos(AccionEjecutable accion) {
		this.getRaiz().recorrerElemento(accion);
	}

	@Override
	public String toString() {
		return "Arbol  \nRaiz= " + raiz;
	}

}
