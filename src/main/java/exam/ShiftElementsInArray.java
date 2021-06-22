package exam;
import java.util.*;

public class ShiftElementsInArray {

  public void shift(int[] arr) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    	Scanner sc = new Scanner(System.in);
		
	        int i,n,temp;
		
		System.out.println("Enter the number of elements:") ;
 		n = sc.nextInt();
		int[] a = new int[n];
 
    		System.out.println("Enter the elements") ;
    		for(i=0;i<n;i++)
    		{ 
        		a[i] = sc.nextInt();
    		}
		
	    	System.out.println("Original array");
    		for(i=0;i<n;i++)
    		{
        		System.out.print(a[i]+" ");
    		}
 
    	
    		temp=a[n-1];
    		for(i=n-1;i>0;i--)
    		{
       	 		a[i]=a[i-1];
    		}
    		a[0]=temp;
 
    		System.out.println("\nNew array after rotating by one postion in the right direction");
    		for(i=0;i<n;i++)
    		{
       	 		System.out.print(a[i]+" ");
    		}

  }

}


