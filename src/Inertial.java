public class Inertial {


    public static int isInertial(int []a){

      int max=a[0];
      boolean  condition_A=false,
               condition_B=false,
               condition_C=false,
               checker=false;
      for(int i=1;i<a.length;i++){
          if(a[i]>max){
              max=a[i];

          }else if(a[i]%2 != 0  || a[0] != 0 ){
                  condition_A=true;
          }

      }
        if(max %2 == 0 )condition_B =true ;
      for ( int i= 0 ; i< a.length ; i++){
          if(a[i] % 2 !=0){
              for(int j =0 ; j< a.length; j++){
                 if(a[j]  % 2 == 0 && a[j] != max){
                     if(a[i] < a[j]){
                         checker=true;
                     }
                 }
              }
          }


      }
      if(!checker) condition_C = true;
      if(condition_A && condition_B && condition_C ) return  1 ;

       return 0;
    }
    public static  void main (String args[]){

        System.out.println(isInertial(new int []{1}));
        System.out.println(isInertial(new int []{2}));
        System.out.println(isInertial(new int []{1,2,3,4}));
        System.out.println(isInertial(new int []{1,1,1,1,1,1,2}));
        System.out.println(isInertial(new int []{2,12,4,6,8,11}));
        System.out.println(isInertial(new int []{2,12,12,4,6,8,11}));
        System.out.println(isInertial(new int []{-2,-4,-6,-8,-11}));
        System.out.println(isInertial(new int []{2,3,5,7}));
        System.out.println(isInertial(new int []{2,4,6,8,10}));
    }
}
