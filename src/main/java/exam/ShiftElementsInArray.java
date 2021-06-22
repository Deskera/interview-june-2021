package exam;
import java.util.*;
public class ShiftElementsInArray {

  public void shift(int[] arr){
    arr= new int]{1,2,3,4,5};
    int n = 3;

    System.out.println("array");
    for(int i = 0;i < arr.length;i++)
    {
      System.out.print(arr[i] + "");
   }

    for(int i = 0;i<n;i++)
    {
      int j,l;
      l= arr[arr.length-1];

      for(j = arr.length-1;j>0;j--)
      {
         arr[j] = arr[j-1];
      }
      arr[0] = l;
    }
    System.out.println();

    System.out.println("right rotation");
    for(int i = 0;i<arr.length;i++)
    {
      System.out.print(arr[i]+ " ");
    }
}
}




