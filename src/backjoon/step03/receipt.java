package backjoon.step03;

import java.util.Scanner;

public class receipt {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int sum = sc.nextInt();
		int num = sc.nextInt();
		int result = 0;
		
		for (int i = 0; i < num; i++) {
			int price = sc.nextInt();
			int count = sc.nextInt();
			
			result += price*count;
		}
		
		if (sum == result) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}

}
