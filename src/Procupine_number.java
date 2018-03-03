public class Procupine_number {


    static int findProcupineNumber( int number){
        boolean checker =true ;
        while(checker){
            number+=1;
            if(isPrime(number) == 1  && number % 10 == 9 && nextPrime(number) % 10 == 9) checker = false ;
        }
        return  number ;
    }

    static int isPrime(int number){
         int divisible =0;
        for(int i =1 ; i<= number ; i++){
            if(number%i == 0) divisible ++;

        }
        if(divisible == 2 ) return  1 ;
        return  0;
    }
    static  int nextPrime(int number){
        int divisible =0;
        do{
            divisible =0;
            number+=1;

            for (int i = 1 ; i <= number ; i++) {

                if (number % i == 0) divisible++;

            }
            if (divisible == 2) return number;
        }while(divisible > 2);

       return number;
    }
    public static void main (String args []){
          System.out.println(139%10);
          System.out.println(findProcupineNumber(139));
          System.out.println(findProcupineNumber(0));

    }
}
