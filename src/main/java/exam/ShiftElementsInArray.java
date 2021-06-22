package exam;
import java.util.*;

public class ShiftElementsInArray {

  public static void shift(int[] arr) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    int temp;
    temp = arr[arr.length-1];
    
    for(int i=arr.length-2;i>=0;i--){
      arr[i+1] = arr[i];
    }
    
    arr[0] = temp;
    
    //printing the array 
    for(int j=0;j<arr.length;j++){
      System.out.print(arr[j] +" ");
    }
  }
  
  public static void main(Strings[] args) {
    int arr[] = {1,2,3,4,5};
    shift(arr);
  }

}
