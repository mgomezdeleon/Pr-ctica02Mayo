import java.util.Scanner;
public class TablasMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Práctica Tablas de Multiplicar
			saludar();
			
		//*****************************************
		// Crear una función que imprima las 10 tablas de 
		// multiplicar
		//*****************************************
		
		
	}
	public static void saludar() {
		// TODO Auto-generated method stub
		System.out.println("Buenos días 1ºde Dam!!!");
		
		for (int i=1; i<11; i++) {
			if(i!=1) {
				System.out.println();
			}
			System.out.println("Tabla del " + i);
			for(int j=1; j<11; j++) {
				System.out.println(i + "x" + j + "= " + i*j);
			}
		}
	}
}
