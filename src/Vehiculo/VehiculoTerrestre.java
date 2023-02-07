package Vehiculo;

abstract class VehiculoTerrestre extends Vehiculo{

	
	public int numeroRuedas;

	public VehiculoTerrestre() {
		super();
		this.numeroRuedas = 1;
	}
	
	public VehiculoTerrestre(VehiculoTerrestre vt) {
		super(vt);
		this.numeroRuedas = vt.numeroRuedas;
	}	
	
	public VehiculoTerrestre(int nr) {
		super();
		this.numeroRuedas = nr;
	}
	//personalizado
	public VehiculoTerrestre(String nombreVehiculo, int potenciamotor, int velocidadMaxima, int nr) {
		super(nombreVehiculo, potenciamotor,velocidadMaxima);
		this.numeroRuedas = nr;
	}

	@Override
	public String toString() {
		String mensaje;
		mensaje = super.toString();
		mensaje += " Numero Ruedas: " + numeroRuedas ;
		return mensaje;
	}	
	
	






}
