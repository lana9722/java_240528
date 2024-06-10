package day08;

import java.util.Arrays;

import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
	//정수 입력 ( 배열의 크기)
	System.out.println("배열 크기 입력 : ");
	Scanner scan = new Scanner(System.in);
	int size = scan.nextInt();
	//입력 받은 정수를 이용하여 정수 배열을 생성
	int[] arr = createArray(size);
	System.out.println(Arrays.toString(arr));
	
	int [] arr2 = null;
	createArray2(arr2, size);
	System.out.println(Arrays.toString(arr2));
	}
	/**기능 : 배열의 크기가 주어지면 주어진 배열 크기의 정수 배열을 생성해서 알려주는 메서드
	 * 매개변수 : 배열 크기  => int size
	 * 리턴타입 : 생성된 정수 배열 => int []
	 * 메서드명 : createArray
	 * 
	 */
	public static int[] createArray(int size) {
		if(size < 0) {
			return null;
		}
		int [] arr = new int[size];
		return arr;
		//return new int[szie]; 위에 줄을 이렇게 한줄로 간추려서 사용가능
	}
	//잘못된 예시
	/** 기능 : 배열과 배열의 크기가 주어지면 주어진 배열의 배열 크기의 정수 배열을 생성하는 메서드
	 * 매개변수 : 배열, 배열의 크기 => int []arr, int size
	 * 리턴타입 : 없음 => void
	 * 메서드명 : createArray2
	 * 
	 */
	public static void createArray2(int []arr, int size) {
		//=을 통해 기본형 변수나 참조형 변수를 재할당하면 main에 있는 원본이 바뀌지 않는다.
		arr = new int [size];
	}
}
