import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class s2N2ex1 {
	/*
	 * Exercici 1. Crea una classe anomenada ThrowException amb dos m�todes, f() i
	 * g(). En g(), generi una excepci� d'un nou tipus. En f() invoca a g(), captura
	 * la seva excepci� i, en la cl�usula catch, genera una excepci� diferent.
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
