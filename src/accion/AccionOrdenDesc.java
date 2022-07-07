package accion;

public class AccionOrdenDesc implements AccionEjecutable {

	@Override
	public String ejecutarNodo(Object o) {
		return o.toString();
	}

}
