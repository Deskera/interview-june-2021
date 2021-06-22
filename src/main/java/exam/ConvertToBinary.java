package exam;

import java.io.*;
import java.util.Scanner;
 
public class GFG {
    // Function to print binary number
    static void printBinary(int[] binary, int id)
    {
        // Iteration over array
        for (int i = id - 1; i >= 0; i--)
            System.out.print(binary[i] + "");
    }
 
    // Function convering decimal to binary
    public static void decimalToBinary(int num)
    {
        // Creating and assigning binary array size
        int[] binary = new int[35];
        int id = 0;
 
        // Number should be positive
        while (num > 0) {
            binary[id++] = num % 2;
            num = num / 2;
        }
 
        // Print Binary
        printBinary(binary, id);
    }
 
    // Main Driver Code
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        // Entered number to be convert into binary
        int num;
        num=s.nextInt();
 
        // Calling Our Above Function
        decimalToBinary(num);
    }
}
