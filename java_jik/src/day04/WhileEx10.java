package day04;

import java.util.Scanner;

public class WhileEx10 {

	public static void main(String[] args) {
		
// 반복문을 이용하여 문자를 입력받고 입력받은 문자가 y이면 반복문을 종료하는 코드를 작성
		/*반복횟수 : ch는 y가 아닌 문자로 시작해서 y가 아니면 반복
		 * 규칙성 : 안내문구 출력 후ch에 Scanner를 이용하여 문자를 저장
		 * 반복문 종료 후 : 없음
		 * 
		 */
		
		/*
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자를 입력하세요 : ");
		
		char ch = scan.next().charAt(0);
		
		 while (ch <= 'y') {
			 
			 System.out.print(ch++ + " ");
			 
		}
		
		// char ch = scan.next().charAt(0);
		// System.out.println(ch);
		*/
		char ch = 'n';
		Scanner scan = new Scanner(System.in);
		while(ch != 'y') {
			System.out.println("문자 입력 : ");
			ch = scan.next().charAt(0);
		}
		
		
	}

}
