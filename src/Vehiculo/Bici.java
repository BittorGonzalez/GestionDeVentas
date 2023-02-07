package Vehiculo;

public class Bici extends VehiculoTerrestre {

	public Bici() {
		
		super(2);
		this.setNombreVehiculo("Bici");
		
	}
	
	public Bici (String nombreVehiculo, int potenciaMotor, int velocidadMaxima, int ruedas) {
		super(nombreVehiculo,potenciaMotor, velocidadMaxima, ruedas);
	}
	
	public void iniciarDesplazamiento() {
		System.out.println("Pedaleando...");
	}
	
	public void finalizarDesplazamiento() {
		System.out.println("Parando...");
	}

	@Override
	public String toString() {
		return "Bici - " + super.toString();
	}
	
	
}
