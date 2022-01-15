import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class s2N2ex1 {
	/*
	 * Exercici 1. Crea una classe anomenada ThrowException amb dos mètodes, f() i
	 * g(). En g(), generi una excepció d'un nou tipus. En f() invoca a g(), captura
	 * la seva excepció i, en la clàusula catch, genera una excepció diferent.
	 * Comprova el codi en main().
	 */
	public static void main(String[] args) {

		ThrowException p = new ThrowException();

		try {
			p.g("txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		p.f(null);
	}

	
}
