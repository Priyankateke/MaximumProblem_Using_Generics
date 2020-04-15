package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumProblemTest {

    /* Testing Integer Value*/
    @Test
    public void givenIntegerMaxNumber_WhenAtFirstPosition_ShouldReturnSameNumber() {
        Assert.assertEquals(Integer.valueOf(50), new MaximumProblem<>(50,20,30).findMaximum());
    }

    @Test
    public void givenIntegerMaxNumber_WhenAtSecondPosition_ShouldReturnSameNumber() {
        Assert.assertEquals((Integer.valueOf(50)), new MaximumProblem<>(20,50,30).findMaximum());
    }

    @Test
    public void givenIntegerMaxNumber_WhenAtThirdPosition_ShouldReturnSameNumber() {
        Assert.assertEquals((Integer.valueOf(50)), new MaximumProblem<>(30,20,50).findMaximum());
    }

    /* Testing Float Value*/
    @Test
    public void givenFloatMaxNumber_WhenAtFirstPosition_ShouldReturnSameNumber() {
        Assert.assertEquals((Float.valueOf(50.2f)), new MaximumProblem<>(50.2f,20.2f,30.2f).findMaximum());
    }

    @Test
    public void givenFloatMaxNumber_WhenAtSecondPosition_ShouldReturnSameNumber() {
        Assert.assertEquals((Float.valueOf(50.2f)), new MaximumProblem<>(20.2f,50.2f,30.2f).findMaximum());
    }

    @Test
    public void givenFloatMaxNumber_WhenAtThirdPosition_ShouldReturnSameNumber() {
        Assert.assertEquals((Float.valueOf(50.2f)), new MaximumProblem<>(20.2f,30.2f,50.2f).findMaximum());
    }

    /* Testing String Value */
    @Test
    public void givenStringValue_WhenAtFirstPosition_ShouldReturnMaxStringValue() {
        Assert.assertEquals("Orange", new MaximumProblem<>("Orange","Apple","Banana").findMaximum());
    }

    @Test
    public void givenStringValue_WhenAtSecondPosition_ShouldReturnMaxStringValue() {
        Assert.assertEquals("Orange", new MaximumProblem<>("Apple","Orange","Banana").findMaximum());
    }

    @Test
    public void givenStringValue_WhenAtThirdPosition_ShouldReturnMaxStringValue() {
        Assert.assertEquals("Orange", new MaximumProblem<>("Orange","Apple","Banana").findMaximum());
    }

    /* Testing Optional Value */
    @Test
    public void givenIntegerMaxNumber_WhenAtFirstPosWithMultipleValues_ShouldReturnSameNumber() {
        Assert.assertSame(20, MaximumProblem.findMaximum(20, 10, 8, 6, 5));
    }

    @Test
    public void givenFloatMaxNumber_WhenAtFirstPosWithMultipleValues_ShouldReturnSameNumber() {
        Assert.assertEquals(Float.valueOf(10.2f), MaximumProblem.findMaximum(10.2f, 8.2f, 7.2f, 6.2f, 5.2f, 4.2f));
    }

    @Test
    public void givenStringMaxNumber_WhenAtFirstPosWithMultipleValues_ShouldReturnSameNumber() {
        Assert.assertEquals("Watermelon", MaximumProblem.findMaximum("Watermelon", "Apple", "Mango", "Orange", "Banana", "Pineapple"));
    }
}
