package empresa;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RecursosHumanos recursoshumanos = new RecursosHumanos();
		//Calcular Nomina sin empleados
		System.out.println("--Se calcula la nomina sin empleados, el resultado deber ser 0.");
		System.out.println("Nomina sin empleados: " + recursoshumanos.calcularNomina());
		//Crear empleado Asalariado
		System.out.println("--Se crea un empleado Asalariado, el nombre es Juanito 123456 con salario 350000");
		Empleado empleado1 = new Asalariado("juanito", 123456, 350000);
		System.out.println(empleado1);
		recursoshumanos.adicionarEmpleado(empleado1);
		//Crear empleado Por Horas
		System.out.println("--Se crea un empleado por horas, el nombre es Pedrito 123457, 45 horas a 3500 con salario 357500");
		Empleado empleado2 = new PorHoras("pedrito", 123457, 45, 3500);
		System.out.println(empleado2);
		recursoshumanos.adicionarEmpleado(empleado2);
		//Se calcula la nomina con los dos empleados
		System.out.println("--Se Calcula la nomina con empleados, el resultado debe ser 707500");
		System.out.println("Nomina con empleados: "+recursoshumanos.calcularNomina());
	}

}
