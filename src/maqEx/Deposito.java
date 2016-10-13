package maqEx;

public class Deposito {
	private int valor;
	private int cantidad;

	public Deposito(int valor, int cantidad) {
		super();
		this.valor = valor;
		this.cantidad = cantidad;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public void añadir() {
		cantidad++;
	}

	public void restar() {
		cantidad--;
	}
}
