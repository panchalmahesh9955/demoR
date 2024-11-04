package Logical_All_Programs;

import java.util.Arrays;

public class sorrt_Array {

	public static void main(String[] args) {
	
		int arr[]= {1,3,2,5,1};
		
		String str []= {"Amit","Mahesh","Asma","Krutika","Rutaja"};
	
		
		int len=arr.length;
		Arrays.sort(arr);
		for(int i=0;i<len;i++) {
			
			System.out.println(" "+arr[i]);
		}
		
		Arrays.sort(str);
		for(int i=0;i<len;i++) {
			
			System.out.println(" "+str[i]);}
	}

}
