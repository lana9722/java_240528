package day05;

public class StarEx03 {

	public static void main(String[] args) {
		/* *을 하나씩 출력해서 다음과 같이 출력되도록 중첩 반복문을 이용하여 작성하세요
		 *      *
		 *     **
		 *    *** 
		 *   ****  
		 *  *****
		 *  
		 *  반복횟수 : i 는 1부터 5까지 1씩 증가
		 *  규칙성 : 공백을 ?개 출력하고 *을 i개 출력 후 엔터
		 *      => 반복횟수 : j는 1부터 ?까지 1씩 증가
		 *         규칙성 :공백을 출력
		 *         반복문 종료 후 : 없음
		 *      => 반복횟수 : j는 1부터 i까지 1씩 증가
		 *      	규칙성 : *을 출력
		 *      	반복문 종료 후 : 엔터 출력   	
		 *  
		 *  
		 */

		//5wnf qksqhr
		int i, j;
		//5줄 반복
		for( i = 1; i <= 5 ; i++) {
			//공백을 5-i개 출력
			for(j = 1; j <= 5-i; j++) {
				System.out.println(" ");
			}
			//*을 i개 출력
			for( j = 1; j <= i; j++) {
				System.out.println("*")
				;
			}
		System.out.println();//System.out.println(//엔터);
		
		
		
		/*for(int i = 1; i <= 5 ; i++) {
			System.out.println(" " <= j + "*" <= i + "\n");
			for(int j = 1; 1 <= ? ; j++) {
				System.out.print("*");
				for(int j = 1; j <=)
			}
			System.out.print("\n");*/
		
		}

	}
}