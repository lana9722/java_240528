package day04;

public class WhileEx05 {

	public static void main(String[] args) {

		int sum = 0;
		int i = 2;
		while(i <= 10) {
			sum = sum + i;
			++i; ++i; // i += 2;
			
		}
		
		System.out.println(sum);
	}

}
