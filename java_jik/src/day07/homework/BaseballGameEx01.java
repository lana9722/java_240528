package day07.homework;

import java.util.Arrays;
import java.util.Scanner;

public class BaseballGameEx01 {

	public static void main(String[] args) {


		int [] list = new int[3];
		int count = 0; //저장된 숫자의 개수
		int min = 1, max = 9;
		int random, i;

		while(count < 3) {
			//랜덤한 수를 생성하여 변수에 저장
			random = (int)(Math.random() * (max - min + 1) + min);
			//배열에 랜덤한 수가 있는지 확인
			/* 반복횟수 : i는 0부터 저장된 개수보다 작을 때까지 1씩 증가
			 * 규칙성 : i번지에 있는 값과 랜덤한 수가 같으면 반복문을 종료
			 * 반복문 종료 후 : 없음
			 * */
			for(i = 0; i < count; i++) {
				if(list[i] == random) {
					break;//break를 만나면 i는 count보다 작을수밖에 없음
				}
			}
			//없으면 배열에 추가한 후 저장된 개수를 1증가
			//=> i와 count가 같다면 배열 ?번지에 랜덤한 수를 저장한 후 저장된 개수를 1증가
			if(i == count) {
				list[count] = random;
				count++;
			}
		}
		System.out.println(Arrays.toString(list));

		Scanner scan = new Scanner(System.in);

		int [] user = new int [3];

		int s = 0, b = 0;


		//반복문을 이용하여 정수 3개를 입력 받은 후 판별(다 맞출때까지)
		do {
			s = 0;
			b = 0;
			//입력 안내문구 출력
			System.out.println("입력 : ");
			//3개를 입력
			for(int k = 0 ; k < user.length; k ++) {
				user[k] = scan.nextInt();
			}
			//		user[0] = scan.nextInt();
			//		user[1] = scan.nextInt();
			//		user[2] = scan.nextInt();

			//결과 판별 후 출력
			for(i = 0; i < list.length; i++) {
				for(int j = 0; j < user.length; j++) {
					if(list[i] == user[j]) {
						if( i == j) {
							s++;
						}else {
							b++;
						}
					}
				}
			}
			//첫번째 배열이 입력 문구와 비교하는 코드
			//			for(int j =0; j< user.length; j++) {
			//				if(list[0] == user[j]) {
			//					if(0 == j) {
			//						s++;
			//					}else {
			//						b++;
			//					}
			//				}
			//			} // 똑같이 밑에 3번을 써서 리스트[0]값만 배열 [1],[2]로 바꿔씀

			//위치가 같으면 스트라이크의 개수를 다르면 볼의 개수를 증가
			//		if(list[0] == user[0]) {
			//			if( 0 == 0) {
			//				s++;
			//			}else {
			//				b++;
			//			}
			//		}
			//		
			//
			//		//첫번째 랜덤수와 첫번째 입력값이 같으면 스트라이크 또는 볼로 판별
			//		if(list[0] == user[1]) {
			//			if( 0 == 1) {
			//				s++;
			//			}else {
			//				b++;
			//			}
			//		}
			//		//첫번째 랜덤수와 두번째 입력값이 같으면 스트라이크 또는 볼로 판별
			//		if(list[0] == user[2]) {
			//			if( 0 == 2) {
			//				s++;
			//			}else {
			//				b++;
			//			}
			//		}
			//		//첫번째 랜덤수와 세번째 입력값이 같으면 스트라이크 또는 볼로 판별
			//		if(list[1] == user[0]) {
			//			if( 1 == 0) {
			//				s++;
			//			}else {
			//				b++;
			//			}
			//		}
			//		//두번째 랜덤수와 첫번째 입력값이 같으면 스트라이크 또는 볼로 판별
			//		if(list[1] == user[1]) {
			//			if( 1 == 1) {
			//				s++;
			//			}else {
			//				b++;
			//			}
			//		}
			//		//두번째 랜덤수와 두번째 입력값이 같으면 스트라이크 또는 볼로 판별
			//		if(list[1] == user[2]) {
			//			if( 1 == 2) {
			//				s++;
			//			}else {
			//				b++;
			//			}
			//		}
			//		//두번째 랜덤수와 세번째 입력값이 같으면 스트라이크 또는 볼로 판별
			//		if(list[2] == user[0]) {
			//			if( 2 == 0) {
			//				s++;
			//			}else {
			//				b++;
			//			}
			//		}
			//		//세번째 랜덤수와 첫번째 입력값이 같으면 스트라이크 또는 볼로 판별
			//		if(list[2] == user[1]) {
			//			if( 2 == 1) {
			//				s++;
			//			}else {
			//				b++;
			//			}
			//		}
			//		//세번째 랜덤수와 두번째 입력값이 같으면 스트라이크 또는 볼로 판별
			//		if(list[2] == user[2]) {
			//			if( 2 == 2) {
			//				s++;
			//			}else {
			//				b++;
			//			}
			//		}
			//세번째 랜덤수와 세번째 입력값이 같으면 스트라이크 또는 볼로 판별

			//스트라이크와 볼의 개수를 이용하여 결과를 출력
			if( s != 0 ) {
				System.out.print(s+"S");
			}
			if( b != 0) {
				System.out.println(b+"B");
			}
			if( s == 0 && b == 0) {
				System.out.println("Out");
			}
			System.out.println();
		}while(s != 3);
	}
}


