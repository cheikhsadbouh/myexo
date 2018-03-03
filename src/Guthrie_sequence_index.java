public class Guthrie_sequence_index {




    public  static int isGuthrieIndex(int a){
        int checker = a, count_index=0;
while(a >1){
    if(isOdd(checker)){
        count_index++;
        checker = (checker * 3) + 1;
        if(checker == 1 )break;


    }else if(isEven(checker)){
        count_index++;
        checker = checker /2 ;

        if(checker == 1 )break;


    }

}
return  count_index ;
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
        System.out.println(isGuthrieIndex(0));
        System.out.println(isGuthrieIndex(1));
        System.out.println(isGuthrieIndex(2));
        System.out.println(isGuthrieIndex(3));
        System.out.println(isGuthrieIndex(4));
        System.out.println(isGuthrieIndex(42));
       // System.out.println(isGuthrieSequence(new int []{8,17,4,1}));
        //System.out.println(isGuthrieSequence(new int []{8,4,1}));
        //System.out.println(isGuthrieSequence(new int []{8,4,2}));

    }
}
