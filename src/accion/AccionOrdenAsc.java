package accion;

import java.util.ArrayList;
import java.util.List;

import arbol.Arbol;
import arbol.Nodo;

public class AccionOrdenAsc implements AccionEjecutable {

	private List<Comparable> result = new ArrayList<Comparable>();

	@Override
	public void ejecutarNodo(Comparable nodo) {
		result.add(nodo);
	}
	
	/**
	 * @return the result
	 */
	public List<Comparable> getResult() {
		return new ArrayList<Comparable>(result);
	}

}
