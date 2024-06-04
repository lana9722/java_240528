package day06;

import java.util.Scanner;

public class ArrayEx06 {

	public static void main(String[] args) {
		/* 4과목의 성적을 입력받아 배열에 저장하고, 과락이 없고 평균이 60점이 넘으면 Pass,아니면 Fail이라고 출력
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);

		int score [] = new int[4];
		
		
		System.out.println("4과목의 성적을 입력하세요( 예 : 10 20 30 40) : ");
		for(int i = 0; i < score.length; i++) {
			score[i] = scan.nextInt();
		}
		/*입력받은 성적의 총합을 계산
		 * 반복횟수 : 향상된 for문을 이용하여 전체 탐색
		 * 실행문 : 배열에서 가져온 값을 sum에 누적
		 * 반복 종료 후 : 없음
		 */
		
		int sum = 0 ;
		for(int tmp : score) {
			sum += tmp;
		}
		
		//총합을 이용하여 평균을 계산
		double avg = sum / (double)score.length;
		
		/*과락여부를 확인하여 변수에 저장
		 * 반복횟수 : 향상된 for문을 이용하여 전체 탐색
		 *실행문 : 배열에서 가져온 값이 40보다 작으면 과락 변수를 true로 변경
		 *반복 종료 후 없음
		 */
		boolean isFail = false;
		for(int tmp : score) {
			if(tmp < 40) {
				isFail = true;
				break;//break 없어도 결과는 같지만, 조금이라도 덜 비교하기 위해 쓰는 게 좋음
			}
		}
		//과락이 아니고 평균이 60이상이면 Pass,
		if( !isFail && avg >= 60) {
			System.out.println("Pass");
		}
		//아니면 Fail
		else {
			System.out.println("Fail");
		}
	}
}	

		/*
		
		
		for(int i = 0; i < score.length; i++ ) {
			System.out.println("과목" + (i+1) +"의 성적 : ");
			int score1, score2, score3, score4 = scan.nextInt();
	    	 
		  int sum = 0;
			  System.out.println("과목" + (i+1) +"의 성적 : ");
	    	  int  num = scan.nextInt();
	    	  score[i] = num;
	    	  i++ ;
	    	  
	    		//sum값에 스코어1,2,3,4, 대입
			 sum += score1 + score2 + score3 + score4;
			//sum값 / 4 후에 출력
				System.out.println( sum / 4 );
			 	  //출력값 < 60 일시 fail
		    	/*  if(sum < 60) {
						System.out.println("Pass");
					}
					else if(sum > 60) {
						System.out.println("Fail");
					}
					
					*/
	
		  }
		
	}

