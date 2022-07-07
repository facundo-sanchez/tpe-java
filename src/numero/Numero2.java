package numero;

import java.util.ArrayList;
import java.util.List;

import accion.AccionEjecutable;
import arbol.Elemento;
import arbol.ElementoObject;

//import java.util.List;
//import arbol2.Elemento;



public class Numero2 implements Comparable<Object> {
	private int num;

	public Numero2() {
	}
	
	public Numero2(int num) {
		super();
		this.num = num;
	}

	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Numero= " + num;
	}

	@Override
	public int compareTo(Object o) {
		return this.num - ((Numero2) o).num;
	}
	
//	@Override
//	public int compare(Object o1, Object o2) {
//		return ((Numero2) o2).getNum() - ((Numero2) o1).getNum();
//	}

//	@Override
//	public int compareMayor(Object o1,Object o2) {
//		return ((Numero2) o2).getNum() - ((Numero2) o1).getNum();
//	}
//
//	@Override
//	public int compareMenor(Object o1,Object o2) {
//		return ((Numero2) o1).getNum() - ((Numero2) o2).getNum();
//	}


}
