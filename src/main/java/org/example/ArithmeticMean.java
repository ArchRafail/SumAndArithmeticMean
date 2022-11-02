package org.example;

public class ArithmeticMean implements Runnable{
    private static float arithmeticMean;

    public static float getArithmeticMean() {
        return arithmeticMean;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int element : ArrayInput.getArray()) {
            sum += element;
        }
        int qtyElements = ArrayInput.getArray().length;
        arithmeticMean = (float)sum/(float)qtyElements;
        System.out.println("Arithmetic mean of elements of array was calculated!");
    }
}