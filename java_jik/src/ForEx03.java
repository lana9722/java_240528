import java.util.Scanner;

public class ForEx03 {

	public static void main(String[] args) {
		/* 문자를 입력받고 입력받은 문자가 y이면 종료하는 코드를 작성하세요.(for문 이용)
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		char ch;
		
		for(ch = 'n';ch != 'y'; ch = scan.next().charAt(0)) {
			System.out.println("문자를 입력하세요 : ");
		}
	
	
		
		
	}

}
