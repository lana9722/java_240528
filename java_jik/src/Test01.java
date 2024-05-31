
public class Test01 {

	public static void main(String[] args) {

		int num = 4;   // 소수인지 확인하고 싶은 숫자 = num
		int i, count;    // i는 for문에서 쓰기위해서!!, Count는 소수 구별 하기위해 필요!

		// 소수 구별하는방법!
		// 소수란 1외에 다른정수로 나눠지지 않는걸 말함!
		// 예를들어, 3은 소수인데 3은 나눳을때 1, 3만 나머지가 0이나옴!
		// 4는 1,2,4 로 나눠져서 소수가아님!!!
		// 소수 구별법!! -> 1부터 num까지 숫자를 전부 나눠보고 나머지가 0이 나오는 숫자(count)가 2개(1, 자기자신) 이 나오면 소수!


		for(i=1, count=0; i <= num; i++){
		   if(num % i == 0) {
		      count++;
		   }
		}
		// 요기 포문이 1부터 num 까지의 숫자를 num에다가 나눠보고 나눠서 0이 나온 갯수를 새기 위해 잇는부분!

		if(count ==2){
		   System.out.println(num +"는 소수");
		}
		else {
		   System.out.println(num + "는 소수가 아님");
		}
		//위에 소수구별법에 따라 count가 2가 나오면 소수! 그이상 나오면 소수가 아닌거임!

		////말한대로 2부터 100까지 전부 해볼라면?
		////위에 코드가 숫자 4가 소수인지 아닌지 확인하는 코드엿으니
		//// 위 코드를 2부터 100까지 다 돌려보면 되겟지!!


		int max_num = 100;   
		int start_num = 2;
		int j;    

		for(j=start_num; j <= max_num; j++){

		   for(i=1, count=0; i <= j; i++){
		      if(j % i == 0) {
		         count++;
		      }
		   }

		   if(count ==2){
		      System.out.println(j +"는 소수");
		   }
		   else {
		      System.out.println(j + "는 소수가 아님");
		   }

		
		}
	}

}
