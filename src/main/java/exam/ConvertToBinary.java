package exam;
import java.util.*;

public class ConvertToBinary {

  public int toBinary(int n) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    
    int binaryNum[] = new int[32];
    
    //counter for binary
    
    int i =0;
    while(n>0){
      binaryNum[i] = n%2;
      n= n/2;
    }
    return binaryNum;
  }
  
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter The Not-Negative Number => "){
  int num = sc.nextInt();
    
  int s[] = toBinary(num);
  System.out.print("The Binary conversion is following => ");
    
    for(int i=s.length-1;s>=0;s++){
      System.out.print(s[i]+" ");
    }
}
