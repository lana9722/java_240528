package day07;

import java.util.Arrays;

import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		/*3명의 학생의 국어, 영어, 수학 성적을 입력받고
		 * 각 학생의 평균을 구하는 코드를 작성하세요.
		 * 학생1의 성적을 입력하세요 (국어, 영어 , 수학 순) : 100 90 80
		 * 학생2의 성적을 입력하세요 (국어, 영어 , 수학 순) : 100 100 100
		 * 학생2의 성적을 입력하세요 (국어, 영어 , 수학 순) : 81 80 80
		 * 학생1의 평균 : 90
		 * 학생2의 평균 : 100
		 * 학생3의 평균 : 80.333
		 */
		Scanner scan = new Scanner(System.in);

		int []  kor, eng, math;
		int studentCount = 3; 
		kor = new int[studentCount];
		eng = new int[studentCount];
		math = new int[studentCount];

		for(int i = 0; i < studentCount ; i++ ) {
			System.out.println("학생" + (i+1) + "의 성적을 입력하세요(국어 , 영어 , 수학 순 ): ");
			//국어, 영어, 수학 점수를 입력
			//a = 국어
			kor[i] = scan.nextInt();
			//b = 영어
			eng[i] = scan.nextInt();
			//c = 수학
			math[i] = scan.nextInt();
			//kor + eng + math / 3 = StudentCount[i] "평균 점수"

		}
		int sum;
		double avg;
		//각 학생의 평균을 구하기
		sum = kor[0] + eng[0] + math[0] ;
		avg = sum/3.0;
		System.out.println("학생1의 평균 : " + avg);

		sum = kor[1] + eng[1] + math[1] ;
		avg = sum/3.0;
		System.out.println("학생2의 평균 : " + avg);

		sum = kor[2] + eng[2] + math[2] ;
		avg = sum/3.0;
		System.out.println("학생3의 평균 : " + avg);


		//for(int i = 0; i < studentCount ; i++ ) {
		//	sum = kor[i] + eng[i] + math[i] ;
		//	avg = sum/3.0;
		//	System.out.println("학생" + (i+1) + "의 평균 : " + avg);

		/*각 과목의 평균을 구하는 코드를 작성하세요
		 * 국어 평균 : 93.6666
		 * 영어 평균 : 90
		 * 수학 평균 : 86.6666
		 */
		int sum2, sum3, sum4;		//배열로 사용해서 int와 double 선언을 
		double avg2, avg3, avg4;	//깔끔하게

		//kor 평균
		sum2 = kor[0] + kor[1] + kor[2];		//반복문을 사용하여 간략하게
		avg2 = sum2 / 3.0;
		System.out.println( "kor 총 평균은" + avg2 );

		sum3 = eng[0] + eng[1] + eng[2];
		avg3 = sum3 / 3.0;
		System.out.println( "eng 총 평균은" + avg3 );

		sum4 = math[0] + math[1] + math[2];
		avg4 = sum4 / 3.0;
		System.out.println( "math 총 평균은" + avg4 );

		/* sum = 0;
		 * for(int i = 0; i < kor.length; i++) {
		 * sum = sum + kor[i]; // sum += kor[i];
		 * }
		 * avg = sum / (double) kor. length;
		 * System.out.println("국어 평균 : " + avg);
		 */









	}

}

