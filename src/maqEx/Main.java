package maqEx;

public class Main {	
	public static void main(String[] args) {
		
		FileAdmin bebidasCantidad = new FileAdmin("bebidasCantidad.txt");
		FileAdmin bebidasPrecio = new FileAdmin("bebidasPrecio.txt");
		FileAdmin monedas = new FileAdmin("monedas.txt");
				
		Principal principal = new Principal(bebidasCantidad,bebidasPrecio,monedas);
		
		principal.ejecucion();	
	}
}
