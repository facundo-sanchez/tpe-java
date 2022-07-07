package numero;


//import java.util.List;
//import arbol2.Elemento;


public class Numero implements Comparable<Numero> {
	private int num;

	public Numero() {
	}
	
	public Numero(int num) {
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
	public int compareTo(Numero o) {
		return this.num - o.num;
	}

//	@Override
//	public int compare(Object o1, Object o2) {
//		return ((Numero) o2).getNum() - ((Numero) o1).getNum();
//	}
//
//	@Override
//	public int compareMayor(Object o1,Object o2) {
//		return ((Numero) o2).getNum() - ((Numero) o1).getNum();
//	}
//
//	@Override
//	public int compareMenor(Object o1,Object o2) {
//		return ((Numero) o1).getNum() - ((Numero) o2).getNum();
//	}


}
