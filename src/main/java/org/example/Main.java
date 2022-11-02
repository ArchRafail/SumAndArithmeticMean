package org.example;

public class Main {
    public static void main(String[] args) {
        Thread threadInput = new Thread(new ArrayInput());
        Thread threadSum = new Thread(new ElementsSum());
        Thread threadArithmeticMean = new Thread(new ArithmeticMean());
        threadInput.start();
        try {
            threadInput.join();
        } catch (InterruptedException e) {
            throw new RuntimeException("Input thread can't be forced!");
        }
        threadSum.start();
        threadArithmeticMean.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException("Main thread is not able to sleep.");
        }
        results(ArrayInput.getArray(), ElementsSum.getSum(), ArithmeticMean.getArithmeticMean());
    }

    public static void results(int[] array, int sum, float arithmeticMean) {
        if (array == null)
            return;
        System.out.println("\nCurrent array:");
        for (int element: array) {
            System.out.print(element + " ");
        }
        System.out.println("\n");
        System.out.print("Sum of array's elements is the next: ");
        System.out.println(sum + "\n");
        System.out.print("Arithmetic mean of elements of array is the next: ");
        System.out.println(arithmeticMean);
    }
}