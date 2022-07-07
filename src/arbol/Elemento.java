package arbol;

import java.util.List;

import accion.AccionEjecutable;


public abstract class Elemento{
	/*ACTUALMENTE NO ESTA EN USO*/
	abstract Object getDato();
	abstract Nodo getDerecha();
	abstract void setDerecha(Nodo derecha);
	abstract Nodo getIzquierda();
	abstract void setIzquierda(Nodo derecha);
	public abstract int compare(Object o1, Object o2);
//	int compareMayor(Object o1, Object o2);
//	int compareMenor(Object o1, Object o2);
	abstract Elemento insertarIzquierda(Elemento dato);
	abstract Elemento insertarDerecha(Elemento dato);
	abstract List<Object> buscarElemento(AccionEjecutable accion);
}
