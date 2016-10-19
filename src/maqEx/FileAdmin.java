package maqEx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class FileAdmin {
	HashMap<String, String> hmapPro = new HashMap<String, String>();
	HashMap<Integer, Deposito> hmDeposito = new HashMap<Integer, Deposito>();
	BufferedReader breader = null;
	BufferedWriter bwriter = null;
	FileReader fReader = null;
	Deposito deposito;

	public FileAdmin(String nombreFichero) {
		leerFicheroPro(nombreFichero);
	}

	public void leerFicheroPro(String fichero) {
		try {
			fReader = new FileReader(fichero);
			breader = new BufferedReader(fReader);
			String line;
			while ((line = breader.readLine()) != null) {
				String[] aux = line.split("; ");
				hmapPro.put(aux[0], aux[1]);
			}
			breader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public HashMap<Integer, Deposito> leerFicheroMon(String fichero) {
		hmDeposito = null;
		try {
			fReader = new FileReader(fichero);
			breader = new BufferedReader(fReader);
			String line;
			while ((line = breader.readLine()) != null) {
				String[] aux = line.split("; ");
				int valor = Integer.parseInt(aux[0]);
				int cantidad = Integer.parseInt(aux[1]);
				Deposito depAux = new Deposito(valor, cantidad);
				hmDeposito.put(valor, depAux);
			}
			breader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return hmDeposito;
	}

	public void crearDepositos() {
		hmDeposito = new HashMap<Integer, Deposito>();
	}

	public String getCantidadBebidas(String producto) {
		return hmapPro.get(producto);
	}

	public String getPrecioBebidas(String producto) {
		return hmapPro.get(producto);
	}
}
