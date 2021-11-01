package com.company;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        //1
        int[] a = new int[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++)
        {
            a[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < 3; i++)
        {
            sum += a[i];
        }

        System.out.println(sum);

        //2
        System.out.println(Arrays.toString(args));

        //3
        for (int i = 1; i < 11; i++)
        {
            System.out.print(1.0 / i);
            System.out.print(' ');
        }

        System.out.println();

        //4
        int[] b = new int[10];
        Random gen = new Random();
        for (int i = 0; i < 10; i++)
        {
            b[i] = gen.nextInt() % 100;
            System.out.print(b[i]);
            System.out.print(' ');
        }

        System.out.println();

        Arrays.sort(b);
        System.out.println(Arrays.toString(b));

        //5
        int factorial = scanner.nextInt();
        System.out.println(Factorial(factorial));
    }
        //5
        public static int Factorial (int n)
        {
            int r = 1;
            for (int i = 1; i <= n; i++)
            {
                r = r * i;
            }
            return r;
        };

}


