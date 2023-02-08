package Articulo;

public class Refresco extends Articulo{


	public String Sabor;
	public boolean Zumo;
	public boolean Gas;
	public int Azucar;
	
	
	public Refresco(String codigo, String nombre, String Marca, double Precio, int Stock, String sabor, boolean Zumo, boolean Gas, int Azucar) {
		super(codigo, nombre, Marca, Precio, Stock);
		this.Sabor = sabor;
		this.Zumo= Zumo;
		this.Gas = Gas;
		this.Azucar = Azucar;
		
	}
	@Override
	public String printCaracteristicas() {
		String linea = "************************";
		String caracteristicas = super.toString() + "Sabor: " + Sabor + "\n" + "Zumo: " + Zumo + "\n" + "Gas: " + Gas + "\n" +"Azucar: " + Azucar;
		return caracteristicas + "\n" + linea ;
	}
	@Override
	public boolean sano() {
		
		if(this.Azucar < 25) {
			return true;
		}else {
			return false;
		}
		
	}
}
