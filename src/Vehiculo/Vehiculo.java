package Vehiculo;

abstract class Vehiculo {

	public String nombreVehiculo;
	public int potenciaMotor;
	public int velocidadMaxima;
	
	
	public Vehiculo() {
		this.nombreVehiculo = "";
		this.potenciaMotor = 0;
		this.velocidadMaxima = 0;
	}
	
	public Vehiculo(String nombreVehiculo) {
		this.nombreVehiculo = nombreVehiculo;
		this.potenciaMotor = 0;
		this.velocidadMaxima = 0;
	}
	
	public Vehiculo(String nombreVehiculo, int potenciamotor, int velocidadMaxima) {
		this.nombreVehiculo = nombreVehiculo;
		this.potenciaMotor = potenciamotor;
		this.velocidadMaxima = velocidadMaxima;
	}
	
	public Vehiculo(Vehiculo v) {
		this.nombreVehiculo = v.nombreVehiculo;
		this.potenciaMotor = v.potenciaMotor;
		this.velocidadMaxima = v.velocidadMaxima;
	}

	public String getNombreVehiculo() {
		return nombreVehiculo;
	}

	public void setNombreVehiculo(String nombreVehiculo) {
		this.nombreVehiculo = nombreVehiculo;
	}

	public int getPotenciaMotor() {
		return potenciaMotor;
	}

	public void setPotenciaMotor(int potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombreVehiculo + " Potencia: " + potenciaMotor + " CV Velocidad: " + velocidadMaxima + " Km/h" ;
	}
	
	
	public abstract void iniciarDesplazamiento();
	public abstract void finalizarDesplazamiento();
	
	
}
