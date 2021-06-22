package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
  
  

    
    
        // Creating and assigning binary array size
        int[] binary = new int[35];
        int id = 0;
  
        // Number should be positive
        while (n > 0) {
            binary[id++] = n % 2;
            n = n / 2;
        }
  
        
    
  
    

    return "Arrays.toString(binary)";
  }
}
