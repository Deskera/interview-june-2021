package exam;

public class ShiftElementsInArray {

  public void shift(int[] arr) {
 
    //n determine the number of time an array shoulb bo rotated
    int n=3;
    //Display Original Array
    System.outprintIn ("Original Array");
    for(i=0;i<arr.length;i++)
    {
     System.out.print(arr[i] + " " );
  }
  //rotate the given array by n time toward right
    for(i=0;i<n;i++)
    {
      int j,last;
      //store the last element of array by one 
      last = arr[arr.length-1]
        for(j=arr.length-1;j>0;j--)
        {
         //shift element of array by one 
          arr[j] = arr[j-1];
        }
      //last element of array will be added to the start of array
      arr[0] =last;
}
System.out.printIn();
    System.out.printIn("Array after rigth rotation ");
    for(i=0;i<arr.length;i++)
    {
      System.out.print(arr[i] + " ");
    }
  }
}
}
