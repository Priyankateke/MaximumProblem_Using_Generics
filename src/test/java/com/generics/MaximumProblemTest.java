package com.generics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumProblemTest {
    MaximumProblem maximumProblem=new MaximumProblem();

    @Before
    public void setUp() throws Exception {
        maximumProblem=new MaximumProblem();
    }

    @Test
    public void givenIntegerMaxNumber_WhenAtFirstPosition_ShouldReturnSameNumber() {
        Assert.assertSame(50,maximumProblem.findMaximumNumber(50,20,30));
    }

    @Test
    public void givenIntegerMaxNumber_WhenAtSecondPosition_ShouldReturnSameNumber() {
        Assert.assertSame(50,maximumProblem.findMaximumNumber(20,50,30));
    }

    @Test
    public void givenIntegerMaxNumber_WhenAtThirdPosition_ShouldReturnSameNumber() {
        Assert.assertSame(50, maximumProblem.findMaximumNumber(20, 30, 50));
    }

    @Test
    public void givenFloatMaxNumber_WhenAtFirstPosition_ShouldReturnSameNumber() {
        Float result=maximumProblem.findMaximumNumber(50.2f,20.2f,30.2f);
        Assert.assertEquals(Float.valueOf(50.2f),result);
    }

    @Test
    public void givenFloatMaxNumber_WhenAtSecondPosition_ShouldReturnSameNumber() {
        Float result=maximumProblem.findMaximumNumber(20.2f,50.2f,30.2f);
        Assert.assertEquals(Float.valueOf(50.2f),result);
    }

    @Test
    public void givenFloatMaxNumber_WhenAtThirdPosition_ShouldReturnSameNumber() {
        Float result=maximumProblem.findMaximumNumber(20.2f,30.2f,50.2f);
        Assert.assertEquals(Float.valueOf(50.2f),result);
    }
}
