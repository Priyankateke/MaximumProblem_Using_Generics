package com.generics;

public class MaximumProblem {
    public Integer findMaximumNumber(Integer firstNumber, Integer secondNumber, Integer thirdNumber){
        Integer maximum=firstNumber;

        if(maximum.compareTo(secondNumber) < 0) {
            maximum=secondNumber;
        }

        if(maximum.compareTo(thirdNumber) < 0) {
            maximum=thirdNumber;
        }

        return maximum;
    }
}
