package backjoon.step01;

import java.util.Scanner;

public class thai {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		if (1000 <= year && year <= 3000) {
			System.out.println(year-543);
		} else {
			return;
		}
		
	}

}
