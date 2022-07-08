package arbol;


import accion.AccionContador;
import accion.AccionMayor;
import accion.AccionMenor;
import accion.AccionOrdenAsc;
import accion.AccionOrdenDesc;
import empleado.Empleado;


public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		AccionContador contador = new AccionContador();
		AccionMenor menor = new AccionMenor();
		AccionMayor mayor = new AccionMayor();
		AccionOrdenAsc asc = new AccionOrdenAsc();
		AccionOrdenDesc desc = new AccionOrdenDesc();
		
		Arbol numeros = new Arbol();
		numeros.insertar(8);
		numeros.insertar(3);
		numeros.insertar(1);
		numeros.insertar(6);
		numeros.insertar(10);
		numeros.insertar(14);
		numeros.insertar(13);
		numeros.insertar(7);
		numeros.insertar(4);
		
		numeros.recorrerElementos(contador);
		System.out.println("Cantidad de nodos "+contador.getContador());
		numeros.recorrerElementos(mayor);
		System.out.println("Nodo mayor "+mayor.getNodoMayor());
		numeros.recorrerElementos(menor);
		System.out.println("Nodo menor "+menor.getNodoMenor());
		
		numeros.recorrerElementos(asc);
		System.out.println("Arbol orden ascendente");
		for (Comparable n : asc.getResult()) {
			System.out.println(n);
		}
		numeros.recorrerElementos(desc);
		System.out.println("Arbol orden descendente");
		for (Comparable n : desc.getResult()) {
			System.out.println(n);
		}
		
//		//ARBOL ANIMALES
		AccionMenor menorAnimales = new AccionMenor();
		AccionMayor mayorAnimales = new AccionMayor();
		AccionOrdenAsc ascAnimales = new AccionOrdenAsc();
		AccionOrdenDesc descAnimales = new AccionOrdenDesc();
		Arbol animales = new Arbol();
		animales.insertar("gato");
		animales.insertar("canario");
		animales.insertar("perro");
		animales.insertar("conejo");
		animales.insertar("liebre");
		animales.insertar("jabali");
		animales.insertar("carpinchi");
		animales.insertar("zorro");
		animales.insertar("aguilucho");
		
		animales.recorrerElementos(contador);
		System.out.println("Cantidad de nodos "+contador.getContador());
		animales.recorrerElementos(mayorAnimales);
		System.out.println("Nodo mayor "+mayorAnimales.getNodoMayor());
		animales.recorrerElementos(menorAnimales);
		System.out.println("Nodo menor "+menorAnimales.getNodoMenor());
		
		animales.recorrerElementos(ascAnimales);
		System.out.println("Arbol orden ascendente");
		for (Comparable n : ascAnimales.getResult()) {
			System.out.println(n);
		}
		animales.recorrerElementos(descAnimales);
		System.out.println("Arbol orden descendente");
		for (Comparable n : descAnimales.getResult()) {
			System.out.println(n);
		}
		/*
		 Juan García, dni 25.458.123, legajo: 7253, sueldo: $100.000
		 María Perez, dni 23.581.111, legajo: 1222, sueldo: $150.000
		 Pedro Ruiz, dni 27.888.954, legajo: 2375, sueldo: $120.000
		 Federico Perez, dni 12.515.712, legajo: 8253, sueldo: $80.000
		 Facundo Quiroga, dni 33.229.331, legajo: 8002, sueldo: $60.400
		 Rosa Blotta, dni 35.252.232, legajo: 9253, sueldo: $140.500
		 Florencia Paz, dni 15.811.654, legajo: 1530, sueldo: $110.000
		*/
		//ARBOLES EMPLEADO
		AccionMenor menorEmpleado = new AccionMenor();
		AccionMayor mayorEmpleado = new AccionMayor();
		AccionOrdenAsc ascEmpleado = new AccionOrdenAsc();
		AccionOrdenDesc descEmpleado = new AccionOrdenDesc();
		Arbol empleado = new Arbol();
		Empleado e1 = new Empleado("Juan", "García", 25458123, 7253, 100000d);
		Empleado e2 = new Empleado("María", "Perez", 23581111, 1222, 150000d);
		Empleado e3 = new Empleado("Pedro", "Ruiz", 27888954, 2375, 120000d);
		Empleado e4 = new Empleado("Federico", "Perez", 12515712, 8253, 80000d);
		Empleado e5 = new Empleado("Facundo", "Quiroga", 33229331, 8002, 60400d);
		Empleado e6 = new Empleado("Rosa", "Blotta", 35252232, 9253, 140500d);
		Empleado e7 = new Empleado("Florencia", "Paz", 15811654, 1530, 110000d);
		empleado.insertar(e1);
		empleado.insertar(e2);
		empleado.insertar(e3);
		empleado.insertar(e4);
		empleado.insertar(e5);
		empleado.insertar(e6);
		empleado.insertar(e7);

		empleado.recorrerElementos(contador);
		System.out.println("Cantidad de nodos "+contador.getContador());
		empleado.recorrerElementos(mayorEmpleado);
		System.out.println("Nodo mayor "+mayorEmpleado.getNodoMayor());
		empleado.recorrerElementos(menorEmpleado);
		System.out.println("Nodo menor "+menorEmpleado.getNodoMenor());
		empleado.recorrerElementos(ascEmpleado);
		System.out.println("Arbol orden ascendente");
		for (Comparable n : ascEmpleado.getResult()) {
			System.out.println(n);
		}
		empleado.recorrerElementos(descEmpleado);
		System.out.println("Arbol orden descendente");
		for (Comparable n : descEmpleado.getResult()) {
			System.out.println(n);
		}


	}
}
