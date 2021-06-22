package exam;
import java.io.*;

public class ConvertToBinary {
   static void decToBinary(int n)
	    {

	 int[] binaryNum = new int[35];
	  int i = 0;
     int num =0;
     
     if(num<0){
       System.out.println("number is negative");
     }
	        while (n > 0) {
	   
	            binaryNum[i] = n % 2;
	            n = n / 2;
	            i++;
	        }
	  
	        for (int j = i - 1; j >= 0; j--) {
	            System.out.print(binaryNum[j]);
	            }
   }

  public String toBinary(final int n) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
        int n = 35;
        decToBinary(n);
    }
  //  return "";
}
