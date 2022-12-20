package ru.mirea.lab81;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        char symbol = GetSymbol();
        IAlphabet alphabet = new Alphabet();
        System.out.println(alphabet.Print(symbol));
    }

    private static char GetSymbol()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите букву из диапазона A-Z: ");
        String string = scanner.nextLine();
        char symbol = ' ';

        if (string.toCharArray().length > 0)
            symbol = string.toCharArray()[0];
        else
            symbol = 'A';

        return symbol;
    }
}
