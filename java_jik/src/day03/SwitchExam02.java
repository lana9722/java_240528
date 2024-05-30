package day03;

import java.util.Scanner;

public class SwitchExam02{

	public static void main(String[] args) {
	/*월을 받아 입력받은 월의 계절을 출력하세요.(switch문을 이용하여)
	 * 345
	 * 678
	 * 91011
	 * 1212 겨울
	 * 그외 잘못된월
	 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = scan.nextInt();
		
		
		switch(num) {
		case 3,4,5: 
			System.out.println("월은 봄입니다");
			break;
		case 6,7,8: 
			System.out.println("월은 여름입니다");
			break;
		case 9,10,11: 
			System.out.println( "월은 가을입니다");
			break;
		case 12,1,2: 
			System.out.println( "월은 겨울입니다");
			break;
		default : 
			System.out.println( "잘못된 월입니다.");
			
		}
	
