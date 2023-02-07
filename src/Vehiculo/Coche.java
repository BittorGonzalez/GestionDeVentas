package Vehiculo;

public class Coche extends VehiculoTerrestre {

	public Coche () {
		super(4);
		this.setNombreVehiculo("Coche");
		this.setPotenciaMotor(135);
	}
	
	public Coche (String nombreVehiculo, int potenciaMotor, int velocidadMaxima) {
		super(4);
		this.nombreVehiculo = nombreVehiculo;
		this.potenciaMotor = potenciaMotor;
		this.velocidadMaxima = velocidadMaxima;
	}
	@Override
	public void iniciarDesplazamiento() {
		System.out.println("Arrancando...");
	}

	@Override
	public void finalizarDesplazamiento() {
		System.out.println("Parado...");
		
	}
	
	@Override
	public String toString() {
		return "Coche - " + super.toString();
	}

}
