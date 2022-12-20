package ru.mirea.lab82;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число n: ");
        int inputNumber = scanner.nextInt();

        for(int counter = 1; counter <= inputNumber; counter++)
        {
            System.out.print(String.format("%s ",counter));
        }
    }
}
