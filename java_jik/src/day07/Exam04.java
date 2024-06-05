package day07;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		/*Exam01~03 기능을 하나로 합쳐서 다음 기능을 구현하세요
		 *  다음 메뉴를 출력하고 메뉴를 선택하면 안내문구를 출력하는 코드를 작성하세요.
		 * 1. 추가
		 * 2. 검색
		 * 3. 종료
		 * 메뉴선택 : 1
		 * --------
		 * 단어 입력 (종료:-1) :abc
		 * 단어를 추가했습니다. / 단어를 추가하지 못했습니다.
		 * 단어 입력 (종료:-1) : -1
		 * 메뉴로 돌아갑니다.
		 * --------
		 * 1. 추가
		 * 2. 검색
		 * 3. 종료
		 * 메뉴선택 : 2
		 * --------
		 * 단어 입력 (종료:-1) : abc
		 * 있는 단어입니다. / 없는 단어입니다.
		 * 단어 입력 (종료:-1) : abc
		 * 메뉴로 돌아갑니다.
		 * ---------
		 */
		Scanner scan = new Scanner(System.in);

		String[] list = new String[2];

		//	boolean result;
		int num;
		int count = 0;
		String tmp;


		do {
			num = scan.nextInt();
			System.out.println("1. 추가");
			
			System.out.println("2. 검색");
			
			System.out.println("3. 종료");
			
			System.out.println("메뉴 선택 : ");
			
			//1번(추가)를 입력했다라면 밑의 수행문이 작업
			/*	while(//의 정수값이 1일때) {
					System.out.println("단어 입력 (종료: -1) : ");
					tmp = scan.nextLine();
					//단어 입력
					if(tmp.equals("-1")) {
						System.out.println("종료합니다.");
						break;
					}
					if( count == list.length ) {
						System.out.println("단어를 추가하지 못했습니다.");
					}
					else {
						list[count] = tmp;
						count++;
						System.out.println("단어를 추가했습니다.");
					}

				}
			}*/
			
			
		} while()


	}

}
