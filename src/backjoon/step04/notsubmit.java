package backjoon.step04;

import java.util.Scanner;

public class notsubmit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[31];
		
		for (int i = 1; i <= 28; i++) {
			int p = sc.nextInt();
			arr[p] = 1;
		}
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != 1) {
				System.out.println(i);
			}
		}
		
	}

}
