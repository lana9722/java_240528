package day03;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("학생1 성적 입력 : ");
		int score1 = scan.nextInt();//콘솔에서 정수를 가져옴
		System.out.println();
		
		System.out.println("학생2 성적 입력 : ");
		int score2 = scan.nextInt();//콘솔에서 정수를 가져옴
		System.out.println();
		
		System.out.println("학생3 성적 입력 : ");
		int score3 = scan.nextInt();//콘솔에서 정수를 가져옴
		System.out.println();
		
		int sum = score1 + score2 + score3;
		double avg = (double)sum /3;
		System.out.println("총점 : " + sum + "점. 평균 :" + avg);
	}

}
