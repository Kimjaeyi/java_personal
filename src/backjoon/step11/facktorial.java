package backjoon.step11;

import java.util.Scanner;

public class facktorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=N; i>0; i--) {
			i *= i;
		}
		
	}

}
