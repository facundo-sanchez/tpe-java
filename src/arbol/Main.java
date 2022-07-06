package arbol;


//import animal.Animal2;
import numero.Numero2;

public class Main {

	public static void main(String[] args) {
		Elemento num1 = new Numero2(8);
		Elemento num2 = new Numero2(3);
		Elemento num3 = new Numero2(10);
		Elemento num4 = new Numero2(6);
		Elemento num5 = new Numero2(1);
		Elemento num6 = new Numero2(14);
		Elemento num7 = new Numero2(13);
		Elemento num8 = new Numero2(7);
		Elemento num9 = new Numero2(4);
//		Elemento num2 = new Numero2(1);
//		Elemento a = new Animal2("a");
		Arbol arbol = new Arbol();
//		arbol.insertar(a);
		arbol.insertar(num1);
		arbol.insertar(num2);
		arbol.insertar(num3);
		arbol.insertar(num4);
		arbol.insertar(num5);
		arbol.insertar(num6);
		arbol.insertar(num7);
		arbol.insertar(num8);
		arbol.insertar(num9);
//		Elemento ele = new NodoHoja(num);
//		Nodo nodo = new Nodo(num);
//		System.out.println(arbol.recorrerArbol());
		System.out.println(arbol);
	}
}
