package exam;

public class CountCombinations {

  public int getNumberOfWays(final int total, final int k) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
     int [] a = new int[k];
    for(int i=0;i<k;i++)
        a[i] = i+1;
    int [] b = new int[k + 1];
    b[0] = 1;
    for (int i = 1; i <= k; i++)
        for (int j = 0; j < a.length; j++)
            if (i >= a[j])
                b[i] = b[i]+b[i - a[j]];
    int s=b[k];
    return s;
    return 0;
  }

}
