package empresa;

public class Asalariado extends Empleado{

	private double salario;
	public Asalariado(String nombre, int cedula) {
		super(nombre, cedula);
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
