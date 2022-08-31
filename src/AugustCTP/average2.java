package AugustCTP;

public class average2 {

	public static void main(String[] args) {

		int[][] scores = {{99,88,55}, {55,77,66}, {55,55,44}, {55,55,44}, {55,55,77}};
		
		String[] name = {"고명지", "김진경", "윤희지", "최유진", "허현"};
		
		for(int i=0; i<scores.length; i++) {
			int sum = 0;
			for(int j=0; j<scores[i].length; j++) {
				sum += scores[i][j];
			}
			double avg = (double)sum/scores[i].length;
			System.out.println(name[i] +"의 평균 : " + avg);
		}
		
		System.out.println("--------------------");
		
		String[] subject = {"국어", "영어", "수학"};
		
		for(int i=0; i<scores.length; i++) {
			int sum = 0;
			for(int j=0; j<scores.length; j++) {
				sum += scores[j][i];
			}
			double avg2 = (double)sum/scores.length;
			System.out.println(subject[i] +" 평균 : " +avg2);
		}
		
	}

}
