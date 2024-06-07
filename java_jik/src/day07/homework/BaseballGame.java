package day07.homework;

import java.util.Arrays;
import java.util.Scanner;

public class BaseballGame {

	public static void main(String[] args) {  
		/*숫자 야구 게임을 구현하세요.
	       * 규칙
	       * - 중복되지 않은 1~9사이의 랜덤한 수를 생성
	       * - 스트라이트 : 해당 숫자가 있고, 위치도 같은 경우
	       * - 볼 : 숫자가 있지만 위치가 다른 경우
	       * - 아웃 : 일치하는 숫자가 하나도 없는 경우
	       * 예시
	       * ( 3 9 7 )
	       * 입력 : 1 2 3
	       * 1B
	       * 입력 : 5 6 7
	       * 1S
	       * 입력 : 4 5 6
	       * Out
	       * 입력 : 3 7 9
	       * 1S2B
	       * 입력 : 3 9 7
	       * 3S
	       * 정답입니다.
	       */
	      Scanner scan = new Scanner(System.in);

	      int S = 0;
	      int B = 0;

	      int [] list2 = new int[3];

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

	      //   while(true) {
	      for( int j = 0; j < list2.length; j ++ ) {
	         //입력 문구 출력
	         System.out.println("입력 : ");
	         //list2값 입력 스캐너
	         list2[j] = scan.nextInt();

	      }
	      /*while(true){
	       *   for (int k = 0; k < list.length; k++) {

	            for (int l = 0; l < list2.length; l++) {
	                if (list[k] == list[l]){
	                    if (k == l) S++;
	                    else B++;
	                }

	            }
	        }

	        if (S == 3) {
	            System.out.println("정답입니다.");
	        } else if (S == 0 && B == 0) {
	            System.out.println("아웃입니다.");
	        } else {
	            if (S > 0) System.out.print(S + "S");
	            if (B > 0) System.out.print(B + "B");
	        }
	        }
	       */
	      //S값
	      if(list[0] == list2[0]) 
	         S++;
	      if(list[1] == list2[1])
	         S++;
	      if(list[2] == list2[2])
	         S++;
	      if( S > 1) {
	         System.out.print(S + "S");
	      }
	      if( 3 == S ) {
	         System.out.println("정답입니다.");
	      }
	      //if( 3 == S ) 
	      //else if ( 
	      //System.out.print("정답입니다");
	      // S < 3 
	      // System.out.print(S + "S");


	      if(list[0] == list2[1] || list[0] == list2[2])
	         B++;
	      if(list[1] == list2[0] || list[1] == list2[2])
	         B++;
	      if(list[2] == list2[0] || list[2] == list2[1])
	         B++;
	      if( B > 1 ) {
	         System.out.print(B + "B");
	      }
	      if ( S == 0 && B == 0 ) {
	         System.out.println("아웃입니다.");
	      }
	   }

	}
	//}
	/* if(list[0] == list2[0]) {
	   S += 1;
	   if(list[1] == list2[1]) {
	      S += 1;
	      if(list[2] == list2[2]) {
	         S += 1; */


	//list[0]값 == list2[0]값 이라면 S//int Strike = 0; ++ 1; if(Strike == 3){출력 정답입니다.} break;
	//list[1]값 == list2[1]값 이라면 S
	//list[2]값 == list2[2]값 이라면 S
	//list[0],[1],[2] == list2[0],[1],[2]값 이라면 정답입니다.

	//list[0]값 == list[1],[2]값 이라면 B
	//list[1]값 == list[0],[2]값 이라면 B
	//list[2]값 == list[0],[1]값 이라면 B

	//스캐너 입력 문구 출력을 3S 정답입니다. 까지 출력
	//else out
