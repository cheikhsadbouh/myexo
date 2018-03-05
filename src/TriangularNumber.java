public class TriangularNumber {


    public static void main(String[] args) {
        System.out.println(isTriangular(1));
        System.out.println(isTriangular(3));
        System.out.println(isTriangular(6));

    }

    static int isTriangular(int n) {

        int sum = 0;
        for (int i = 1; sum < n; i++) {
            sum += i;
        }
        if (sum == n) return 1;
        return 0;
    }
}
