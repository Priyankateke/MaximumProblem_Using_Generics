package com.generics;

public class MaximumProblem {

    public <E extends Comparable <E>> E findMaximum(E firstValue, E secondValue, E thirdValue) {
        E maximumValue = firstValue;

        if (maximumValue.compareTo(secondValue) < 0) {
            maximumValue = secondValue;
        }
        if (maximumValue.compareTo(thirdValue) < 0) {
            maximumValue = thirdValue;
        }
        return maximumValue;
    }
}
