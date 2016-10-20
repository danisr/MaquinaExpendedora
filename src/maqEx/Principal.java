package maqEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	Scanner teclado;
	private Clasificador clasificador;
	private Visor visor;
	private FileAdmin bebidasCantidad;
	private FileAdmin bebidasPrecio;
	private FileAdmin monedas;
	private String producto;
	private int disponible = 0;

	public Principal(FileAdmin bebidasCantidad, FileAdmin bebidasPrecio, FileAdmin monedas) {
		teclado = new Scanner(System.in);
		clasificador = new Clasificador();
		visor = new Visor();
		this.bebidasCantidad = bebidasCantidad;
		this.bebidasPrecio = bebidasPrecio;
		this.monedas = monedas;

		// HashMap<Integer, Deposito> auxdepositos =
		// monedas.leerFicheroMon("monedas.txt");
		// //clasificador.setDepositos(auxdepositos);

	}

	public void ejecucion() {
		int opcion = 0; // OPCION A ELEGIR POR USUARIO
		boolean salir = false;
		visor.mostrarBienvenida();

		while (!salir) { // HASTA Q NO SE SELECCIONE OPCION (4 SALIR)
			System.out.println("1- Insertar Moneda\n2- Seleccionar Producto\n3- Devolver Moneda\n4- Salir");

			try {
				opcion = teclado.nextInt();
				switch (opcion) {
				case 1:
					insertarMoneda();
					break;
				case 2:
					seleccionarProducto();
					break;
				case 3:
					retornarMonedas();
					break;
				case 4:
					despedida();
					salir = true;
					break;
				default:
					System.out.println("Opcion invalida. Seleccione una opcion de 1 a 4");
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.err.println(e.getMessage());
			}
		}
	}

	public void insertarMoneda() {
		System.out.println("¿Qué moneda quiere introducir?\n1- 2.00€\n2- 1.00€\n3- 0.50€\n4- 0.20€\n5- 0.10€");
		int moneda = teclado.nextInt();
		teclado.nextLine();
		switch (moneda) {
		case 1:
			moneda = 200;
			clasificador.insertarMoneda(moneda);
			insertarMoneda();
			break;
		case 2:
			moneda = 100;
			clasificador.insertarMoneda(moneda);
			insertarMoneda();
			break;
		case 3:
			moneda = 50;
			clasificador.insertarMoneda(moneda);
			insertarMoneda();
			break;
		case 4:
			moneda = 20;
			clasificador.insertarMoneda(moneda);
			insertarMoneda();
			break;
		case 5:
			moneda = 10;
			clasificador.insertarMoneda(moneda);
			insertarMoneda();
			break;
		default:
			System.out.println("Opcion invalida: Seleccione una moneda introduciendo de 1 a 5");
			break;
		}
	}

	public void seleccionarProducto() {
		System.out.println("1- Coca Cola\n2- Fanta Naranja\n3- Sprite\n4- Agua");
		int bebida = teclado.nextInt();
		teclado.nextLine();
		switch (bebida) {
		case 1:
			producto = "CocaCola";
			// Pasan a disponible las cantidades del producto seleccionado
			disponible = Integer.parseInt(bebidasCantidad.getCantidadBebidas(producto));
			if (disponible > 0) {
				System.out.println("Ha elegido Coca Cola. Introduzca "
						+ (float) Integer.parseInt(bebidasPrecio.getPrecioBebidas(producto)) / 100 + "0€");
			} else {
				System.out.println("Producto Agotado!!!");
			}
			clasificador.seleccionarProducto(producto);
			break;
		case 2:
			producto = "FantaNaranja";
			disponible = Integer.parseInt(bebidasCantidad.getCantidadBebidas(producto));
			if (disponible > 0) {
				System.out.println("Ha elegido Fanta Naranja. Introduzca "
						+ (float) Integer.parseInt(bebidasPrecio.getPrecioBebidas(producto)) / 100 + "0€");
			} else {
				System.out.println("Producto Agotado!!!");
			}
			clasificador.seleccionarProducto(producto);
			break;
		case 3:
			producto = "Sprite";
			disponible = Integer.parseInt(bebidasCantidad.getCantidadBebidas(producto));
			if (disponible > 0) {
				System.out.println("Ha elegido Sprite. Introduzca "
						+ (float) Integer.parseInt(bebidasPrecio.getPrecioBebidas(producto)) / 100 + "0€");
			} else {
				System.out.println("Producto Agotado!!!");
			}
			clasificador.seleccionarProducto(producto);
			break;
		case 4:
			producto = "Agua";
			disponible = Integer.parseInt(bebidasCantidad.getCantidadBebidas(producto));
			if (disponible > 0) {
				System.out.println("Ha elegido Agua. Introduzca "
						+ (float) Integer.parseInt(bebidasPrecio.getPrecioBebidas(producto)) / 100 + "0€");
			} else {
				System.out.println("Producto Agotado!!!");
			}
			clasificador.seleccionarProducto(producto);
			break;
		default:
			System.out.println("Opcion invalida: Seleccione un producto introduciendo de 1 a 4");
			break;
		}
	}

	public void retornarMonedas() {

	}

	public void despedida() {
		visor.mostrarDespedida();
	}
}