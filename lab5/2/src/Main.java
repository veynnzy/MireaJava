import java.util.Scanner;

public class Main
{
    public static String PrintNumbers(int n)
    {
        if (n == 1)
        {
            return "1";
        }
        return PrintNumbers(n - 1) + " " + n;
    }
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       System.out.println(PrintNumbers(n));
    }
}