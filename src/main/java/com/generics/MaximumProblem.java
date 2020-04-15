package com.generics;

import java.util.Arrays;
import java.util.Collections;

public class MaximumProblem <E extends Comparable<E>>{
    E firstValue;
    E secondValue;
    E thirdValue;

    public MaximumProblem(E firstValue,E secondValue,E thirdValue) {
        this.firstValue=firstValue;
        this.secondValue=secondValue;
        this.thirdValue=thirdValue;
    }

    public E findMaximum() {
        return findMaximum(firstValue, secondValue, thirdValue);
    }

    /* Finding Maximum Value */
    public static <E extends Comparable<E>> E findMaximum(E firstValue, E secondValue, E thirdValue, E... optionalArguments) {
        E maximumValue = firstValue;

        if (maximumValue.compareTo(secondValue) < 0) {
            maximumValue = secondValue;
        }
        if (maximumValue.compareTo(thirdValue) < 0) {
            maximumValue = thirdValue;
        }
        if (optionalArguments.length!=0) {
            Arrays.sort(optionalArguments, Collections.reverseOrder());
            if(maximumValue.compareTo(optionalArguments[0]) < 0) {
                maximumValue=optionalArguments[0];
            }
        }
        printMax(maximumValue);
        return maximumValue;
    }

    /* Printing Maximum Value */
    private static <E extends Comparable<E>> void printMax(E maximumValue) {
        System.out.println("Maximum Value : " +maximumValue);
    }
}
