package exam;

public class CountCombinations {

  public int getNumberOfWays(final int total, final int k) {
    int arr[] = new int[k];
    for(int i=0;i<k;i++)
        arr[i] = i+1;
    int count[] = new int[k + 1];
    count[0] = 1;
    for (int i = 1; i <= k; i++)
        for (int j = 0; j < arr.length; j++)
            if (i >= arr[j])
                count[i] += count[i - arr[j]];
    return count[k];
    return 0;
  }

}
