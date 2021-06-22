package exam;

public class ShiftElementsInArray {

  public void shift(int[] arr) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.

     int l = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) 
        {
            arr[i + 1] = arr[i];
        }

        arr[0] = l;
       }
public static void rightRotate(int[] arr, int k)
    {
        for (int i = 0; i < k; i++) 
         {
            shift(arr);
        }
    }

    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, 4, 5 };
        int a = 1;

        rightRotate(arr, a);

        System.out.println(Arrays.toString(arr));
    
  }

}
