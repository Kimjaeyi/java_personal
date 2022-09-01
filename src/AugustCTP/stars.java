package AugustCTP;

public class stars {

	public static void main(String[] args) {

		for(int i=0; i<5; i++) {
			for(int j=0; j<10; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("-------------------------");
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<10; j++) {
				if (i>0 && i<4) {
					if (j>0 && j<9) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else {
					System.out.print("*");
				}
			} System.out.println("");
		}
		
		System.out.println("-------------------------");
		
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				if (i==10 && j%2==0) {
					if (j==10) {
						System.out.print("0");
					} else {
						System.out.print(" ");
					}
				} else {
					System.out.print(j);
				}
			} System.out.println();
		}
	}

}
