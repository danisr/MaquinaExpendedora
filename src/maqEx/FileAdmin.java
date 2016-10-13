package maqEx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class FileAdmin {
	HashMap<String, String> hmap = new HashMap<String, String>();
	BufferedReader breader = null;
	BufferedWriter bwriter = null;
	FileReader fReader = null;
	String precio = "";
	int cantidad = 0;

	public FileAdmin(String nombreFichero) {
		leerFichero(nombreFichero);
	}

	public void leerFichero(String fichero) {
		try {
			fReader = new FileReader(fichero);
			breader = new BufferedReader(fReader);
			String line;
			while ((line = breader.readLine()) != null) {
				String[] aux = line.split("; ");
				hmap.put(aux[0], aux[1]);
			}
			breader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getCantidadBebidas(String producto) {
		return hmap.get(producto);
	}

	public String getPrecioBebidas(String producto) {
		return hmap.get(producto);
	}
}
