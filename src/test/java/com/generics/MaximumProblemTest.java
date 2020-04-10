package com.generics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumProblemTest {

    @Test
    public void givenIntegerMaxNumber_WhenAtFirstPosition_ShouldReturnSameNumber() {
        MaximumProblem maximumProblem=new MaximumProblem(50,20,30);
        Integer maximumValue=(Integer) maximumProblem.findMaximum();
        Assert.assertEquals((Integer.valueOf(50)),maximumValue);
    }

    @Test
    public void givenIntegerMaxNumber_WhenAtSecondPosition_ShouldReturnSameNumber() {
        MaximumProblem maximumProblem = new MaximumProblem(30,50,20);
        Integer maximumValue = (Integer) maximumProblem.findMaximum();
        Assert.assertEquals((Integer.valueOf(50)), maximumValue);
    }

    @Test
    public void givenIntegerMaxNumber_WhenAtThirdPosition_ShouldReturnSameNumber() {
        MaximumProblem maximumProblem = new MaximumProblem(30,20,50);
        Integer maximumValue = (Integer) maximumProblem.findMaximum();
        Assert.assertEquals((Integer.valueOf(50)), maximumValue);
    }

    @Test
    public void givenFloatMaxNumber_WhenAtFirstPosition_ShouldReturnSameNumber() {
        MaximumProblem maximumProblem = new MaximumProblem(50.2f,30.2f,20.2f);
        Float maximumValue = (Float) maximumProblem.findMaximum();
        Assert.assertEquals((Float.valueOf(50.2f)), maximumValue);
    }

    @Test
    public void givenFloatMaxNumber_WhenAtSecondPosition_ShouldReturnSameNumber() {
        MaximumProblem maximumProblem = new MaximumProblem(30.2f,50.2f,20.2f);
        Float maximumValue = (Float) maximumProblem.findMaximum();
        Assert.assertEquals((Float.valueOf(50.2f)), maximumValue);
    }

    @Test
    public void givenFloatMaxNumber_WhenAtThirdPosition_ShouldReturnSameNumber() {
        MaximumProblem maximumProblem = new MaximumProblem(20.2f,30.2f,50.2f);
        Float maximumValue = (Float) maximumProblem.findMaximum();
        Assert.assertEquals((Float.valueOf(50.2f)), maximumValue);
    }

    @Test
    public void givenStringValue_WhenAtFirstPosition_ShouldReturnMaxStringValue() {
        MaximumProblem maximumProblem = new MaximumProblem("Orange","Apple","Banana");
        String maximumValue = (String) maximumProblem.findMaximum();
        Assert.assertEquals("Orange", maximumValue);
    }

    @Test
    public void givenStringValue_WhenAtSecondPosition_ShouldReturnMaxStringValue() {
        MaximumProblem maximumProblem = new MaximumProblem("Apple","Orange","Banana");
        String maximumValue = (String) maximumProblem.findMaximum();
        Assert.assertEquals("Orange", maximumValue);
    }

    @Test
    public void givenStringValue_WhenAtThirdPosition_ShouldReturnMaxStringValue() {
        MaximumProblem maximumProblem = new MaximumProblem("Orange","Apple","Banana");
        String maximumValue = (String) maximumProblem.findMaximum();
        Assert.assertEquals("Orange", maximumValue);
    }
}
