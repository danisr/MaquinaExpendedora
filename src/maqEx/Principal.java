package maqEx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Principal {
	Scanner teclado;
	Dispensador dispensador;
	Clasificador clasificador;
	Visor visor;
	FileAdmin bebidasCantidad;
	FileAdmin bebidasPrecio;
	FileAdmin monedas;
	int precio;
	String producto;
	int disponible = 0;

	public Principal(FileAdmin bebidasCantidad, FileAdmin bebidasPrecio, FileAdmin monedas) {
		teclado = new Scanner(System.in);
		clasificador = new Clasificador();
		visor = new Visor();
		this.bebidasCantidad = bebidasCantidad;
		this.bebidasPrecio = bebidasPrecio;
		this.monedas = monedas;
	}

	public void ejecucion() {
		int opcion = 0; // OPCION A ELEGIR POR USUARIO
		boolean salir = false;
		visor.mostrarBienvenida();

		while (!salir) { // HASTA Q NO SE SELECCIONE OPCION (4 SALIR)
			System.out.println("¿Qué desea? \n" + "1- Insertar Moneda \n" + "2- Seleccionar Producto \n"
					+ "3- Devolver Moneda \n" + "4- Salir");
			try {
				opcion = teclado.nextInt();

				switch (opcion) {
				case 1:

					break;
				case 2:
					System.out.println("1- Coca Cola \n" + "2- Fanta Naranja \n" + "3- Sprite \n" + "4- Agua");
					int bebida = teclado.nextInt();
					switch (bebida) {
					case 1:
						producto = "CocaCola";
						disponible = Integer.parseInt(bebidasCantidad.getCantidadBebidas(producto));
						if (disponible > 0) {
							System.out.println("Ha elegido Coca Cola. Introduzca "
									+ (float) Integer.parseInt(bebidasPrecio.getPrecioBebidas(producto)) / 100 + " €");
						} else {
							System.out.println("Producto Agotado!!!");
						}
						clasificador.seleccionarProducto(producto);
						break;
					case 2:
						if (bebida == 2) {
							producto = "FantaNaranja";
						}
						disponible = Integer.parseInt(bebidasCantidad.getCantidadBebidas(producto));
						if (disponible > 0) {
							System.out.println("Ha elegido Fanta Naranja. Introduzca "
									+ (float) Integer.parseInt(bebidasPrecio.getPrecioBebidas(producto)) / 100 + " €");
						} else {
							System.out.println("Producto Agotado!!!");
						}
						clasificador.seleccionarProducto(producto);
						break;
					case 3:
//						if (bebida == 3) {
//							producto = "Sprite";
//						}
//						disponible = Integer.parseInt(bebidasCantidad.getCantidadBebidas(producto));
//						if (disponible > 0) {
//							System.out.println("Ha elegido Sprite. Introduzca "
//									+ (float) Integer.parseInt(bebidasPrecio.getPrecioBebidas(producto)) / 100 + " €");
//						} else {
//							System.out.println("Producto Agotado!!!");
//						}
//						clasificador.seleccionarProducto(producto);
						break;
					case 4:
//						if (bebida == 4) {
//							producto = "Agua";
//						}
//						disponible = Integer.parseInt(bebidasCantidad.getCantidadBebidas(producto));
//						if (disponible > 0) {
//							System.out.println("Ha elegido Agua. Introduzca "
//									+ (float) Integer.parseInt(bebidasPrecio.getPrecioBebidas(producto)) / 100 + " €");
//						} else {
//							System.out.println("Producto Agotado!!!");
//						}
//						clasificador.seleccionarProducto(producto);
//						break;
					default: // NO VALIDO
						System.out.println("Opcion invalida: Seleccione un producto introduciendo de 1 a 4");
						break;
					}
					break;
				case 3:

					break;
				case 4:
					visor.mostrarDespedida();
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