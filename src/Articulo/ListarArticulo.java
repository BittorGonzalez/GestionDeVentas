package Articulo;

import java.util.ArrayList;


public class ListarArticulo  {

	ArrayList<Articulo> lista = new ArrayList<>();
	
	public void fillData() {
		
		lista.add(new Refresco("002R", "FantaLimon", "Fanta", 1.25, 3200, "Limon", false, true, 43));
		lista.add(new Refresco("134E", "Limoncelo", "LimonesElCelo", 4.32, 700, "Limon", true, false, 32));
		lista.add(new Refresco("982Y", "Multifrutas", "ElFrutas", 0.63, 1200, "Fruta", true, false, 23));
		lista.add(new Refresco("1182W", "Cocacola", "PepsiCo", 1.83, 300000, "Cola", false, true, 47 ));
		lista.add(new Vino("837EF", "ElCojo", "VinosElManco", 2.43, 230, "Tinto", "Rioja", 2015, "Garnacha"));
		lista.add(new Vino("092LA", "ElCiego", "VinosElSordo", 9.2, 120, "Rosado", "Rias Baixas", 2018, "Tempranillo"));
		lista.add(new Vino("7363PQ", "ElBueno", "VinosElMalo", 12.3, 12, "Blanco", "Barcelona", 2020, "Cabernet"));
		lista.add(new Vino("1821Z", "ElFeo", "VinosElGuapo", 3222.53, 2, "Cava", "Italia", 1980, "Merlot"));
	}
	
	public ArrayList<Articulo> reponer(){
		
		ArrayList<Articulo>listaStock = new ArrayList<>();
		
		for(Articulo a: lista) {
			if(a.Stock < 50 )
			listaStock.add(a);
		}
		
		return listaStock;
	}
	
	
	public ArrayList<Articulo> mascaro(){
		
		
		ArrayList<Articulo>listaMasCaro = new ArrayList<>();
		
		double mayor = lista.get(0).getPrecio();
		
		for(int i = 1; i<lista.size(); i++) {
			if (lista.get(i).getPrecio() > mayor) {
				mayor = lista.get(i).getPrecio();
			}
			
			if(lista.get(i).Precio == mayor) {
				listaMasCaro.add(lista.get(i));
			}
		}
	
		
		return listaMasCaro;
		
	}
	
	public ArrayList<Articulo> equivalentes(String codigo){
		
		ArrayList<Articulo>equivalentes = new ArrayList<>();

		double precio = lista.get(lista.indexOf(codigo)).getPrecio();

		for(int i = 0; i<lista.size(); i++) {
			if(lista.get(i).getPrecio() == precio) {
				equivalentes.add(lista.get(i));
			}
		}
		
		
		return equivalentes;
		
	}
	
	public double precio(String codigo) {
		
	
		double precio = 0;
		for(Articulo a :lista) {
			if(a.getCodigo().equals(codigo)) {
				precio = a.getPrecio();
			}
		}
	
		return precio;
		
	}
}
