public class Respequal {


    static int respEqual(int a[] , int n){

        String digits =  String.valueOf(n);
        char checker;
        for( int i = 0 ; i< a.length ; i++){
            checker = digits.charAt(i);
            //System.out.println("digit : "+checker);
          //  System.out.println("a[i] : "+a[i]);
            // if(a[0] == 0) continue;
              if(String.valueOf(checker).compareTo(String.valueOf(a[i])) != 0 ){ return 0 ;}
        }
        return 1;
    }
    static int repsEqual(int[] arr, int n)
    {
        int nn = n;
        int mod = 0;

        for (int i = arr.length-1; i >= 0 ; i--)
        {
            mod = nn % 10;
            nn /= 10;

             if (arr[i] != mod)
                return 0;

        }
        return 1;
    }
    public static  void main(String args []){
               //  String digits =  String.valueOf(234);
              //  System.out.println(digits.charAt(0));
             //System.out.println(digits.charAt(1));
           // System.out.println(respEqual(new int []{3,2,1,5,0},32157));
             //System.out.println(respEqual(new int []{3,6,1,5,7},36157));
             System.out.println(repsEqual(new int []{0,0,0,0,0,1,5,7},157));
     }
}
