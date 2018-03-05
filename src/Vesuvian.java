public class Vesuvian {

    static int isVesuvian(int n)
    {
        for (int i = 1; i < n; i++)
        {
            for (int j = 1; j < n; j++)
            {
                if (Math.pow(i, 2) + Math.pow(j, 2) == n)
                    return 1;
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isVesuvian(50));
        System.out.println(isVesuvian(65));
        System.out.println(isVesuvian(85));
    }
}
