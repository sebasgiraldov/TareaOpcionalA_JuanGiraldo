package empresa;

public class PorHoras extends Empleado{
	
	private int horas;
	private double valorxhora;
	private double salario;

	public PorHoras(String nombre, int cedula, int horas, double valorxhora) {
		super(nombre, cedula);
		this.horas = horas;
		this.valorxhora = valorxhora;
	}

	@Override
	public void adicionarEmpleado() {
		// TODO Auto-generated method stub
	}
	
	public boolean bonificacion() {
		if (horas > 40) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public double getSalario() {
		salario = horas * valorxhora;
		if (bonificacion()) {
			salario = salario + 200000;
		}
		return salario;
	}

}
