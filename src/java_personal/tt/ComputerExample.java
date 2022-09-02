package java_personal.tt;

public class ComputerExample {

	public static void main(String[] args) {

		int param = 7;
		System.out.println("원의 반지름 : " +param);
		System.out.println();
		
		Calculator calculator = new Calculator();
		
		System.out.println("원면적 : " +calculator.CircleArea(7));
		System.out.println();
		
		Computer computer = new Computer();
		
		System.out.println("원면적 : " +computer.CircleArea(7));
		
		
	}

}
