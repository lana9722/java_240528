package day04;

public class WhileEx03 {

	public static void main(String[] args) {
			/* 구구단 2단 출력하는 코드 작성
			 * 
			 */
		
		int num = 2 ;
		int i = 1 ; 
		while( i <= 9  ) {
			System.out.println("" + num + "x" +  i +  "=" +  num * i );
			++i; 
		}
		
	}

}
