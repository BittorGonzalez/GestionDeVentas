package evaluacion2;

import java.util.Scanner;

public class Alumno extends persona {

	// defino la clase Alumno
	// propiedades de Alumno
	private String grupo;
	
	// constructor por defecto
	public Alumno(){
		// construyo la parte de Persona
		super();
		// construyo la parte de Alumno
		this.grupo = "1Dw3";
	}
	
	// constructor copia
	public Alumno(Alumno a){
		// construyo la parte de Persona
		super(a);
		// construyo la parte de Alumno
		this.grupo = a.grupo;		
	}

	// constructores personalizados
	public Alumno(persona p){
		// construyo la parte de Persona
		super(p);
		// construyo la parte de Alumno
		this.grupo = "1Dw3";				
	}
	
	public Alumno(persona p, String g){
		// construyo la parte de Persona
		super(p);
		// construyo la parte de Alumno
		this.grupo = g;				
	}
	
	public Alumno(String d, String n, String a, fecha f, String g){
		// construyo la parte de Persona
		super(d,n,a,f);
		// construyo la parte de Alumno
		this.grupo = g;
	}

	// Getters and Setters	
	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	// toString
	@Override
	public String toString() {
		return (super.toString() + " " + grupo);
	}
	
	//metodo leer
	public void leer(Scanner teclado){
		// lee por teclado las propiedades de persona
		super.leer(teclado);
		teclado.nextLine();
		System.out.println("Grupo: ");
		String d = teclado.nextLine();
		while (d.isEmpty()){
			System.out.println("El valor del grupo no puede ser vacio");
			System.out.println("Grupo: ");
			d = teclado.nextLine();
		}
		this.grupo = d;

	}
}
