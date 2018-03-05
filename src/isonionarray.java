public class isonionarray {
    public static void main(String[] args) {
        System.out.println(isOnionArray(new int[]{1, 2, 19, 4, 5}));
        System.out.println(isOnionArray(new int[]{1, 2, 3, 4, 15}));
    }

    static int isOnionArray(int[] arr) {
        for (int j = 0, k = arr.length-1; j < arr.length && k > -1; j++, k--)
        {
            if (j != k)
            {
                if (arr[j] + arr[k] <= 10)
                    continue;
                else
                    return 0;
            }
        }
        return 1;
    }
}
