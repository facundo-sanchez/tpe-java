package arbol;

import java.util.ArrayList;
import java.util.List;

//import arbol2.ArbolBusqueda;

public class Arbol {
	private Nodo raiz;
	private int cantidad;

	public Arbol() {
		this.cantidad = 0;
	}

	/**
	 * @return the raiz
	 */
	public Elemento getRaiz() {
		return raiz;
	}

	/**
	 * @param raiz the raiz to set
	 */
	private void setRaiz(Nodo raiz) {
		this.raiz = raiz;
	}

	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	private boolean validarObjeto(Object e) {
//		if(this.getCantidad() > 0) {
//			return this.getRaiz().getClass().equals(e.getClass());
//		}	
		return true;
	}
	
	private boolean validarBrazo(Elemento brazo) {
		if(brazo == null) {
			return false;
		}
		return true;
	}

	private Elemento insertarRaiz(Elemento dato) {
		if (this.getCantidad() != 0) {
			return null;
		}
		Nodo n = new Nodo(null, dato);
		n.setIdentificador('R');
		this.setRaiz(n);
		this.setCantidad(1);
		return n;
	}

	public Elemento insertar(Elemento dato) {
		if(validarObjeto(dato)) {
			return insertar(this.getRaiz(), dato);
		}
		return null;
	}

	private Elemento insertar(Elemento padre, Elemento dato) {
		if (this.raiz == null) {
			return insertarRaiz(dato);
		}
		if (dato.compare(padre.getDato(), dato) <= 0) {
			if (!validarBrazo(padre.getIzquierda())) {
				return insertarIzquierda(padre, dato);
			}
			return insertar(padre.getIzquierda(),dato);
		} else {
			if (!validarBrazo(padre.getDerecha())) {
				return insertarDerecha(padre, dato);
			}
			return insertar(padre.getDerecha(),dato);
		}
	}

	private Elemento insertarDerecha(Elemento padre, Elemento dato) {
		Elemento n = padre.insertarDerecha(dato);
		if(n != null) {
			this.cantidad +=1;
		}
	
		return n;
	}

	private Elemento insertarIzquierda(Elemento padre, Elemento dato) {
		Elemento n = padre.insertarIzquierda(dato);
		if(n != null) {
			this.cantidad +=1;
		}
		return n;
	}
	
	public String recorrerArbol() {
		ArrayList<Object> arbolDerecha = new ArrayList<Object>();
		ArrayList<Object> arbolIzquierda = new ArrayList<Object>();
		if (this.getCantidad() != 0) {
			if (raiz.getIzquierda() != null) {
				arbolIzquierda.addAll(raiz.getIzquierda().buscarElemento(null));
			}
			if (raiz.getDerecha() != null) {
				arbolDerecha.addAll(raiz.getDerecha().buscarElemento(null));
			}
		}
		return "Arbol \nIzquierda= " + arbolIzquierda + "\nRaiz Arbol "+ raiz.getDato() +", \nDerecha= " + arbolDerecha + "] \nCantidad Total= "+cantidad;
	}
	
//	private List<Object> recorrerArbol(Elemento data){
//		List<Object> result = new ArrayList<Object>();
//		result.addAll(data.buscarElemento(null));
//		return result;
//	}

	@Override
	public String toString() {
		return "Arbol  \nRaiz= " + raiz + "\nCantidad= " + cantidad + "\n";
	}

}
