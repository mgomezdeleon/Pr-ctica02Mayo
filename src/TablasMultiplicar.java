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
		Scanner ent=new Scanner(System.in);
	    int num;
	    
	    System.out.print("Introduce un número entero: ");       
	    
	    num = ent.nextInt();
	    System.out.println("Tabla del " + num);
	    for(int i = 1; i<=10; i++){
	    System.out.println(num + " * " + i + " = " + num*i); 
	    
	    }
		
	}
	public static void saludar() {
		// TODO Auto-generated method stub
		System.out.println("Buenos días 1ºde Dam!!!");
	}
}
