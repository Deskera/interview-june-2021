package exam;

public class CountCombinations {

  public int getNumberOfWays(final int total, final int k) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    f (reducedNum < 0)
        return;
 
    // If combination is
    // found, print it
    if (reducedNum == 0)
    {
        for (int i = 0; i < index; i++)
                System.out.print (arr[i] + " ");
            System.out.println();
        return;
    }
 
    // Find the previous number
    // stored in arr[]. It helps
    // in maintaining increasing
    // order
    int prev = (index == 0) ?
                          1 : arr[index - 1];
 
    // note loop starts from
    // previous number i.e. at
    // array location index - 1
    for (int k = prev; k <= num ; k++)
    {
        // next element of
        // array is k
        arr[index] = k;
 
        // call recursively with
        // reduced number
        findCombinationsUtil(arr, index + 1, num,
                                 reducedNum - k);
    }
}
 
/* Function to find out all
combinations of positive
numbers that add upto given
number. It uses findCombinationsUtil() */
static void findCombinations(int n)
{
    // array to store the combinations
    // It can contain max n elements
    int arr[] = new int [n];
 
    // find all combinations
    findCombinationsUtil(arr, 0, n, n);
}
 
// Driver code
public static void main (String[] args)
{
    int n = 5;
    findCombinations(n);
}
    return 0;
  }

}
