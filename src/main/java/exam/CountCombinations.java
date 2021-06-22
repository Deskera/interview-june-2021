package exam;

public class CountCombinations {

	static void Combinations1(int arr[], int ind, int Num, int ChangeNum)
    {

		if (ChangeNum < 0)
			return;

		if (ChangeNum == 0)
		{
			for (int i = 0; i < ind; i++)
				System.out.print (arr[i] + " ");
				System.out.println();
				return;
		}

		int prev = (ind == 0) ? 1 : arr[ind - 1];


		for (int k = prev; k <= Num ; k++)
		{

			arr[ind] = k;


			Combinations1(arr, ind + 1, Num, ChangeNum - k);
		}
    }


	static void Combinations(int W, int T)
	{

		int arr[] = new int [T];


		Combinations1(arr, 0, W, T);
	}


	public static void main (String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int W = Integer.parseInt(br.readLine());
		Combinations(W,T);
	}

}
