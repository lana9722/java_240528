package day04;

public class WhileEx04 {

	public static void main(String[] args) {

		int sum = 0;
		int i = 1;
		while(i <= 10) {
			sum = sum + i;
			++i;
			
		}
		
		System.out.println(sum);
	}

}