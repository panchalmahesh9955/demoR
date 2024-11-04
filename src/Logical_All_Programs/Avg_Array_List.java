package Logical_All_Programs;

public class Avg_Array_List {

	public static void main(String[] args) {

        int arr[]= {1,2,3,4,5};
        
        int len=arr.length;
        
        int sum=0;
        
        for (int i=0;i<len;i++) {
        	
        	sum=sum+arr[i];
        }
         int avg=sum/len;
         
         System.out.println(avg);
	}

}
