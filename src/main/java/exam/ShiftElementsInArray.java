package exam;

public class ShiftElementsInArray {

  public void shift(int[] arr) {


    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        int array[] = new int [5];
        int array1[] = new int [5];
        int i, temp;

        for (i=0; i<5; i++) {
            System.out.printf("Enter array[%d]: \n", i);
            array[i] = input.nextInt(); 
        }

        System.out.println("\nEntered datas are: \n");
        for (i=0; i<5; i++) {
            System.out.printf("array[%d] = %d\n", i, array[i]); 
        }

        temp = array[4];
        System.out.println("\nAfter Shifting: \n");

        for(i=3; i>=0; i--) {
            array1[i+1] = array[i]; 
            array1[0] = temp; 
        }


        for (i=0; i<5; i++) {
            System.out.printf("array[%d] = %d\n", i, array1[i]);
        }

        input.close();


}
  }

}
