package biblioteca;

public class revista extends publicacion{

	public int numrevista;
	
	public revista(String codigo, String titulo, int añopublicacion, int numrevista ) {
		
		super(codigo, titulo, añopublicacion);
		this.numrevista = numrevista;
	}

	@Override
	public String toString() {
		return super.toString() + " - " + numrevista;
	}
	
	


	
}
