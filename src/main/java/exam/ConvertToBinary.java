package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    int[] a= new int[1000];
    int b=0;
    while(n>0)
    {
     a[b]= n%2;
     n=n/2;
     b++;
    }
    for(int i= b-1; i>=0; i--)
    {
     System.out.print(a[i]);
    }
    
    return "";
  }
}
