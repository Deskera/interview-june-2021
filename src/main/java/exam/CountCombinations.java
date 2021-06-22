import java.io.*;
 
class GFG
{
    
static void findCombinationsUtil(int arr[], int index,
                                 int num, int reducedNum)
{
    // Base condition
    if (reducedNum < 0)
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
 
    // find all combinations
    findCombinationsUtil(arr, 0, n, n);
}
 
// Driver code
public static void main (String[] args)
{
    int n = 5;
    findCombinations(n);
}
}
