package org.example;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayInput implements Runnable{
    private static int[] array;

    public static int[] getArray() {
        return array;
    }

    private int arraySize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the length of array: ");
        return scanner.nextInt();
    }

    @Override
    public void run() {
        int length = arraySize();
        int[] newArray = new int[length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = ThreadLocalRandom.current().nextInt(1, 50 + 1);
        }
        array = newArray.clone();
        System.out.println("\nArray was already filled!");
    }
}