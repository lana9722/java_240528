package day08;

public class MethodEx01 {

	public static void main(String[] args) {

		int list [] = new int [100];
		
		for(int i = 0; i < list.length; i++) {
			
			System.out.println(list[i]);
		}
		
		
				for(int num = 1 ; num <= 100; num++ ) {
					System.out.println(num);
				}
					
					

				

		//num가 소수인지 판별하는 코드
		int num = 100;

		boolean result = isPrime(num);

		if(result) {
			System.out.println(num + "는 소수");
		}
		else {
			System.out.println(num + "는 소수 아님");
		}
		//100이하의 소수를 출력하는 코드를 작성하세요. isPrime을 이용하여


		//		
		//		boolean result;
		//		int num = 10;
		//		int num2 = 10;
		//		int num3= ;
		//		
		//		if (num != num2 ) {
		//		System.out.println( result );
		//		}


		/* 주어진 num3가 소수인지 아닌지 판별하는 코드를 작성하세요.
		 * 단, 메서드를 이용해서
		 * 
		 */
		/*public static 리턴타입 메서드명(매개변수들) {

		}*/
	}



	/**주어진 정수가 소수인지 아닌지 알려주는 메서드
	 * 매개변수 : 정수 => int num
	 * 리턴타입 : 소수인지 아닌지 => 맞다 틀리다 => boolean
	 * 메서드명 : isPrime
	 * 
	 * 
	 */

	public static boolean isPrime ( int num ) {

		int count = 0;
		for(int i = 1; i <= num; i++) {
			if(num % i ==0) {
				count++;
			}
		}

		//return count == 2 ? true : false;
		if(count == 2) {
			return true;
		}
		else {
			return false;
		} 
		/**
		boolean result;
		if(count == 2) {
			result = true;
		}
		else {
			result = true;
		}
		return result;*/


		/*int sum =  num % num2 ;

		return false;*/
	}

}
