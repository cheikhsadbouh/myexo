public class CubePowerful {
    static int isCubePowerful(int n)
    {
        if (n <= 0)
            return 0;

        int num = n, sum = 0; ;
        while (num > 0)
        {
            int reminder = num % 10;
            sum += (int)Math.pow(reminder, 3);
            num /= 10;
        }
        return n == sum ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isCubePowerful(153));
        System.out.println(isCubePowerful(370));
        System.out.println(isCubePowerful(371));
        System.out.println(isCubePowerful(407));
        System.out.println(isCubePowerful(87));
        System.out.println(isCubePowerful(0));
        System.out.println(isCubePowerful(-81));
    }
}
