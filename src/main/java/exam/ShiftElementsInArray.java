package exam;

public class ShiftElementsInArray {

	public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Eneter Size Of Array: ");
        int n = Integer.parseInt(br.readLine());
        int temp=0;
        int[] Arr = new int[n];
        
        for(int i=0; i<n; i++)
        {
             Arr[i] = Integer.parseInt(br.readLine());
        }
        temp = Arr[n-1];
        for(int i=n-1; i>=0; i--)
        {
            if(i != 0)
            {
                
                Arr[i] = Arr[i-1];
            }
            else{
                
                Arr[i] = temp;
            }
            
        }
        for(int i=0; i<n; i++)
        {
            System.out.println(" "+Arr[i]);
        }
    }

}
