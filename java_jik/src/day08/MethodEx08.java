package day08;

import java.util.Scanner;

public class MethodEx08 {

	public static void main(String[] args) {
		/*정수 n을 입력받아 입력받은 n 크기를 가지는 배열을 생성하는 코드를 작성하세요.
		 * 메서드를 이용
		 * 
		 */
	Scanner scan=new Scanner(System.in);
	
	
	
	System.out.println("정수 : ");
	int n = scan.nextInt();
	
	int[] intList = makeList(n);
	
	System.out.println(intList.length);
		
	}
	// num1 값
	public static int[] makeList ( int n) {
		return new int[n];
		
	}
	
	/** 기능 :
	 * 매개변수 :
	 * 리턴타입 :
	 * 메서드명 :
	 * 
	 */

}
