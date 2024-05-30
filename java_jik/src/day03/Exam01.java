package day03;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		//성적을 입력받아 입력받은 성적이 60점이상이면 pass, 아니면
		//fail이 출력되도록 코드를 작성하세요.
		/*
		 * 예시1
		 * 성적 입력 : 65
		 * 65점은 pass
		 * 예시2
		 * 성적 입력 : 45
		 * 45점은 Fail
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("성적 입력 : ");
		int score = scan.nextInt();
		//성적이 60점 이상이면 Pass, 아니면 Fail을 문자열 변수 str에 저장
		System.out.println(score > 60 ? "Pass" : "Fail" );
		
		String str = (score >= 60) ? "Pass" : "Fail"
			
			
	
		
		
		
		
		
	}

}
