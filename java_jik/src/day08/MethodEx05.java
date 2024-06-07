package day08;

import java.util.Scanner;

public class MethodEx05 {

	private static Scanner s;

	public static void main(String[] args) {
		/* 정수 배열이 주어지고 주어진 배열에 원하는 정수가 있는지 없는지 확인하는 코드를 작성
		 * 단 메서드를 이용하여 
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		int [] list = new int [] {1,2,3,4,5,6,7,8,9,10};
		//	int num1 = scan.nextInt();

		//		System.out.println("정수를 입력하세요 : ");
		//		for( int i = 0; i <= list.length; i++) {
		//			if ( return == list[i] ) {
		//				System.out.println("있음");
		//				else {System.out.println("없음");
		//				}
		//			}
		//	int num = scan.nextInt();
		
		System.out.println("정수를 입력하세요 : ");
		int num1 = scan.nextInt();
		for( int i = 0; i < list.length; i++)
		{
			if ( sum()  == list[i] )
			{
				System.out.println("있음");
			}
			else
			{
				System.out.println("없음");
			}
		}
	}

	public static int sum (  ) {

		Scanner scan = new Scanner(System.in);
		return scan.nextInt();

	}



	/**기능 :
	 * 매개변수 :
	 * 리턴타입 :
	 * 메서드명 :
	 * 
	 */


}
