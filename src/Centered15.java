public class Centered15 {

    static int isCentered15(int[] arr)
    {
        int sum = 0, eleIndex = 0;
        while (true)
        {
            sum = 0;
            if (eleIndex >= arr.length)
                break;

            for (int i = eleIndex; i < arr.length-eleIndex; i++)
                sum += arr[i];

            if (sum == 15)
                return 1;

            eleIndex++;
        }
        return 0;
    }

    public static void main (String args[]){

System.out.println(isCentered15(new int [] {3,2,10,4,1,6,9}));

    }
}
