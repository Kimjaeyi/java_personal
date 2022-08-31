package AugustCTP;

public class average {

	public static void main(String[] args) {

		int[] scoreChemistry = {88,99,45,86,34};
		int sum = 0;
		
		for(int i=0; i<scoreChemistry.length; i++) {
			sum += scoreChemistry[i];
		}
		
		double avg = (double)sum/5;
		
		System.out.println("평균은 : " +avg);
		
	}

}
