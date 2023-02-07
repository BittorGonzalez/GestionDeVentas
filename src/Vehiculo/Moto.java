package Vehiculo;

public class Moto extends VehiculoTerrestre {

	public Moto() {
		
		super(2);
		this.setNombreVehiculo("Moto");
		this.setPotenciaMotor(100);
	}
	
	public Moto (String nombreVehiculo, int potenciaMotor, int velocidadMaxima) {
		super(2);
		this.nombreVehiculo = nombreVehiculo;
		this.potenciaMotor = potenciaMotor;
		this.velocidadMaxima = velocidadMaxima;
	}
	
	
	@Override
	public void iniciarDesplazamiento() {

		System.out.println("Dando gas...");
	}

	@Override
	public void finalizarDesplazamiento() {
		System.out.println("Parado...");
		
	}


	@Override
	public String toString() {
		return "Moto - " + super.toString();
	}
	
	
}
