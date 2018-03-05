import java.util.Arrays;

public class IntegerBasedRounding {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        doIntegerBasedRounding(a, 2);
        System.out.println(Arrays.toString(a));

        int[] b = new int[]{1, 2, 3, 4, 5};
        doIntegerBasedRounding(b, 3);
        System.out.println(Arrays.toString(b));

        int[] c = new int[]{1, 2, 3, 4, 5};
        doIntegerBasedRounding(c, -3);
        System.out.println(Arrays.toString(c));

        int[] d = new int[]{-1, -2, -3, -4, -5};
        doIntegerBasedRounding(d, 3);
        System.out.println(Arrays.toString(d));

        int[] e = new int[]{-18, 1, 2, 3, 4, 5};
        doIntegerBasedRounding(e, 4);
        System.out.println(Arrays.toString(e));

        int[] f = new int[]{1, 2, 3, 4, 5};
        doIntegerBasedRounding(f, 5);
        System.out.println(Arrays.toString(f));

        int[] g = new int[]{1, 2, 3, 4, 5};
        doIntegerBasedRounding(g, 100);
        System.out.println(Arrays.toString(g));
    }
    static void doIntegerBasedRounding(int[] a, int n)              // V.V.I.M

    {
        for (int i = 0, len = a.length; i < len; i++)
        {
            int l = a[i] / n;
            int m = a[i] / n + 1;

            if (Math.abs(l * n - a[i]) < Math.abs(m * n - a[i]))
                a[i] = l * n;
            else
                a[i] = m * n;
        }
    }
}
