package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
           int remainder;

        if (n <= 1) {
            System.out.print(n);
            return; 
        }

        remainder = n % 2;
        System.out.print(remainder);

        if (n < 0) {
            System.out.println("Error: Not a positive integer");
        } 
    else {

            System.out.print("Convert to binary is:");
            toBinary(n);
        }
    }

    return "";
  }
}
