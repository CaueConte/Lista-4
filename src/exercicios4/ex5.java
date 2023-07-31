package exercicios4;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int resultado = 1;
		for(int i = 1; i<=N; i++) {
			
			resultado = resultado * i;
			
			System.out.println(resultado);
		}
	}

}
