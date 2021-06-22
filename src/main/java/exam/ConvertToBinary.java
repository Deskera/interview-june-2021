package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    String x = "";
        while(n > 0)
        {
            int a = n % 2;
            x = a + x;
            n = n / 2;
        }
    return x;
    return "";
  }
}
