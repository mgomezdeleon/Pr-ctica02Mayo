import java.util.Scanner;
public class TablasMultiplicar {

	public static void main(String[] args) {
		// Pr�ctica Tablas de Multiplicar
			saludar();
			
		//*****************************************
		// Crear una funci�n que imprima las 10 tablas de 
		// multiplicar
		//*****************************************
			for(int i=1; i<=10; i++) {
				System.out.println("**********************");
				  for(int j=1; j<=10; j++) {
					System.out.println(i + " X " + j + " = "+ (i*j));  
				  }
				 
				  }
			 System.out.println("Pablo Moreta");
		
		
	}
	public static void saludar() {
		System.out.println("Buenos d�as 1�de Dam!!!");
	}
}
