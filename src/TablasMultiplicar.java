import java.util.Scanner;
public class TablasMultiplicar {

	public static void main(String[] args) {
		
		multiplicar();
		
	}public static void multiplicar() {
		for(int i = 1; i <=10;i++) {
			System.out.println("Tabla del: " + i);
			for (int j = 1; j <=10;j++) {
				System.out.println(j*i);
			}
		}
	}
}