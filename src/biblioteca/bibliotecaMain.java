package biblioteca;

import java.util.ArrayList;

public class bibliotecaMain {
	
	public static int cuentaPrestado(ArrayList<publicacion> publicaciones){
		int contador = 0;
		for(Object o:publicaciones) {
			if(o instanceof prestable && ((prestable) o).prestado() ) {
				contador++;
			}
		}
		return contador;
		
	}
	
	public static int publicacionesAnteriores(ArrayList<publicacion> publicaciones, int año) {
		int contador = 0;
		for(publicacion p:publicaciones ) {
			if(p.añopublicacion < año) {
				contador++;
			}
		}
		return contador ;
		
	}

	public static void main(String[] args) {

		ArrayList<publicacion> publicaciones = new ArrayList<>();
		
		publicaciones.add(new libro("373E", "Caperucita roja", 1920));
		publicaciones.add(new libro("0282Y", "Tres cerditos", 1870));
		publicaciones.add(new revista("73563L", "Mas q coches", 2020, 5));
		publicaciones.add(new revista("3738Ñ", "CiclismoAFondo", 2022, 17));
		
		libro l = (libro) publicaciones.get(0);
		l.prestar();
		
	
		
		System.out.println();
		
		
		for(publicacion p:publicaciones) {
			System.out.println(p);
		}
		
		System.out.println();
		System.out.println("Hay " + publicacionesAnteriores(publicaciones, 1990) + " publicaciones anteriores a 1990");
		
		System.out.println();
		System.out.println("Hay " + cuentaPrestado(publicaciones) + " libros que estan prestados");

	}

}
