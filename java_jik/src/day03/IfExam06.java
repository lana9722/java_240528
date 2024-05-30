package day03;

import java.util.Scanner;

public class IfExam06 {

	public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
		
		
		System.out.println("학점을 입력하세요 : ");
		int score = scan.nextInt();
		
		if(score > 90) {
			System.out.println(score + "의 학점은 A입니다");
		}
		else if(score >= 80) {
				System.out.println(score + "의 학점은 B입니다");
	}
		else if(score >= 70) {
				System.out.println(score + "의 학점은 C입니다");
	}
		else if(score >= 60) {
				System.out.println(score + "의 학점은 D입니다");
	}
		else if(score <= 59) {
				System.out.println(score + "의 학점은 F입니다");
	}
		else {
				System.out.println("잘못된 성적입니다");
		}
			}
	
		
	}

