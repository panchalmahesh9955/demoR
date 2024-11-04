package Logical_All_Programs;

public class Duplicates_Array_list {

	public static void main(String[] args) {
	
		int arr[]= {1,2,3,4,5,2,3,6,7};
		
        int len=arr.length;
        
        for (int i=0;i<len;i++) {
        	
        	for(int j=i+1;j<len;j++) {
        		
        		if(arr[i]==arr[j]) 
        			System.out.print(" "+arr[j]);
        		
        	}
        }
}
}