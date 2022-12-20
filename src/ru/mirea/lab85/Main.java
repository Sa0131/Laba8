package ru.mirea.lab85;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число n: ");
        long number = scanner.nextLong();

        Recursion(number, 1, false);
    }

    private static void Recursion(long counter, int summs, boolean isSummEnded)
    {
        if(counter/summs < 10 && isSummEnded == false)
        {
            isSummEnded = true;
            Recursion(counter, summs, isSummEnded);
        }
        else if(isSummEnded == false)
        {
            summs*=10;
            Recursion(counter, summs, isSummEnded);
        }
        else
        {
            long number =(counter/summs);
            counter -= number * summs;

            System.out.print(String.format("%s ",number));
            summs/=10;

            if (summs == 0)
                return;

            Recursion(counter, summs, isSummEnded);
        }
    }
}
