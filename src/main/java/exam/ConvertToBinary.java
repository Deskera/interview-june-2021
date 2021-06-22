package exam;

  public class ConvertToBinary {
     //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    static void toBinary(int n)
    {
  
        int[] binaryNum = new int[35];
 
        
        int i = 0;
        while (n > 0) {
            
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
 
        
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
        public static void main(String[] args)
    {
        int n = 35;
        toBinary(n);
    }
}
