package day03;

public class IfEx03 {

	public static void main(String[] args) {
		//else if 예제
		int num = 3;
		//num3가 0이면 0이라고 출력하고 
		//num3가 0이 아니고 양수이면 양수라고 출력하고
		//num가 0과 양수가 아니면 음수라고 출력하는
		
		
		//num3가 0이면 0이라고 출력하고 
		if(num == 0) {
			System.out.println(0);
			//num3가 0이 아니고 양수이면 양수라고 출력하고
		//}else if(num가 양수이다) {
			System.out.println(num + "는 양수");
		}
		//num가 0과 양수가 아니면 음수라고 출력하는
		else {
			System.out.println(num + "는 음수");
		}
		
	}

}
