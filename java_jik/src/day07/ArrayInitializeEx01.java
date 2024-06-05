package day07;

import java.util.Arrays;

import javax.sql.rowset.serial.SQLOutputImpl;

public class ArrayInitializeEx01 {

	public static void main(String[] args) {
		int [] arr1 = new int[] {1,2,3,4,5};
		
		System.out.println(Arrays.toString(arr1));
				
		arr1 = new int[] {5,4,3,2,1};
		
		System.out.println(Arrays.toString(arr1));
		
		int [] arr2 = {3,4,5,6,7};
		
		System.out.println(Arrays.toString(arr2));
		
		//arr2 = {7,6,5,4,3};//new int는 나중에 바꿔서 선언해도 가능하지만 그냥써서는 불가능.
		
	}

}
