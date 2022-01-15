import java.io.File;
import java.io.FileNotFoundException;

public class ThrowException {

	

		public ThrowException() {
		}

		public void g(String n) throws FileNotFoundException {
			File doc = new File(n);
		}

		public void f(String m) {

			try {
				g(m);
			} catch (Exception z) {
				System.out.println("Esta es la nueva excepción.");
			}
		}
	}

