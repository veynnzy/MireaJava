import java.util.Scanner;

public class Main
{
    static int CountNumbers(int currentNumber, int maxNumber, int d, int count)
    {
        if (currentNumber == maxNumber) return count;

        int sum = 0;
        int number = currentNumber;
        while (number != 0)
        {
            sum += number % 10;
            number /= 10;
        }

        if (sum == d) count++;

        return CountNumbers(currentNumber + 1, maxNumber, d, count);
    }

    public static void main(String[] args)
    {
        System.out.println("Count numbers with digits sum equal d");
        int k, d;
        Scanner scanner = new Scanner(System.in);
        k = scanner.nextInt();
        d = scanner.nextInt();

        System.out.println(CountNumbers((int)Math.pow(10, k - 1), (int)Math.pow(10, k), d, 0));
    }
}
