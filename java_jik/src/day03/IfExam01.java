package day03;

import java.util.Scanner;

public class IfExam01 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("나이 입력: ");
		int age = scan.nextInt();
		
		if(age >= 19) {
			System.out.println("성인");
			}
		else {
			System.out.println("미성년자");
		}
		
/*		int num = 19;
				if( num < 19  ) {
					System.out.println("성인");
				}
				else if ( num >= 19) {
					System.out.println("미성년자");
				}
	}*/
	}
}
