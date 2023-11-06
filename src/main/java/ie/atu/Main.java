package ie.atu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        arrayForLoop();
    }

    public static void arrayForLoop()
    {
        int[] array1 = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};

        int index = 0;

        for(int value: array1)
        {
            System.out.println("Element at index " + index + ": " + value);
            index++;
        }

        System.out.println("Printed from method");
    }
}