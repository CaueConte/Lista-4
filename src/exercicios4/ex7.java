package exercicios4;
import java.util.Scanner;
import java.math.*;


public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int quadrado = 0;
		int cubo = 0;
		
		for(int i = 1; i < numero; i++) {
			System.out.println(numero);
			quadrado = i *i;
			System.out.print(", " + quadrado);
			cubo = i * i * i;
			System.out.print(", " + cubo);
		}
	}

}
