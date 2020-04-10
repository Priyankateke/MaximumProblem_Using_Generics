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
}
