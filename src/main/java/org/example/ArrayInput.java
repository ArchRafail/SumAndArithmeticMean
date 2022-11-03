package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayInput implements Runnable{
    private static int[] array;

    public static int[] getArray() {
        return array;
    }

    /**
     When method ask you to enter the length of array, input 15.
     */
    private int arraySize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the length of array: ");
        int quantity;
        try {
            quantity = scanner.nextInt();
            if (quantity == 0) throw new NegativeArraySizeException();
        } catch (InputMismatchException ex) {
            throw new RuntimeException("Invalid type of quantity numbers. Must be integer!");
        } catch (NegativeArraySizeException ex) {
            throw new RuntimeException("Length of array has to be more then 0!");
        }
        return quantity;
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