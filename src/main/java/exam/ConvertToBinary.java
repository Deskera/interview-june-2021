package exam;

public class ConvertToBinary {
 public String toBinary(final int n) {
    String s=" ";
     while(n>0)
        {
            int y=n%2;
            s=s+y;
            n=n/2;
     }
  
 
    try{
        if(n<0){
        throw new NumberFormatException();
        }
        }catch(NumberFormatException e){
            System.out.println("Number less than 0");
        }
 
    
    return s;
  }
}
