package exam;

public class ShiftElementsInArray {

  
  public void shift(int[] arr) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    {
      static int arr[] = new int []{1,2,3,4,5};
       int x = arr[arr.length-1], i;
       for (i = arr.length-1; i > 0; i--)
          arr[i] = arr[i-1];
       arr[0] = x;
    }
     

    public static void main(String[] args)
    {
        System.out.println("Given Array is");
        System.out.println(Arrays.toString(arr));
         
        shift();
         
        System.out.println("Rotated Array is");
        System.out.println(Arrays.toString(arr));
    }
  }

}
