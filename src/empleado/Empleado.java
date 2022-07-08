package empleado;

public class Empleado extends Persona implements Comparable<Empleado> {
	private int legajo;
	private double sueldo;

	public Empleado(String nombre, String apellido, Integer dni, int legajo, double sueldo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.legajo = legajo;
		this.sueldo = sueldo;
	}

	/**
	 * @return the legajo
	 */
	public int getLegajo() {
		return legajo;
	}

	/**
	 * @param legajo the legajo to set
	 */
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	/**
	 * @return the sueldo
	 */
	public double getSueldo() {
		return sueldo;
	}

	/**
	 * @param sueldo the sueldo to set
	 */
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public int compareTo(Empleado o) {
		return this.getLegajo() - o.getLegajo();
	}

	@Override
	public String toString() {
		return "Empleado " + super.toString() + " Legajo=" + legajo + " , Sueldo=" + sueldo;
	}

}
