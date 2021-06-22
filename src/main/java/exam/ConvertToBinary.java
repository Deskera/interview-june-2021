package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    int d=n;
    string str="";
    for(int i=0;i++){
      str +=d%2;
      d=d/2;
    }
    string b="";
    for(int i=str.lenght()-1;i>=0;i--)
      b+=str.charAt(i);
    return b;
  }
}
