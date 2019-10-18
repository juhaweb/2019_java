package p152;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		
		int[] scores = {60,70,80,60,80,90};
		
		System.out.println("score[0] : " +scores[0]);
		System.out.println("score[1] : " +scores[1]);
		System.out.println("score[2] : " +scores[2]);
		System.out.println("score[4] : " +scores[4]);
		
		int sum = 0;
		for(int i=0; i<6; i++) {
			sum += scores[i];
		}
		System.out.println("ÃÑÇÕ: " +sum);
		
		double avg = (double) sum / 6;
		System.out.println("Æò±Õ : "+ avg);
		
		
		
	}
	
	
	
}
