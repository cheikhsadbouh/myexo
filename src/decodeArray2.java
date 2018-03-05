public class decodeArray2 {
    static int decodeArray2(int[] a) {
        int sum = 0;

        int position = 0;
        for (int i = a.length - 1; i > 0; i--) {
            int digit = 0;

            for (int j = i; j > 0; j--) {
                if (a[j - 1] != 0) {
                    i = j;
                    break;
                }
                digit++;
                i = j;
            }

            for (int j = 0; j < position; j++) {
                digit *= 10;
            }
            sum += digit;

            position++;
        }

        if (a[0] < 0) return -sum;
        return sum;
    }
    public static void main(String[] args) {


        System.out.println("\n\n" + decodeArray2(new int[]{1}));
        System.out.println(decodeArray2(new int[]{0, 1}));
        System.out.println(decodeArray2(new int[]{-1, 0, 1}));
        System.out.println(decodeArray2(new int[]{0, 1, 1, 1, 1, 1, 0, 1}));
        System.out.println(decodeArray2(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}));
        System.out.println(decodeArray2(new int[]{0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1}));
        System.out.println(decodeArray2(new int[]{-1, 0, 0, 1, 1, 0, 1}));
    }

}
