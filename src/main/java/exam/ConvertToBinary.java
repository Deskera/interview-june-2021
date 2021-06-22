package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    int d = n;
    String str = "";
    for(int i=0;d>0;i++){
        str += d%2;
        d=d/2;
    }
    String b = "";
    for(int i=str.length()-1;i>=0;i--)
        b += str.charAt(i);
    return b;
    
  }
}
