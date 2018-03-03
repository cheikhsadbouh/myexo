public class Islegale {


    static int isLegalBase(int[] arr, int b)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] >= b)
                return 0;
        }
        return 1;
    }

    public static void main(String args[]) {
        System.out.println(isLegalBase(new int []{1,2,2},3));
    }
}
