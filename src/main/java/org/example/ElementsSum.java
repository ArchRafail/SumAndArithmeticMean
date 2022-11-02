package org.example;

public class ElementsSum implements Runnable {
    private static int sum;

    public static int getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (int element : ArrayInput.getArray()) {
            sum += element;
        }
        System.out.println("Sum of array's elements was calculated!");
    }
}