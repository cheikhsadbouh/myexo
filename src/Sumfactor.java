public class Sumfactor {


    static int sumfactor(int a[]){
int sum_factor =0 , sum_array=0;

   for( int i = 0 ; i  < a.length ; i++){
       sum_array+= a[i] ;
   }
   for (int i = 0 ; i< a.length ; i++){
       if(sum_array == a[i]) sum_factor++ ;
   }

        return sum_factor ;
    }
    public static void main (String args []){
System.out.println(sumfactor(new int[]{3,0,2,-5,0}));
System.out.println(sumfactor(new int[]{9,-3,-3,-1,-1}));
System.out.println(sumfactor(new int[]{1}));
System.out.println(sumfactor(new int[]{0,0,0,}));

    }
}
