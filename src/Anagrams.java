public class Anagrams {
    public static void main(String[] args) {
        System.out.println(areAnagrams(new char[]{'s', 'i', 't'}, new char[]{'i', 't', 's'}));
        System.out.println(areAnagrams(new char[]{'s', 'i', 't'}, new char[]{'i', 'd', 's'}));
        System.out.println(areAnagrams(new char[]{'b', 'i', 'g'}, new char[]{'b', 'i', 't'}));
        System.out.println(areAnagrams(new char[]{'b', 'o', 'g'}, new char[]{'b', 'o', 'o'}));
        System.out.println(areAnagrams(new char[]{}, new char[]{}));
        System.out.println(areAnagrams(new char[]{'b', 'i', 'g'}, new char[]{'b', 'i', 'g'}));
    }
    static int areAnagrams(char[] a, char[] b)
    {
        for (int i = 0; i < a.length; i++)
        {
            int counter1 = 0, counter2 = 0;
            for (int j = 0; j < a.length; j++)
            {
                if (a[i] == a[j])
                    counter1++;
            }

            for (int k = 0; k < a.length; k++)
            {
                if (a[i] == b[k])
                    counter2++;
            }

            if (counter1 != counter2)
                return 0;
        }
        return 1;
    }
}
