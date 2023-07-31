package exercicios4;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ex2");
		Scanner sc = new Scanner(System.in);
		
		int x =  sc.nextInt();
		int in = 0;
		int out = 0;
		
		for (int i = 0; i < x; i++) {
			int n = sc.nextInt();
			if ((n < 10) ||(n > 20)) {
				out += 1;
			}
			else if((n >= 10) && (n <= 20)) {
				in += 1;
			}
			
		}
		System.out.println("in: " + in);
		System.out.println("out: " + out);
		sc.close();
	}

}
