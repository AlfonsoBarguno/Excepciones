

public class MyHelper {

		
		MyHelper(){
			
		}
		
		public void check_pass(String pass, String repass) throws CustomException {
			
			if(!pass.equals(repass)) {
				throw new CustomException("Los campos de password no coinciden.");
			}
		}}

