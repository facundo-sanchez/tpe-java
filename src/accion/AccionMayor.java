package accion;

import arbol.Arbol;
import arbol.Nodo;

@SuppressWarnings("unchecked")
public class AccionMayor implements AccionEjecutable {

	private Comparable nodoMayor;
	
	/**
	 * @return the nodoMayor
	 */
	public Comparable getNodoMayor() {
		return nodoMayor;
	}

	/**
	 * @param nodoMayor the nodoMayor to set
	 */
	private void setNodoMayor(Comparable nodoMayor) {
		this.nodoMayor = nodoMayor;
	}

	@Override
	public void ejecutarNodo(Comparable dato) {
		if (nodoMayor == null) {
			setNodoMayor(dato);
		}
		buscarNodoMayor(dato);
	}

	private void buscarNodoMayor(Comparable dato) {
		if (dato != null) {
			if (dato.compareTo(this.nodoMayor) > 0) {
				this.setNodoMayor(dato);
			}
		}
	}

}
