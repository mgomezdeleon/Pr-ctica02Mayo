import java.util.Scanner;
public class TablasMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pr�ctica Tablas de Multiplicar
			saludar();
			
			multiplicar();
			
		//*****************************************
		// Crear una funci�n que imprima las 10 tablas de 
		// multiplicar
		//*****************************************
		
		
	}
	
	public static void multiplicar() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Tabla del " + i);
			for (int j = 0; j < 10; j++) {
				System.out.println(i +  "*" + j + " = " + i*j);
			}
		
		}
	
	}
	
	public static void saludar() {
		// TODO Auto-generated method stub
		System.out.println("Buenos d�as 1�de Dam!!!");
	}
	
	
}
