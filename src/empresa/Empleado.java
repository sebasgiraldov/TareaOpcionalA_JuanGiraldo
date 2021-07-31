package empresa;

/**
 * Clase empleado, con nombre y cedula
 * @author y-o-p
 *
 */
public abstract class Empleado {

	private String nombre;
	private int cedula;
	
	
	public Empleado(String nombre, int cedula) {
		this.nombre = nombre;
		this.cedula = cedula;
	}
	
	public abstract void adicionarEmpleado();

	public abstract double getSalario();	
	
	@Override
	public String toString() {
		return "Nombre: "+nombre+" Cedula: "+cedula+" Salario: "+getSalario();
	}

	
}
