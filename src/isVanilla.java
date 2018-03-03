public class isVanilla {

    public static void main(String[] args) {
        System.out.println(isVanilla(new int[]{1, 1, 11, 1111, 1111111}));
        System.out.println(isVanilla(new int[]{11, 101, 1111, 11111}));
        System.out.println(isVanilla(new int[]{11, 222, 1111, 11111}));
        System.out.println(isVanilla(new int[]{1}));
        System.out.println(isVanilla(new int[]{11, 22, 13, 34, 125}));
        System.out.println(isVanilla(new int[]{9, 999, 99999, -9999}));
        System.out.println(isVanilla(new int[]{}));
    }



    static int isVanilla(int[] a) {
        if (a.length == 0)
            return 1;

        int digit = a[0] % 10;

        for (int anA : a) {
            anA = anA < 0 ? -anA : anA;
            while (anA > 0) {
                int d = anA % 10;
                anA /= 10;
                if (d != digit)
                    return 0;
            }
        }
        return 1;
    }
}
