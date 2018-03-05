public class array123 {
    public static void main(String[] args) {
        System.out.println(is121Array(new int[]{1, 2, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 1, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1, 3}));
        System.out.println(is121Array(new int[]{1, 1, 1, 1, 1, 1}));
        System.out.println(is121Array(new int[]{2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 2, 2}));
        System.out.println(is121Array(new int[]{2, 2, 2}));
    }
    static int is121Array(int[] arr)
    {
        if (arr.length == 0 || arr[0] != 1 || arr[arr.length - 1] != 1)
            return 0;

        int firstOnes = 0, lastOnes = 0, zeros = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == 1 && zeros == 0)
                firstOnes++;
            else if (arr[i] == 2 && firstOnes != 0)
                zeros++;
            else if (arr[i] == 1 && zeros != 0)
                lastOnes++;
            else
                return 0;
        }
        if (firstOnes == lastOnes)
            return 1;
        else
            return 0;
    }

}
