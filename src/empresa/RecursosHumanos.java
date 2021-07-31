package empresa;
import java.util.List;


public class RecursosHumanos {
	
	private List<Empleado> empleados;
	
	public double calcularNomina() {
		double nomina = 0;
		for (Empleado empleado : empleados) {
			nomina = nomina + empleado.getSalario();
		}
		return nomina;
	}
	
	public boolean adicionarEmpleado(Empleado empleado) {
		return empleados.add(empleado);
	}
	
}
