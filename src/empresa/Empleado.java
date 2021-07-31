package empresa;

public abstract class Empleado {

	private String nombre;
	private int cedula;
	
	
	public Empleado(String nombre, int cedula) {
		this.nombre = nombre;
		this.cedula = cedula;
	}
	
	public abstract void adicionarEmpleado();

	public abstract double getSalario();	

	
}
