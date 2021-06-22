package exam;

  public class ConvertToBinary {
    static void toBinary(int num)
    {
        int[] binaryNum = new int[67];
        int i = 0;
        while (num > 0) {
            binaryNum[i] = num % 2;
            num = num / 2;
            i++;
        }

        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
        public static void main(String[] args)
        {
          int num = 67;
          toBinary(num);
        }
}
