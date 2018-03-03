public class Stanton_measure {


    public static int stantonMeasure(int[] a){
        int one_counter = 0, stat_counter = 0;

        for(int i=0; i<a.length;i++){
            if(a[i] == 1) one_counter++;
        }

        for(int j=0; j<a.length; j++){
            if(a[j] == one_counter) stat_counter++;
        }

        return stat_counter;

    }
    public static void main(String args []){
        System.out.println(stantonMeasure(new int [] {1}));
        System.out.println(stantonMeasure(new int [] {0}));
        System.out.println(stantonMeasure(new int [] {3,1,1,4}));
        System.out.println(stantonMeasure(new int [] {1,3,1,1,3,3,2,3,3,3,4}));
        System.out.println(stantonMeasure(new int []{}));
    }
}
