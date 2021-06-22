package exam;

public class ShiftElementsInArray {

  public void shift(int[] arr) {
     int l = arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = l;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
      }

  }


