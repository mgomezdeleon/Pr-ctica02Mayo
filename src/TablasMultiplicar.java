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
			int num=1;
		    //bucle 1
			for(int i=1 ; i<=10 ; i++) {
					System.out.println(num + "X" + i + "=" + (num*i) );
					//bucle 2
					for(int j=1 ; j <=10 ; j++) {
						System.out.println(i + "X" + j + "=" +(i*j) );
					}
			}
	}
	public static void saludar() {
		// TODO Auto-generated method stub
		System.out.println("Buenos días 1ºde Dam!!!");
	}
}
