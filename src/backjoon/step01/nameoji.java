package backjoon.step01;

import java.util.Scanner;

public class nameoji {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if (A >= 2 && B <= 10000 && C <= 10000) {
			System.out.println((A+B)%C);
			System.out.println(((A%C) + (B%C))%C);
			System.out.println((A*B)%C);
			System.out.println(((A%C)*(B%C))%C);
		} else {
			return;
		}
		
	}

}
