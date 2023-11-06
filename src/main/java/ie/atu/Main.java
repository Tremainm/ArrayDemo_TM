package ie.atu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);


        int[] array1;
        array1 = new int [10];

        array1[0] = 100;
        array1[1] = 200;
        array1[2] = 300;
        array1[3] = 400;
        array1[4] = 500;
        array1[5] = 600;
        array1[6] = 700;
        array1[7] = 800;
        array1[8] = 900;
        array1[9] = 1000;

        System.out.println("Element at index 0 is: " + array1[0]);
        System.out.println("Element at index 1 is: " + array1[1]);
        System.out.println("Element at index 2 is: " + array1[2]);
        System.out.println("Element at index 3 is: " + array1[3]);
        System.out.println("Element at index 4 is: " + array1[4]);
        System.out.println("Element at index 5 is: " + array1[5]);
        System.out.println("Element at index 6 is: " + array1[6]);
        System.out.println("Element at index 7 is: " + array1[7]);
        System.out.println("Element at index 8 is: " + array1[8]);
        System.out.println("Element at index 9 is: " + array1[9]);

        System.out.println("Enter new element: ");
        array1[10] = scanner.nextInt();


    }
}