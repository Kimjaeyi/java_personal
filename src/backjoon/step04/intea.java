package backjoon.step04;

import java.util.Scanner;

public class intea {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] array = new int[n];
		int cnt = 0;
		
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		int a = sc.nextInt();
		
		for(int i = 0; i < array.length; i++) {
			if (a == array[i]) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}

}
