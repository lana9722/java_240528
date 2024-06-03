package day04.homework;

import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		 /* 1~100사이의 랜덤한 수를 생성하여 해당 숫자를 맞추는 게임을 작성하세요.
         * 예 (랜덤한 수가 30)
         * 정수 입력 : 50
         * DOWN!
         * 정수 입력 : 20
         * UP!
         * 정수 입력 : 25
         * UP!
         * 정수 입력 : 30
         * 정답입니다!
         */
     
     Scanner scan = new Scanner(System.in);
     
      int min = 1, max = 100;
        int random = (int)(Math.random() * (max - min + 1) + min);
        System.out.println(random);
     
        int num ; 
     
     do{  
        System.out.print("정수를 입력하세요 : ");
        num = scan.nextInt();
     
        if(random < num ) {
           System.out.println("Down!");
        }
        else if(random > num ) {
           System.out.println("Up!");
        }
        
        //else if(random == num ) {
           //System.out.println("정답입니다!");
        
     //   }
           }while ( random != num ) ;
        System.out.println( "정답입니다!" );
     }
}
