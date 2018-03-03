public class Madhavarray {

static int madhav( int a[]){

int checker =0 ,end =0, incremental=2 ,sum=0;
    for (int i=0;i<a.length;i++ ) {
        //System.out.println("checker  :  "+checker);
        if(i *(i+1)/2 == a.length) checker =1;
    }
    if(checker == 0) return 0;


    for( int i=2 ; i<a.length;i+= incremental){
      //  System.out.println("i :  "+i + "increment : "+ incremental);
         sum=0;
        for( int j=i ; j>end ; j--) sum+=a[j];
        if(sum != a[0]) return  0;
        end =i ; incremental++ ;
    }
    return  1;
}
static int isMadhavArray(int[ ] a){

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
public static void main (String arg []){
 System.out.println(madhav(new  int []{2,1,1}));
 System.out.println(madhav(new  int []{2,1,1,4,-1,-1}));
 System.out.println(madhav(new  int []{6,2,4,2,2,2,1,5,0,0}));
 System.out.println(madhav(new  int []{18,9,10,6,6,6}));
 System.out.println(madhav(new  int []{-6,-3,-3,8,-5,-4}));
 System.out.println(madhav(new  int []{0,0,0,0,0,0,0,0,0,0,1,1,1,-2,-1}));
 System.out.println(madhav(new  int []{3,1,2,3,0}));
// System.out.println(madhav(new  int []{2,1,1,4,-1,-1}));

}


}
