package exam;

public class ShiftElementsInArray {

  public void shift(int[] arr) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
     int n=1;
    for(int i=0;i<n;i++)
    {
      int last=arr[arr.length-1];
      for(int j=arr.length-1;j>0;j--)
      {
        arr[j]=arr[j-1];
      } 
      arr[0]=last;
    }
    for(int i=0;i<arr.length;i++)
    {System.out.println(arr[i]);}
  }
  public static void main (String[] args)
  {
    int[] arry= new int[] {1,2,3,4,5};
    //int n=1;
    for(int i=0; i<arry.length; i++)
    {
      System.out.println(arry[i]);
    }
    shift(arry);
  }

}
