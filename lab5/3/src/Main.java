import java.util.Scanner;

public class Main
{
    public static String PrintNumbers(int a, int b)
    {
        if (a > b)
        {
            if (a == b)
            {
                return Integer.toString(a);
            }
            return a + " " + PrintNumbers(a - 1, b);
        }
        else
        {
            if (a == b)
            {
                return Integer.toString(a);
            }
            return a + " " + PrintNumbers(a + 1, b);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int a = sc1.nextInt();
        int b = sc2.nextInt();
        System.out.println(PrintNumbers(a, b));
    }
}
