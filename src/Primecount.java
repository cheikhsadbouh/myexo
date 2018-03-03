public class Primecount {

 static int primeCount( int start, int end ){
     int cheker = 0 , primeNumber =0;
     if(start  > end || end  == 1 ){
         return 0;
     }else if ( start <= 1){
         start =2;
     }
     for(int i=start ; i<=end ; i++){
         cheker =0;
         for( int j=1 ; j<=i; j++){

             if(i%j == 0){
                 cheker++;
             }
         }
         if(cheker == 2){
             primeNumber++;
         }
     }
     return  primeNumber;
 }
    public static void main ( String  [] args ){

System.out.println(primeCount(10,30));
System.out.println(primeCount(11,29));
System.out.println(primeCount(20,22));
System.out.println(primeCount(1,1));
System.out.println(primeCount(5,5));
System.out.println(primeCount(6,2));
System.out.println(primeCount(-10,6));
    }
}
