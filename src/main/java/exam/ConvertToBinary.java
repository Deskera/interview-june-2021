package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
void decToBinary(int n)
{
int binaryNum[32];
int i = 0;
while (n > 0) {
binaryNum[i] = n % 2;
n = n / 2;
i++;
}
for (int j = i - 1; j >= 0; j--)
cout << binaryNum[j];
}
int main()
{
int n = 17;
decToBinary(n);
return 0;
    return "";
  }
}
