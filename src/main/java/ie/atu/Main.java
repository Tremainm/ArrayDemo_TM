package ie.atu;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        arrayForLoop();

        arrayList();
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

    public static void arrayList()
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array2 = new ArrayList<>();

        int index = 0;
        int input = 0;
        int i;

        for(i = 100; i <=1000; i = i + 100)
        {
            array2.add(i);
        }


        for(int value: array2)
        {
            System.out.println("Element of Arraylist at index " + index + ": " + value);
            index++;
        }

        System.out.println("Enter a new number: ");
        input = scanner.nextInt();
        array2.add(input);
        index = 0;

        for(int value: array2)
        {
            System.out.println("Element of Arraylist at index " + index + ": " + value);
            index++;
        }
    }
}