import java.io.FileNotFoundException;

public class s2N2ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowException p = new ThrowException();

		try {
			p.g("txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		p.f(null);
	}

}
