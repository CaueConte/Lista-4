package exercicios4;
import java.util.Scanner;
import java.util.Locale;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = 3;
		float a, b, c;
		float calculo = 0;
		
		for (int i = 0; i < x; i++) {
			a = sc.nextFloat();
			b = sc.nextFloat();
			c = sc.nextFloat();
			
			calculo = ((a * 2 + b * 3 + c * 5)/10);

			System.out.printf("%.2f", calculo);
		}
		

		
	}

}
