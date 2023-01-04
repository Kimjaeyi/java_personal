package backjoon.step02;

import java.util.Scanner;

public class oven {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int C = sc.nextInt();
		
		int T = 60 * A + B; //시 - > 분
		T += C;
		
		int H = (T / 60) % 24;
		int M = T % 60;
		
		System.out.println(H + " " + M);
		
	}

}
