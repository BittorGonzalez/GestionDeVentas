package evaluacion2;

import java.util.Objects;
import java.util.Scanner;

public class empleado extends persona{

	public String departamento;
	public String puesto;
	public Double salario;


	public empleado() {
		
		super();
		this.departamento = "";
		this.puesto = "";
		this.salario = 0.0;
	}
	
	public empleado(String departamento, String puesto, Double salario) {
		
		super();
		this.departamento = departamento;
		this.puesto = puesto;
		this.salario = salario;
	}
	
	public empleado(String dni, String nombre, String apellido, fecha f,String departamento, String puesto, Double salario) {
		
		super(dni,nombre, apellido, f);
		this.departamento = departamento;
		this.puesto = puesto;
		this.salario = salario;
		
	}
	
	public empleado(empleado e) {
		super(e);
		this.departamento = e.departamento;
		this.puesto = e.puesto;
		this.salario = e.salario;
	}

	@Override

	public String toString() {

	return (super.toString()+" "+departamento+" "+puesto+" "+salario);

	}
	
	@Override

	public int hashCode() {

	final int prime = 31;

	int result = super.hashCode();

	result = prime * result + Objects.hash(departamento, puesto, salario);

	return result;

	}

	@Override

	public boolean equals(Object obj) {

	if (this == obj)

	return true;

	if (!super.equals(obj))

	return false;

	if (getClass() != obj.getClass())

	return false;

	empleado other = (empleado) obj;

	return Objects.equals(departamento, other.departamento) && Objects.equals(puesto, other.puesto)

	&& Objects.equals(salario, other.salario);

	}

	public int compareTo(empleado other) {

	return super.compareTo(other);

	}
	
	public void leer(Scanner teclado) {

		super.leer(teclado);
		teclado.nextLine();
		System.out.println("Departamento: ");
		String d=teclado.nextLine();
		System.out.println("Puesto: ");
		String p=teclado.nextLine();
		System.out.println("Salario: ");
		Double s=teclado.nextDouble();
		while(s<0) {
		System.out.println("Error el salario no puede ser negativo");
		System.out.println("Salario: ");
		s=teclado.nextDouble();

		}
	
		this.departamento = d;
		this.puesto = p;
		this.salario = s;
	
}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
}
