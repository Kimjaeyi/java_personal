package backjoon.step02;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		if (1<=year && year<4000) {
			if (year%4 == 0 && year%100 != 0 || year%400 == 0) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		} else {
			return;
		}
		
	}

}
