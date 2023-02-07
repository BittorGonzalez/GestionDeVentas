package biblioteca;

public class publicacion {

	public String codigo;
	public String titulo;
	public int añopublicacion;
	
	
	
	public publicacion(String codigo, String titulo, int añopublicacion) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.añopublicacion = añopublicacion;
		
	}

	@Override
	public String toString() {
		return codigo + " - " + titulo + " - " + añopublicacion;
	}
	


}
