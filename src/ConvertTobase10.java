public class ConvertTobase10 {

    static int isLegalBase(int[] arr, int b)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] >= b)
                return 0;
        }
        return 1;
    }
    static int convertToBase10(int[] a, int base)
    {
        int base10 = 0;
        if (isLegalBase(a,base) == 1)
        {

            for (int i = 0; i < a.length; i++) {
                int baseProd = 1;
                for (int j = i + 1; j < a.length; j++) {
                    baseProd = base * baseProd;
                }
                base10 += a[i] * baseProd;
            }
            return base10;
        }
        else
            return -1;
    }

    public static void main(String args[]) {
        System.out.println(convertToBase10(new int []{1,1,0,1},2));
        System.out.println(convertToBase10(new int []{1,1,2},3));
        System.out.println(convertToBase10(new int []{3,2,5},8));
        System.out.println(convertToBase10(new int []{3,7,1},6));
    }
}
