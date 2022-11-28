package backjoon.step01;

import java.util.Scanner;

public class threemultiple {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (100 <= A && A < 1000 && 100 <= B && B < 1000) {
			System.out.println(A*(B%10));
			System.out.println(A*((B%100)/10));
			System.out.println(A*(B/100));
			System.out.println(A*B);
		} else {
			return;
		}
		
	}

}
