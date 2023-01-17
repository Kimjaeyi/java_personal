package backjoon.step04;

import java.util.HashSet;
import java.util.Scanner;

public class remainder {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		//자바 collection 중 set의 파생클래스.
		//중복되는 원소의 경우 하나만 저장. 순서 개념 x. 만약 정렬을 하고 싶다면 리스트로 변환 후 정렬
		HashSet<Integer> h = new HashSet<Integer>();
 
		for (int i = 0; i < 10; i++) {
			h.add(in.nextInt() % 42);
		//입력받은 값의 나머지 값을 add메소드를 통해 HashSet에 저장
		}
        
		//HashSet.size() = HashSet의 크기(저장 원소 개수)반환
		System.out.print(h.size());
		
	}

}
