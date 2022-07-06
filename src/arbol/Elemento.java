package arbol;

import java.util.List;

import accion.AccionEjecutable;


public interface Elemento{
	
	Elemento getDato();
	Elemento getDerecha();
	void setDerecha(Elemento derecha);
	Elemento getIzquierda();
	void setIzquierda(Elemento derecha);
	int compare(Object o1, Object o2);
//	int compareMayor(Object o1, Object o2);
//	int compareMenor(Object o1, Object o2);
	Elemento insertarIzquierda(Elemento dato);
	Elemento insertarDerecha(Elemento dato);
	List<Object> buscarElemento(AccionEjecutable accion);
}
