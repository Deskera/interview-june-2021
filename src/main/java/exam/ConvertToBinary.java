package exam;

public class ConvertToBinary
{
 
  public static void toBinary(int decimal)
  {
    int binary[]=new in[40];
    int index=0;
    while(decimal>0)
    {
      binary[index++]=decimal%2;
      decimal=decimal/2;
    }
    for(int i=index-1;i>=0;i--)
    {
      system.out.print(binary[i]);
    }
    system.out.print();
  }
  public static void main(string args[])
  {
    system.out.println("Decimal of 35 is:");
    tobinary(35);
     system.out.println("Decimal of 32 is:");
    tobinary(32);
     system.out.println("Decimal of 21 is:");
    tobinary(21);
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    
  }
}
