public class closestFibonacci_averifieeeeee {
    public static void main(String[] args) {
        System.out.println(closestFibonacci(13));

        System.out.println(closestFibonacci(33));
        System.out.println(closestFibonacci(34));
    }


    private static int getFactorial(int n)
    {
        if (n == 1)
            return 1;
        else
            return (n * getFactorial(n - 1));
    }

    static int closestFibonacci(int n)
    {
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        int i = 0;
        for (i = 2; i < arr.length; i++)
        {
            arr[i] = arr[i - 1] + arr[i - 2];
            if (arr[i] >= n)
                return arr[i - 1];
        }
        return arr[i - 1];
    }
}
