import java.util.Arrays;
import java.util.List;

public class encodeNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(encodeNumber(3)));
        System.out.println(Arrays.toString(encodeNumber(14)));
    }
    static int[] encodeNumber(int n)
    {
        if (n <= 1)
            return null;

        int count = 0, nn = n;
        for (int i = 2; i <= n; i++)
        {
            while (nn % i == 0)
            {
                count++;
                nn /= i;
            }
        }
        int[] res = new int[count];
        int j = 0;
        for (int i = 2; i <= n; i++)
        {
            while (n % i == 0 && j < res.length)
            {
                res[j++] = i;
                n /= i;
            }
        }
        return res;
    }
}
