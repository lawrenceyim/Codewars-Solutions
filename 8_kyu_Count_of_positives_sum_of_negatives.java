public class Kata
{
    public static int[] countPositivesSumNegatives(int[] input)
    {    
        int[] num = new int[0];
        if (input == null || input.length == 0) return num;
        int p = 0;
        int n = 0;
        for (int i = 0; i < input.length; i++) {
          if (input[i] > 0) p ++;
          else n += input[i];
        }
        num = new int[2];
        num[0] = p;
        num[1] = n;
        return num;
    }
}