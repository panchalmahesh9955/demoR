package Logical_All_Programs;

import java.util.Arrays;

public class Iterate_Array {

	public static void main(String[] args) {
		
		
		int arr[]= {5,2,3,1,4};
		
		int len=arr.length;
		
		Arrays.sort(arr);
		for(int i=0;i<len;i++) {
			
			System.out.println(arr[i]);
		}

	}

}
