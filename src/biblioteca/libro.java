package biblioteca;

public class libro extends publicacion implements prestable{

	public boolean prestado;
	
	public libro(String codigo, String titulo, int añopublicacion) {
		super(codigo, titulo, añopublicacion);
		this.prestado = false;
	}

	@Override
	public String toString() {
		return super.toString() + " - " + prestado;
	}

	@Override
	public void prestar() {
		
		if(this.prestado == false) {
			this.prestado = true;
			System.out.println("El libro se ha prestado");
		}else {
			System.out.println("El libro no se puede prestar, ya esta prestado anteriormente");
		}
		
	}

	@Override
	public void devolver() {
		if(this.prestado == true) {
			this.prestado = false;
			System.out.println("El libro se ha devuelto");
		}else {
			System.out.println("El libro no se ha devuelto, ya se encuentra en la biblioteca");
		}
	}

	@Override
	public boolean prestado() {
		return prestado;
	}
	
	
}
