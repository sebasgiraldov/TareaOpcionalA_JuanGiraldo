package empresa;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase encargada de adicionar empleados a la empresa y de sumar la nomina total
 * @author y-o-p
 *
 */
public class RecursosHumanos {
	
	private List<Empleado> empleados;
	
	public RecursosHumanos() {
		empleados = new ArrayList<Empleado>();
	}
	
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
