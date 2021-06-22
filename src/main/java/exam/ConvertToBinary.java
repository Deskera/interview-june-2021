package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    if(n<0){
     System.out.println("Throws an exception");
  }
     int binary[] = new int[50];
    int index = 0;
    else{
      while(n>0){
     binary[index++] = n%2;
      n = n/2;
    }
    for(int i=index-1;i>=0;i--){
         System.out.print(binary[i]);
    }
        System.out.println();
    return "";
  }
  }
  
  
  public static void main(String[] args){
      toBinary(int 35);
    return "";
  }
}
