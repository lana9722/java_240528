package day06;

import java.util.Scanner;

public class ArrayEx09 {

	public static void main(String[] args) {
		String [] list = {"dog", "cat", "java", "cup", "computer"};
		//문자열을 입력받아 입력받은 문자열이 있는지 없는지 알려주는 코드를 작성하세요
		
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < list.length; i++) {
			System.out.println("문자열 입력 : ");
			String str1 = scan.next();
		}//list str1 입력값을 리스트값과 같다고 할때
		 //위에 for문에서 이미 내가 str1과 list값이 같다고 할때라 코딩을
		 //하고싶음
			if( str1 == list )
				//{System.out.println("있다")};
		//  else if {( str != list )
		//		  {System.out.println("없다")};
		//		
			
		}
		
	}

}
