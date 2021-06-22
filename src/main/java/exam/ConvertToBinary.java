package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
   int m;
        String a = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no");
        n = s.nextInt();
        while(n > 0)
        {
            int b = n % 2;
            a = b + a;
            n = n / 2;
        }
        System.out.println(a);
    return "";
  }
}

