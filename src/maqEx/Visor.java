package maqEx;

public class Visor {
	public void mostrarBienvenida() {
		System.out.println("Bienvenido a nuestra máquina expendedora");
	}

	public void mostrarSaldo(int saldo) {
		System.out.println("Su saldo es: " + saldo);
	}

	public void mostrarPrecio() {
		System.out.println("Precio: ");
	}

	public void mostrarError() {
		System.out.println("Error: ");
	}

	public void mostrarDespedida() {
		System.out.println("Gracias por su compra");
	}
}
