package AugustCTP;

public class sabunmyeon {
	
	public static void main(String[] args) {
	
		int x = 6;
		int y = -2;
		
		if (x>0 && y>0) {
			System.out.println("제1사분면 위에 있습니다.");
		} else if (x<0 && y>0) {
			System.out.println("제2사분면 위에 있습니다.");
		} else if (x<0 && y<0) {
			System.out.println("제3사분면 위에 있습니다.");
		} else if (x>0 && y<0) {
			System.out.println("제4사분면 위에 있습니다.");
		} else if (x==0 && y==0) {
			System.out.println("좌표는 원점입니다.");
		} else {
			System.out.println("어느 별에서 왔니");
		}
		
	}
	
}
