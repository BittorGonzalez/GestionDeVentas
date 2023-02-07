package Vehiculo;

import java.util.ArrayList;

public class VehiculoMain {

	public static void main(String[] args) {

		ArrayList<Vehiculo> arrayVehiculo = new ArrayList<Vehiculo>();
		
		arrayVehiculo.add(new Bici("Orbea", 0, 40, 2));
		arrayVehiculo.add(new Moto("Ducati", 100, 230));
		arrayVehiculo.add(new Coche("Porsche", 340, 250));
		
		for(Vehiculo v: arrayVehiculo) {
			System.out.println(v);
			v.iniciarDesplazamiento();
			v.finalizarDesplazamiento();
			System.out.println();
		}
		
			
			
		
	}

}
