package accion;

import arbol.Nodo;

public class AccionContador implements AccionEjecutable {
	private int contador = 0;
	
	/**
	 * @return the contador
	 */
	public int getContador() {
		return contador;
	}

	@Override
	public void ejecutarNodo(Comparable nodo) {
		contador++;
	}

}
