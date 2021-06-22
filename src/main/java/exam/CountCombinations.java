package exam;

public class CountCombinations {

  public int getNumberOfWays(final int total, final int k) {
    if (reducedNum < 0)
        return;
 
   
    if (reducedNum == 0)
    {
        for (int i = 0; i < index; i++)
                System.out.print (arr[i] + " ");
            System.out.println();
        return;
    }
 
    int prev = (index == 0) ?
                          1 : arr[index - 1];
 
    
    for (int k = prev; k <= num ; k++)
    {
        arr[index] = k;
 
      
        findCombinationsUtil(arr, index + 1, num,
                                 reducedNum - k);
    }
}
 

static void findCombinations(int n)
{
    
    int arr[] = new int [n];
 
 
    findCombinationsUtil(arr, 0, n, n);
}
 

public static void main (String[] args)
{
    int n = 5;
    findCombinations(n);
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    return 0;
  }

}
