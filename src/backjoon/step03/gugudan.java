package backjoon.step03;

import java.util.Scanner;

public class gugudan {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=n; i<n+1; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i +" * " +j +" = " +i*j);
			}
		}
		
	}

}
