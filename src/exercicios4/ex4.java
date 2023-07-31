package exercicios4;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int quantidade = sc.nextInt();
		
		
		for( int i = 0; i < quantidade; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (b == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				System.out.println(a/b);
			}
		}
	
	}
}
