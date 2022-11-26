//x는 테스트케이스 단계. x만큼 for문 동작
//n개의 점 좌표. -> n개만큼 랜덤으로 찍힘 (1<=n<=300)
//s는 시작점. 그 어떤 좌표와도 동일한 위치에 있을 수 x
//1<=point<=5000
//if 점이 시작점보다 클 때 n-s가 되고, 시작점이 점보다 더 클 땐 s-n.

package SSAFYtest;

import java.sql.Array;
import java.util.Random;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int n = sc.nextInt();
		
		for (int tc=1; tc<=x; tc++) {

			int s = sc.nextInt();
			
			System.out.println(n-s);
		}
		
	}

}