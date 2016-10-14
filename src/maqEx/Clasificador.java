package maqEx;

import java.util.HashMap;

public class Clasificador {
	private int saldo;
	Visor visor;
	HashMap<Integer, Deposito> depositos = new HashMap<Integer, Deposito>();
	HashMap<Integer, Dispensador> dispensadores = new HashMap<Integer, Dispensador>();
	
	public void insertarMoneda(int moneda) {
		depositos.get(moneda).añadir();
		saldo += moneda;
		visor.mostrarSaldo(saldo);
	}

	public void retornarMonedas(int moneda) {
		depositos.get(moneda).restar();
		saldo -= moneda;
		visor.mostrarSaldo(saldo);
	}

	public void seleccionarProducto(String producto) {

	}
}
