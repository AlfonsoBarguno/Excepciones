import java.util.Scanner;

public class s2N1ex5 {

	public static void main(String[] args) {

		Scanner entrada =new Scanner(System.in);
		int elementos=0;
		do{
			try{
				System.out.print("Ingresa el numero de filas:");
				elementos=entrada.nextInt();
			}catch(Exception e){
				System.out.println("Introduciste un dato erroneo.");
				entrada.nextLine();
			}
		}
		while(elementos<50);
 
		System.out.println("No existe esta fila");
		
	}
}
