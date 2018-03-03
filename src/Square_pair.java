public class Square_pair {

    static int countSquarePairs(int[ ] a) {
        int count =0;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++)
                if (a[i]< a[j] && isPerfectSquare(a[i]+a[j])==1 && a[i]> 0 && a[j] > 0 )
                    count++;
        }
        return count;
    }

    static int isPerfectSquare(int n){
        if (n<= 0 )
            return 0;

        int nsqr=(int) Math.sqrt(n);

        if (nsqr* nsqr != n)
            return 0;

        return 1;
    }
    public static void main(String args []){


System.out.println(countSquarePairs(new int []{11,5,4,20}));
System.out.println(countSquarePairs(new int []{9,0,2,-5,7}));
System.out.println(countSquarePairs(new int []{9}));
System.out.println(countSquarePairs(new int []{2,7,2,2}));

    }
}
