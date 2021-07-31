package empresa;

/**
 * Clase Empleado asalariado, con un sueldo fijo semanal o mensual
 * @author y-o-p
 *
 */

public class Asalariado extends Empleado{

	private double salario;
	public Asalariado(String nombre, int cedula, double salario) {
		super(nombre, cedula);
		this.salario = salario;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void adicionarEmpleado() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public double getSalario() {
		return salario;
	}
	
	

}
