package accion;

public class AccionOrdenAsc implements AccionEjecutable {

	@Override
	public String ejecutarNodo(Object o) {
		return o.toString();
	}

}
