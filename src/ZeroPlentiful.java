public class ZeroPlentiful {

    static int isPlentifulZeros(int[] arr)
    {
        int noOfZerosClusters = 0;
        int lengthOfCluster = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == 0)
                lengthOfCluster++;
            else
                lengthOfCluster = 0;

            if (lengthOfCluster == 4)
            {
                noOfZerosClusters++;
                lengthOfCluster = 0;
            }
        }
        return noOfZerosClusters;
    }
    public static void main(String[] args) {
        System.out.println(isPlentifulZeros(new int[]{0, 0, 0, 0, 0}));
        System.out.println(isPlentifulZeros(new int[]{1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12}));
        System.out.println(isPlentifulZeros(new int[]{0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0}));
        System.out.println(isPlentifulZeros(new int[]{1, 2, 3, 4}));
        System.out.println(isPlentifulZeros(new int[]{1, 0, 0, 0, 2, 0, 0, 0, 0}));
        System.out.println(isPlentifulZeros(new int[]{0}));
        System.out.println(isPlentifulZeros(new int[]{}));
    }
}
