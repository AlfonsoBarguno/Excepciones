
public class s2N1ex4 {

	public static void main(String[] args) {

		String usuario, pass, repass;

		usuario = "Juan";
		pass = "1980";
		repass = "1981";

		MyHelper h = new MyHelper();

		try {
			h.check_pass(pass, repass);
		} catch (CustomException e) {
			System.out.println("Wrong password: " + e.getMessage());
		}

	}

}

/*
 * String mail = "a@";
 * 
 * try { check_mail(mail); } catch (Exception e) {
 * System.out.println("El correo es demasiado corto."); }
 * 
 * }
 * 
 * static void check_mail (String mail) throws mail_length{
 * 
 * 
 * if(mail.length()<3) {
 * 
 * throw new mail_length(); } }
 * 
 * class mail_length extends Exception{
 * 
 * //al crear una excepción propia //se necesitan dos constructores: //uno sin
 * parámetros y el otro con.
 * 
 * 
 * private static final long serialVersionUID = 1L;
 * 
 * public mail_length(){
 * 
 * }
 * 
 * public mail_length(String mssg_error) {
 * 
 * super(mssg_error); } } }
 */
