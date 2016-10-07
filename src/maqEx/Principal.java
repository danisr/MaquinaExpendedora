package maqEx;

import java.util.Scanner;

public class Principal {
	Scanner teclado;
	Dispensador dispensador;
	Clasificador clasificador;
	int precio;

	public Principal() {
		teclado = new Scanner(System.in);
		clasificador = new Clasificador();
		
		Deposito c10 = new Deposito(10, 10);
		Deposito c20 = new Deposito(20, 10);
		Deposito c50 = new Deposito(50, 10);
		Deposito c100 = new Deposito(100, 10);
		Deposito c200 = new Deposito(200, 10);

		Dispensador coca = new Dispensador("CocaCola", 100, 10);
		Dispensador fanta = new Dispensador("Fanta", 80, 10);
		Dispensador sprite = new Dispensador("Sprite", 100, 10);
		Dispensador agua = new Dispensador("Agua", 50, 10);
	}

	public void ejecucion() {
		int opcion = 0; // OPCION A ELEGIR POR USUARIO
		boolean salir = false;

		while (!salir) { // HASTA Q NO SE SELECCIONE OPCION (4 SALIR)
			System.out.println("¿Qué quiere hacer? \n" + "1- Insertar Moneda \n" + "2- Seleccionar Producto \n"
					+ "3- Devolver Moneda \n" + "4- Salir");
			try {
				opcion = teclado.nextInt();

				switch (opcion) {
				case 1:

					break;
				case 2:
					System.out.println("1- Coca-Cola \n" + "2- Fanta \n" + "3- Sprite \n" + "4- Agua");
					int bebida = teclado.nextInt();
					switch (bebida) {
					case 1:
						//precio
						System.out.println("Coca-Cola, precio: " + precio);
						clasificador.seleccionarProducto();
						break;
					case 2:

						break;
					case 3:

						break;
					case 4:

						break;

					default: // NO VALIDO
						System.out.println("Opcion invalida: Seleccione un producto de 1 a 4");
						break;
					}
					break;
				case 3:

					break;
				case 4:
					salir = true;
					break;
				default: // NO VALIDO
					System.out.println("Opcion invalida: marque un numero de 1 a 4");
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Excepcion por opcion invalida: marque un numero de 1 a 4");
				teclado.next();
			}
		}
		teclado.close();
	}
}