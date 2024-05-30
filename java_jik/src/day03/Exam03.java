package day03;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {

		/*Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int score1 = scan.nextInt();//콘솔에서 정수를 가져옴
		System.out.println();
		
		System.out.println("정수를 입력하세요 : ");
		int score2 = scan.nextInt();//콘솔에서 정수를 가져옴
		System.out.println();
		
		int score = 60;
		
		
		System.out.println( score  <= (score1 + score2 / 2) && (score1  > 40 ? "합격" )  );
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("과목1 성적 입력 : ");
		int score1 = scan.nextInt();//콘솔에서 정수를 가져옴
		
		System.out.println("과목2 성적 입력 : ");
		int score2 = scan.nextInt();//콘솔에서 정수를 가져옴
		//* 총점은 계산해서 sum에 저장
		int sum = score1 + score2;
		// 총점을 이용하여 평균을 계산하여 avg에 저장
		double avg = (double)sum / 2;
		// 과락이 있는지 확인하여 결과를 isFail에 저장
		boolean isFail = score1 < 40 || score2 < 40;
		// 평균이 60점이상이고 과락이 아니면 합격, 아니면 불합격을 문자열 result에 저장
		//조건식 : 평균이 60점 이상이고 과락이 아니다
		//avg이 60보다 크거나 같다 && isFail이 아니다
		String result = (avg >= 60 && !isFail) ? "합격" : "불합격";
		//result를 이용하여 결과를 출력
		System.out.println(result);
		
	}
	
	

}
