import java.util.Scanner;
public class TablasMultiplicar {

	public static void main(String[] args) {
		for(int i = 1;i<11; i++) {
			System.out.println("Tabla de multiplicar del" +i);
			for(int e = 1; e<11; e++) {
				System.out.println(i+" x "+e+" = "+(i*e));	
			}	
		}
	}
	public static void saludar() {
		// TODO Auto-generated method stub
		System.out.println("Buenos d�as 1�de Dam!!!");
	}
}
