package day04;

public class WhileEx09 {

	public static void main(String[] args) {
		/* a부터 z까지 출력하는 코드를 작성하세요.
		 * abcdefg...xyz
		 */
		
		
		int i = 1;
		while( i <= 25  ) { 
			System.out.println((char)('a'+ i ));
			i++;
		}
		System.out.println();
		/*반복 횟수 : ch 는 'a'부터 'z'까지 1씩 증가
		 * 규칙성 : ch를 출력
		 * 반복문 종료후 : 없음
		 */
		char ch= 'a';
		while(ch <='z') {
			System.out.println(ch);
			ch++;
		}
		
	}

}
