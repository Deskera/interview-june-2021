
class karan {
    public void decToBinary(int n)
    {
        // Size of an integer is assumed to be 32 bits
        for (int i = 31; i >= 0; i--) {
            int k = n >> i;
            if ((k & 1) > 0)
                System.out.print("1");
            else
                System.out.print("0");
        }
    }
}
 
class hello {
    public static void main(String[] args)
    {
        karan g = new karan();
        int n = 32;
        g.decToBinary(n);
    }
}
