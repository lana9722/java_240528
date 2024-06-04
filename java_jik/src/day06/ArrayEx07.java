package day06;

import java.util.Scanner;

public class ArrayEx07 {

	public static void main(String[] args) {
		/*
		 * UpDown 게임에 다음 기능을 추가하세요. 메뉴 1. 플레이 2. 기록확인 3. 메뉴 선택 : 1 (랜덤이 35라고 가정) 정수 입력 :
		 * 50 Down! 정수 입력 : 30 Up! 정수 입력 : 35 정답입니다. 맞힌 횟수는 3회입니다. 메뉴 1. 플레이 2. 기록확인 3.
		 * 종료 메뉴 선택 : 2 기록확인 1. 3회 메뉴 1. 플레이 2. 기록확인 3. 종료 메뉴 선택 : 3 프로그램을 종료합니다.
		 */
		/*
		 * 1~100사이의 랜덤한 수를 생성하여 해당 숫자를 맞추는 게임을 작성하세요. 예 (랜덤한 수가 30) 정수 입력 : 50 DOWN! 정수
		 * 입력 : 20 UP! 정수 입력 : 25 UP! 정수 입력 : 30 정답입니다!
		 */

		Scanner scan = new Scanner(System.in);
		//변수 선언
		int [] record = new int[5];
		int menu = scan.nextInt();
	
		
		// 선택한 메뉴가 3이 아닐때 실행되는 반복문
		do {
			// 메뉴 출력
			System.out.println("메뉴");
			System.out.println("1. 플레이");
			System.out.println("2. 기록확인");
			System.out.println("3. 종료");
			System.out.println("메뉴 선택 : ");
			// Scanner를 이용하여 메뉴를 입력
			// 선택한 메뉴에 따른 기능 실행
			switch (menu) {
			// 선택한 메뉴가 1이면 플레이 문구 출력하는 코드 작성
			case 1:
				// 1~100사이의 랜덤한 수를 생성
				int min = 1, max = 100;
				int random = (int) (Math.random() * (max - min + 1) + min);
				System.out.println(random);
				// 입력한 값이 랜덤한 수와 같지 않으면 반복
				for (int Count = 0; menu != random; Count++) {
					menu = scan.nextInt();
					// 정수 입력 : 안내문구 출력
					System.out.println("숫자를 입력하세요 : ");
					// Scanner를 이용하여 정수를 입력
					menu = scan.nextInt();
					// 입력한 횟수를 증가
					System.out.println("입력한 횟수" + Count);
					// 입력한 값이 랜덤한 값보다 크면 Down이라고 출력하고
					if (menu < random) {
						System.out.println("Down");
					}
					// 입력한 값이 랜덤한 값보다 작으면 Up이라고 출력하고
					else if (menu > random) {
						System.out.println("Up");
					}
					// 같으면 정답입니다를 출력하고 입력한 횟수를 출력
					else if (menu == random) {
						System.out.println("정답입니다.");
					}
				}
			}
		}while(menu != random);
		break;
		
		
		/*기록의 개수가 5개 미만이면
		 * if(recordCount < record.length //5도 가능 ) {
		 * 	 기록을 등록
		 * 	 recordCount번지에 저장하고 recordCount를 1증가
		 * record[recordCount//++ 하면 밑에 증감식 삭제 가능] = count;
		 * recordCount++;
		 * 
		 * 	
		 *아니면 내 기록이 5등보다 좋은 비교해서 좋으면
		 *else if(record[recordCount - 1] > count){
		 *	 기록을 등록
		 *	 마지막번지에 내 기록을 등록
		 *record[recordCount - 1] = count;
		 *}
		 *
		 * 기록 정렬 
		 * Arrays.sort를 이용하여 0번지부터 recordCount번지전까지 정렬
		 * 0번지는 포함, recordCount번지는 포함을 안하고 앞 번지까지
		 * Arrays.sort(record, 0 , recordCount);
		 * System.out.println(Arrays.toString(record));
		 * break;
		 */
		
		//선택한 메뉴가 2이면 기록 확인 문구 출력하는 코드 작성
		/*case 2:
		 * 		if(recordCount == 0) {
		 * 		System.out.println("등록된 기록이 없습니다.");
		 * 		break;
		 */
			/* record에 있는 기록들을 recordCount개 만큼 순서대로 출력
			 * 반복횟수 : i는 0부터 recordCount보다 작을 때 까지 1씩 증가
			 * 규칙성 : i + 1. 횟수를 출력
			 * 반복문 종료 후 : 없음
			 * for( i = 0; i < recordCount; i++){
			 * 		System.out.println(i+1 + "." + record[i] + "회");
			 * }
			 *
			 * 
			 *
			
			break; */
		
	}
}
