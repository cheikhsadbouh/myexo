public class Matches {
    static int matches(int[] a, int[] p)
    {
        int start = 0, end = 0;
        for (int i = 0; i < p.length; i++)
        {
            end += Math.abs(p[i]);
            for (int j = start; j < end; j++)
            {
                if ((a[j] > 0 && p[i] < 0) || (a[j] < 0 && p[i] > 0))
                    return 0;

                start++;
            }
        }
        return 1;
    }

    public static void main(String args[]) {
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{3, -2, 3}));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{4, -1, 3}));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{2, -3, 3}));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{8}));
    }
}
