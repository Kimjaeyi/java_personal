package backjoon.step04;

import java.util.Scanner;

public class max {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] arr = { sc.nextInt(), sc.nextInt(), sc.nextInt(),
				sc.nextInt(), sc.nextInt(), sc.nextInt(),
				sc.nextInt(), sc.nextInt(), sc.nextInt() };
		
		int count = 0;
		int max = 0;
		int index = 0;
        
		for(int value : arr) {
			count++;
            
			if(value > max) {
				max = value;
				index = count;
			}
		}
		//line 15~26을 다음과 같이 작성할 수도 있음
//		int max = 0;
//		int index = 0;
//		        
//		for(int i = 0 ; i < 9 ; i++) {            
//			if(value > max) {
//				max = value;
//				index = (i + 1) ;
//			}
//		}
		
		System.out.println(max);
		System.out.println(index);
		
	}

}
