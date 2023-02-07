package Articulo;

import java.util.ArrayList;

public class Factura implements Facturacion {
	
	public int numero;
	public String nombre;
	public String apellido;
	ArrayList<LineaFactura> lineasFactura;
	public double total;
	
	public Factura(int numero, String nombre, String apellido) {
		this.numero = numero;
		this.nombre = nombre;
		this.apellido = apellido;
	
	}
	

	public void añadirLinea(String Codigo, int cantidad, double total ) {
		
		lineasFactura.add(new LineaFactura(Codigo, cantidad, total));
	}
	
	public void print () {
		
		for(LineaFactura l : lineasFactura) {
			System.out.println(l);
		}
	}


	@Override
	public double calcularTotal() {
		
		double totalLinea = 0;
		for(int i = 0; i<lineasFactura.size(); i++) {
			
				 totalLinea =+ lineasFactura.get(i).totalLinea;
				
			}
		
		double total = totalLinea + (totalLinea*IVA);
		return total;
	}
	
	
}
