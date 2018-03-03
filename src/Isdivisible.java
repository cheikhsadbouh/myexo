public class Isdivisible {

    static int isDivisible(int[] arr, int div)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % div != 0)
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main (String args []){
 System.out.println( isDivisible(new  int []{},4));

    }
}
