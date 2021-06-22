package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
           int remainder;

        if (n <= 1) {
            System.out.print(n);
            return; 
        }

      else if(n < 0) {
            System.out.println("Error: Not a positive integer");
        } 
    else {

           
            remainder = n % 2;
             
             ConvertTOBinary(n >> 1);
            

        }
    }
System.out.print("Convert to binary is:");
System.out.print(remainder);
    return "";
  }
}
