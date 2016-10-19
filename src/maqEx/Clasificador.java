package maqEx;

import java.util.HashMap;

public class Clasificador {
	private int saldo;
	Visor visor;
	HashMap<Integer, Deposito> hmDeposito = new HashMap<Integer, Deposito>();
	HashMap<Integer, Dispensador> hmDispensadores = new HashMap<Integer, Dispensador>();
	
	public void insertarMoneda(int moneda) {
		hmDeposito.get(moneda).añadir();
		saldo += moneda;
		visor.mostrarSaldo(saldo);
	}

	public void retornarMonedas(int moneda) {
		hmDeposito.get(moneda).restar();
		saldo -= moneda;
		visor.mostrarSaldo(saldo);
	}

	public void seleccionarProducto(String producto) {

	}
}
