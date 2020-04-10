package com.generics;

public class MaximumProblem {
    public Integer findMaximumNumber(Integer firstNumber, Integer secondNumber, Integer thirdNumber){
        Integer maximumValue=firstNumber;

        if(maximumValue.compareTo(secondNumber) < 0) {
            maximumValue=secondNumber;
        }

        if(maximumValue.compareTo(thirdNumber) < 0) {
            maximumValue=thirdNumber;
        }

        return maximumValue;
    }

    public Float findMaximumNumber(Float firstNumber, Float secondNumber, Float thirdNumber) {
        Float maximumValue = firstNumber;

        if (maximumValue.compareTo(secondNumber) < 0) {
            maximumValue = secondNumber;
        }
        if (maximumValue.compareTo(thirdNumber) < 0) {
            maximumValue = thirdNumber;
        }
        return maximumValue;
    }
}
