package Articulo;

public abstract class Articulo {

	public String Codigo;
	public String Nombre;
	public String Marca;
	public double Precio;
	public int Stock;
	

	public Articulo(String codigo, String nombre, String Marca, double Precio, int Stock) {
		this.Codigo = codigo;
		this.Nombre = nombre;
		this.Marca = Marca;
		this.Precio = Precio;
		this.Stock = Stock;
	}
	
	public Articulo(Articulo a) {
		this.Codigo = a.Codigo;
		this.Nombre = a.Nombre;
		this.Marca = a.Marca;
		this.Precio = a.Precio;
		this.Stock = a.Stock;
	}
	

	public int sumarStock(int stockNum) {
		this.Stock += stockNum;
		return Stock;
	}
	public int restarStock(int stockNum) {
		this.Stock -= stockNum;
		return Stock;
	}
	
	public abstract String printCaracteristicas();
	public abstract boolean sano();
	
	
	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}

	@Override
	public String toString() {
		return "Codigo: " + Codigo + "\n" + "Nombre: " + Nombre + "\n" + "Marca: " + Marca + "\n" + "Precio: " + Precio + "\n" + "Stock: " + Stock + "\n";
	}

	
}
