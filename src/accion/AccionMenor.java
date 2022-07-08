package accion;

import arbol.Arbol;
import arbol.Nodo;

@SuppressWarnings("unchecked")
public class AccionMenor implements AccionEjecutable {
	private Comparable nodoMenor;
	
	/**
	 * @return the nodoMenor
	 */
	public Comparable getNodoMenor() {
		return nodoMenor;
	}

	/**
	 * @param nodoMenor the nodoMenor to set
	 */
	private void setNodoMenor(Comparable nodoMenor) {
		this.nodoMenor = nodoMenor;
	}

	@Override
	public void ejecutarNodo(Comparable dato) {
		if(this.getNodoMenor() == null) {
			this.setNodoMenor(dato);
		}
		buscarNodoMenor(dato);

	}

	private void buscarNodoMenor(Comparable dato) {
		if(dato != null) {
			if (dato.compareTo(this.nodoMenor) < 0) {
				this.setNodoMenor(dato);
			}
		}
	}

}
