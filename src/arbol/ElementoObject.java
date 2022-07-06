package arbol;

import java.util.List;

import accion.AccionEjecutable;

public class ElementoObject implements Elemento {

	public int compareMayor(Object o1, Object o2) {
		return 0;
	};

	public int compareMenor(Object o1, Object o2) {
		return 0;
	};

	public int compare(Object o1, Object o2) {
		return 0;
	}

	@Override
	public Elemento getDato() {
		return null;
	}

	@Override
	public Elemento insertarIzquierda(Elemento dato) {
		return null;
	}

	@Override
	public Elemento insertarDerecha(Elemento dato) {
		return null;
	}

	@Override
	public List<Object> buscarElemento(AccionEjecutable accion) {
		return null;
	}

	@Override
	public Elemento getDerecha() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDerecha(Elemento derecha) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Elemento getIzquierda() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setIzquierda(Elemento derecha) {
		// TODO Auto-generated method stub
		
	};

}
