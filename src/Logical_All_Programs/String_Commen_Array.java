package Logical_All_Programs;

import java.util.Arrays;

public class String_Commen_Array {

	public static void main(String[] args) {
		
		String str[]= {"Anam","amir","Kajol","Pariniti"};
		
		String str1[]= {"Mahesh","Sharukh","Kajol","Parin"};
		
		int len=str.length;
		int len1=str1.length;
		
		
		for(int i=0;i<len;i++) {
			
			for(int j=0;j<len1;j++) {
				
				if(str[i]==str1[j]) {
					System.out.println(str1[j]);
				}
					
			}
		}
				
	}

}
