import java.io.File;
import java.io.FileNotFoundException;

public class ThrowException2 {
	public ThrowException2() {
	}

	public void g(String n) throws FileNotFoundException {
		
		File doc = new File(n);
	}

	public void f(String m) throws RunTimeException {

		try {
			g(m);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
