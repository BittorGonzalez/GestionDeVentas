package Articulo;

public class Vino extends Articulo{

	public String Color;
	public String Origen;
	public int año;
	String uva;
	
	public Vino(String codigo, String nombre, String Marca, double Precio, int Stock, String color, String origen, int año, String uva) {
		super(codigo, nombre, Marca, Precio, Stock);
		this.Color = color;
		this.Origen = origen;
		this.año = año;
		this.uva = uva;
	}

	@Override
	public String printCaracteristicas() {
		String linea = "************************";
		String caracteristicas = super.toString() + "Color: " + Color + "\n" +  "Origen: " + Origen + "\n" + "Año: " + año + "\n" +"Uva: " + uva;
		return caracteristicas + "\n" + linea;
	}

	@Override
	public boolean sano() {
		if(this.Origen.equalsIgnoreCase("Rioja") || this.Origen.equalsIgnoreCase("La Rioja")){
			return true;
		}else {
			return false;
		}
		
	}

}
