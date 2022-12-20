package ru.mirea.lab83;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Recursion(scanner, 0);
    }

    private static void Recursion(Scanner scanner,int counter)
    {
        int number = scanner.nextInt();

        if(number == 0)
            return;

        if((counter + 1) % 2 != 0)
            System.out.println(number);

        Recursion(scanner, ++counter);
    }
}
