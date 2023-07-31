package exercicios4;
import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		int numero = sc.nextInt();
		
		for(int i = 1; i < numero; i++) {
			if ((numero % i == 0)) {
				System.out.println(numero);
			}
			else{
				
			}
		}
	}

}
