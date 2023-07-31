package exercicios4;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("impar");
		
		Scanner sc = new Scanner(System.in);
		int x = 0;
		x = sc.nextInt();
		
		for (int i = 0; i < x; i++) {
			if(i %2 != 0) {
				System.out.println(i);
			}
		}
	}

}
