package day04;

public class WhileEx06 {

	public static void main(String[] args) {
		
		//12의 약수를 출력하는 코드를 작성
		//12의 약수 : 1 2 3 4 5 6 12
		
		int num = 12;
		int i = 1;
		
		System.out.println(num + "의 약수 : ");
		
		while( i <= num ) {
			if(num % i ==  0 ) {
				System.out.println( i+ ( i != num ? ", " : "\n"));
			}	
			++i;
		}
		
	}

}
