package com.generics;

public class MaximumProblem <E extends Comparable<E>>{
    E firstValue;
    E secondValue;
    E thirdValue;

    public MaximumProblem(E firstValue,E secondValue,E thirdValue) {
        this.firstValue=firstValue;
        this.secondValue=secondValue;
        this.thirdValue=thirdValue;
    }

    /* Finding Maximum Value */
    public E findMaximum() {
        E maximumValue = firstValue;

        if (maximumValue.compareTo(secondValue) < 0) {
            maximumValue = secondValue;
        }
        if (maximumValue.compareTo(thirdValue) < 0) {
            maximumValue = thirdValue;
        }
        printMax(maximumValue);
        return maximumValue;
    }

    /* Printing Maximum Value */
    private static <E extends Comparable<E>> void printMax(E maximumValue) {
        System.out.println("Maximum Value : " +maximumValue);
    }
}
