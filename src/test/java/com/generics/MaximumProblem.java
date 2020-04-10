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
    public String findMaximumString(String firstString, String secondString, String thirdString) {
        String maximumValue = firstString;
        if (maximumValue.compareTo(secondString) < 0) {
            maximumValue = secondString;
        }
        if (maximumValue.compareTo(thirdString) < 0) {
            maximumValue = thirdString;
        }
        return maximumValue;
    }
}
