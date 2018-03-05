public class largestDifferenceOfEvens {

    public static void main(String[] args) {
        System.out.println(largestDifferanceOfEvens(new int[]{-2, 3, 4, 9}));
        System.out.println(largestDifferanceOfEvens(new int[]{1, 3, 5, 9}));
        System.out.println(largestDifferanceOfEvens(new int[]{1, 18, 5, 7, 33}));
        System.out.println(largestDifferanceOfEvens(new int[]{2, 2, 2, 2}));
        System.out.println(largestDifferanceOfEvens(new int[]{1, 2, 1, 2, 1, 4, 1, 6, 4}));
    }
   /* static int largestDifferanceOfEvens(int[] arr)
    {
        int evenCounter = 0, max = arr[0], min = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 == 0)
                evenCounter++;
            if (arr[i] > max && arr[i] % 2 == 0)
                max = arr[i];
            else if (arr[i] < min && arr[i] % 2 == 0)
                min = arr[i];
        }
        if (evenCounter < 2)
            return -1;

        return (max-min);
    }*/

    static int largestDifferanceOfEvens(int[] a) {
        boolean evenFlag = false;
        int largestDiff = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] % 2 == 0) {
                        evenFlag = true;
                        int diff = a[i] > a[j] ? a[i] - a[j] : a[j] - a[i];
                        largestDiff = diff > largestDiff ? diff : largestDiff;
                    }
                }
            }
            if (!evenFlag && i == a.length - 1)
                return -1;
        }

        return largestDiff;
    }
}
