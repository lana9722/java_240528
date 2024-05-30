package day03;

import java.util.Scanner;

public class IfExam02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("몇월입니까? : ");
		int moons = scan.nextInt();//콘솔에서 정수를 가져옴

		if( moons == 3 || moons == 4 || moons == 5 ) {
			System.out.println("봄");
		}
		else if ( moons == 6 || moons == 7 || moons == 8 )
			System.out.println("여름");
		else if ( moons == 9 || moons == 10 || moons == 11 )
			System.out.println("가을");
		else if ( moons == 12 || moons == 1 || moons == 2 )
			System.out.println("겨울");
		else 
			System.out.println("잘못된 월");
			
		//if(month >= 3 && month <= 5)
		//System.out.println("봄");
	}

}
