package maqEx;

public class Main {	
	public static void main(String[] args) {
		// Ficheros
		FileAdmin bebidasCantidad = new FileAdmin("bebidasCantidad.txt");
		FileAdmin bebidasPrecio = new FileAdmin("bebidasPrecio.txt");
		FileAdmin monedas = new FileAdmin("monedas.txt");
		
		Deposito moneda10 = new Deposito(10, 10);
		
		
		
		Principal principal = new Principal(bebidasCantidad,bebidasPrecio,monedas);
		
		principal.ejecucion();	
	}
}
