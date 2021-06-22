package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.public class ListDirectoryRecusive {
   public static void main(String[] args) {
      File dir = new File("d:\\myproject\\test");  // Escape sequence needed for '\'
      listRecursive(dir);
   }
   
   public static void listRecursive(File dir) {
      if (dir.isDirectory()) {
         File[] items = dir.listFiles();
         for (File item : items) {
            System.out.println(item.getAbsoluteFile());
            if (item.isDirectory()) listRecursive(item);  // Recursive call
         }
      }
   }
}
    
    return "";
  }
}
