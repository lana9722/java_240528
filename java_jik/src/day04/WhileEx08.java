package day04;

public class WhileEx08 {

	public static void main(String[] args) {
		/* 두 정수 8과 12의 최대 공약수를 구하는 코드를 작성
		 * 약수 : 나누어서 떨어지는 수
		 * 공약수 : 공통으로 있는 약수
		 * 최대 공약수 : 공약수중 가장 큰 공약수
		 * 
		 */
		
		int gcd = 1;
		int i = 1;
		int num1 = 8, num2 = 12;
		
		while( i <= num1 ) { // 
			if( num1 % i == 0 && num2 % i == 0) { //
				gcd = i; // 
			}
			
			
			if(num1 % i == 0) { //
				if(num2 % i == 0) {  //
					gcd = i; //
				}
			}
			
			i++; //
		}
		System.out.println(num1 + "과" + num2 + "의 최대 공약수 : " + gcd);
		
		
	}

}
