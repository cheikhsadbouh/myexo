import java.util.Arrays;

public class clusterCompression {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(clusterCompression(new int[]{3, 3, 3, 4, 4, 3, 2, 2, 2, 2, 4})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{0, 0, 0, 2, 0, 2, 0, 2, 0, 0})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{18})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{-5, -5, -5, -5, -5})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{8, 8, 6, 6, -2, -2, -2})));
    }

    static int[] clusterCompression(int[] arr)
    {
        int[] result = new int[arr.length];
        int counter = -1;

        for (int i = 0; i < arr.length; i++)
        {
            if (i == 0 || (result[counter] != arr[i]))
                result[++counter] = arr[i];
        }
        // handle the last item
        counter++;
        int[] compressed = new int[counter];
        for (int i = 0; i < compressed.length; i++)
        {
            compressed[i] = result[i];
        }
        return compressed;
    }
}
