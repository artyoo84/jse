package cmm04.array;
/*
java 의 정석 예제 5 - 10

*/
public class No05_MultiDimArrDemo {
	public static void main(String[] args) {
		int[][] score = {
				{90,90,90},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50},
		};
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		
		System.out.println("번호 국어 영어 수학 총점 평균");
		System.out.println("===============");
		
		for(int i = 0; i < score.length; i++){
			int sum = 0;
			korTotal += score[i][0];
			engTotal += score[i][0];
			mathTotal += score[i][0];
			System.out.print("  "+(i + 1) + "  "); //번호
			for(int j = 0; j < score[i].length;j++){
				sum += score[i][j];
				System.out.print(score[i][j]+"  ");
			}
			System.out.println(sum + "  " + sum/(float)score[i].length);
		}
		System.out.println("=================");
		// 아래 총점에서 국어, 영어, 수학 총점이 나오게 하세요 
		System.out.println("총점 :"+korTotal+" "+engTotal+" "+mathTotal);
	}
}
