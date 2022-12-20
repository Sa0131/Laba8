package ru.mirea.lab84;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число n: ");
        long number = scanner.nextLong();

        Recursion(number, 1);
    }

    private static void Recursion(long counter, int summs)
    {
        long symbol = counter%10;

        if(counter > 0)
            System.out.print(String.format("%s ",symbol));
        else
            return;

        long number = counter/10;

        Recursion(number, ++summs);
    }
}
