package maqEx;

public class Main {
	public static void main(String[] args) {
		Principal principal = new Principal();
		
		FileAdmin bebidasCantidad = new FileAdmin("bebidasCantidad.txt");
		FileAdmin bebidasPrecio = new FileAdmin("bebidasPrecio.txt");
		FileAdmin monedas = new FileAdmin("monedas.txt");
			
	
		principal.ejecucion();	
	}
}
