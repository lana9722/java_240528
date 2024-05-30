package day03;

import java.util.Scanner;

public class SwitchEx03 {

	public static void main(String[] args) {
		/*산술 연산자와 두 정수를 입력받아 산술연산자에 맞는 연산 결과를 출력하는 코드를 작성하세요.
		 * 
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("두 정수와 산술 연산자를 입력하세요 : ");
		int num1 = scan.nextInt();//콘솔에서 정수를 가져옴
		char operator = scan.next().charAt(0);
		int num2 = scan.nextInt();
		
		double result;
		
		switch(operator) {
		case '+' : 
			System.out.println("" + num1 + operator + num2 + " = " + (num1 + num2));
			break;
		case '-' : 
			System.out.println("" + num1 + operator + num2 + " = " +(num1 - num2));
			break;
		case '*' : 
			System.out.println("" + num1 + operator + num2 + " = " +(num1 * num2));
			break;
		case '/' : 
			System.out.println("" + num1 + operator + num2 + " = " + (num1 / num2));
			break;
		case '%' : 
			System.out.println("" + num1 + operator + num2 + " = " +(num1 % num2));
			break;
			
		
		}
		
		
		
	}

}
