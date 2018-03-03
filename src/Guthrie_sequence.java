public class Guthrie_sequence {



    public  static int isGuthrieSequence(int a[]){
        int checker = a[0];
        for(int i =1 ; i<a.length ; i++ ){
            if(isOdd(checker)){
                 checker = (checker * 3) + 1;
                 if(checker != a[i] || a[a.length-1] != 1 ) return  0;
                checker =a[i];

            }else if(isEven(checker)){
                   checker = checker /2 ;
                   if(checker != a[i] || a[a.length-1] != 1 ) return  0;
                   checker =a[i];

            }

        }

        return  1 ;
    }
    public static boolean isOdd(int number){
             if( number % 2 != 0) return  true ;

             return   false  ;
    }
    public static boolean isEven(int number){
        if( number % 2 == 0) return  true ;
        return  false  ;
    }


    public static void main (String args []){
System.out.println(isGuthrieSequence(new int []{8,4,2,1}));
System.out.println(isGuthrieSequence(new int []{8,17,4,1}));
System.out.println(isGuthrieSequence(new int []{8,4,1}));
System.out.println(isGuthrieSequence(new int []{8,4,2}));

    }
}
