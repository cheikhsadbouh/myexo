public class N_unique {

    static int isNUnique(int[] a, int n)
    {
        boolean checker = false;
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i+1; j < a.length; j++)
            {

                if (a[i] + a[j] == n && !checker)
                    checker = true;
                else if (a[i] + a[j] == n && checker)
                    return 0;

            }
        }
        return 1;
    }

    public static void main( String args []){
 System.out.print( isNUnique(new int []{1},5));
    }
}
