package backjoon.step03;

import java.util.Scanner;

public class plma4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//hasNextInt()는 입력값이 정수일 경우 true 반환, 아닐 경우 false 반환하면서 반복문 종료 
		while(sc.hasNextInt()) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a+b);
			
		}
		
	}

}
