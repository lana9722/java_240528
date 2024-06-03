package day05;

public class StarEx04 {

	public static void main(String[] args) {

		/* *을 하나씩 출력해서 다음과 같이 출력되도록 중첩 반복문을 이용하여 작성하세요
		 *      *		i=1,	공백=4,	*=1,	추*=0
		 *     ** *     i=2,	공백=3,	*=2,	추*=1
		 *    *** **	i=3,	공백=2,	*=3,	추*=2
		 *   **** *** 	i=4,	공백=1,	*=4,	추*=3
		 *  ***** ****	i=5,	공백=0,	*=5,	추*=4
		 *  					공백=5-i * = i개
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
				System.out.print(" ");
			}
			for(j = 1; j <= i; j++) {
				System.out.print("*");
			//*을 i개 출력
			for( j = 1; j <= i-1; j++) {
				System.out.print("*");}
			}
		System.out.println();//System.out.println(//엔터);
		
		}
	}
