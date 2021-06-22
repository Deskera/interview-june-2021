package exam;

public class CountCombinations {

  public int getNumberOfWays(final int total, final int k) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    if (n == 1)
{
    return 1;
}
r
if (n == 2)
{
return 2;
}
else
{
return ways(n - 1) + ways(n - 2);
}
    return 0;
  }
  public static void main (String[] args)
{
int n = 5;

System.out.println("Number of ways = " + ways(n));
}

}
