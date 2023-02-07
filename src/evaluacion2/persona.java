package evaluacion2;

import java.util.Scanner;

public class persona implements Comparable<persona>{

	// defino la clase Persona
	// propiedades
	private String dni; 
	private String nombre; 
	private String apellidos; 
	private fecha fechanacimiento;
	
	// constructor por defecto
	public persona(){
		this.dni = "";
		this.nombre = "";
		this.apellidos = "";
		this.fechanacimiento = new fecha();
	}
	
	// constructor copia
	public persona(persona p){
		this.dni = p.dni;
		this.nombre = p.nombre;
		this.apellidos = p.apellidos;
		this.fechanacimiento = new fecha(p.fechanacimiento);
	}

	// constructores personalizados
	public persona(String d, String n, String a){
		this.dni = d;
		this.nombre = n;
		this.apellidos = a;
		this.fechanacimiento = new fecha();
	}
	public persona(String d, String n, String a, fecha f){
		this.dni = d;
		this.nombre = n;
		this.apellidos = a;
		this.fechanacimiento = new fecha(f);
	}

	// Getters and Setters	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public fecha getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(fecha fechanacimiento) {
		this.fechanacimiento = new fecha(fechanacimiento);
	}

	// toString
	@Override
	public String toString() {
		return (dni + " " + nombre + " " + apellidos + " " + fechanacimiento);
	}

	// hashCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((fechanacimiento == null) ? 0 : fechanacimiento.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	
	// equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			// si es el mismo objeto
			return true;
		if (obj == null)
			// si obj no est� creado
			return false;
		if (getClass() != obj.getClass())
			// si los objetos NO son de la misma clase
			return false;
		// comparo el valor de las Propiedades
		persona other = (persona) obj;
		return (this.dni.equals(other.dni));
	}

	// compareTo
	@Override
	public int compareTo(persona other) {
		// comparo el valor de las Propiedades
		return (this.dni.compareTo(other.dni));
	}
	
	//metodo leer
	public void leer(Scanner sc){
		// lee por teclado las propiedades
		// leo dni
		System.out.println("Dni: ");
		String d = sc.nextLine();
		while (d.equals("0")) {
			System.out.println("El valor del dni no puede ser 0");
			System.out.println("Dni: ");
			d = sc.nextLine();
		}
		this.dni = d;
		
		// leo nombre
		System.out.println("Nombre: ");
		this.nombre = sc.nextLine();
		
		// leo nombre
		System.out.println("Apellidos: ");
		this.apellidos = sc.nextLine();
		
		// leo fecha nacimiento
		this.fechanacimiento.leer(sc);

	}

}