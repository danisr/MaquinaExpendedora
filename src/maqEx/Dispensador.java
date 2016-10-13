package maqEx;

public class Dispensador {
	private int precio;
	private int cantidad;

	public Dispensador(int precio, int cantidad) {
		super();
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public void dispensar() {
		
	}
}
