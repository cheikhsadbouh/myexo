public class Main {
   public static int isMadhavArray(int[] a)                   // V.I.M
    {
        boolean success=false;
        for (int i=0;i<a.length;i++){
            if ( i* (i+1)/2 == a.length)
                success=true ;
        }

        if (!success)
            return 0;

        int sum=0;
        int end =0;
        int counter =2;

        for (int i=2;i<a.length;i+=counter){
            System.out.println("counter = "+counter);
            System.out.println("i = "+i );
            sum=0;
            for (int j =i ;j>end ;j--)
                sum+= a[j];

            if (sum != a[0])
                return 0;

            end=i;
            counter++;
        }

        return 1;
    }
    public static void main(String[] args) {
        System.out.print(isMadhavArray(new int []{2,1,1,4,-1,-1}));
    }
}
