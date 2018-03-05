import java.util.ArrayList;

public class henry {

 public static  int isPerfect(int i , int j){

     ArrayList result = new ArrayList();

     int perfectCounter=0 , sum=0 , inc=0,r=1 , prev=0;


     do{
          sum = 0 ;
         for( int t = 1 ; t< r ; t++){

             if( r % t == 0) sum+=t ;


         }

         if(sum == r ) {perfectCounter++ ; }
          if(perfectCounter == i || perfectCounter == j){
              if(perfectCounter != prev){ prev= perfectCounter; result.add(r) ;   }

          }
r++;
     }while(result.size()<2);

     return    ( (int)  result.get(0) +  (int) result.get(1));
 }

    public static void main(String args []){

System.out.println(isPerfect(1,3));
System.out.println(isPerfect(1,2));
    }
}
