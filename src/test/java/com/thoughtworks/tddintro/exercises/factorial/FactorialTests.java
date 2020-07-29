package com.thoughtworks.tddintro.exercises.factorial;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/*

    * Change Factorial.compute() so that the first test passes and the remaining tests fail.
    * Change Factorial.compute() so that the first two tests pass and the remaining tests fail.
    ...
    * Change Factorial.compute() so that all of the tests pass.

 */

public class FactorialTests {

    private final Factorial factorial = new Factorial();

    @Test // Make me pass first
    //如果是1是要求返回1
    public void shouldReturnOneWhenNumberIsOne(){
        assertThat(new Factorial().compute(1), is(1));
    }

    @Test
    // 如果是2时要求返回2
    public void shouldReturnTwoWhenNumberIsTwo(){
        assertThat(factorial.compute(2), is(2));
    }

    @Test
    // 如果是0时要返回1
    public void shouldReturnOneWhenNumberIsZero(){
        assertThat(factorial.compute(0), is(1));
    }

    @Test
    // 如果是3时，返回6
    public void shouldReturnSixWhenNumberIsThree(){
        assertThat(factorial.compute(3), is(6));
    }

    @Test(expected = IllegalArgumentException.class)
    //如果是负数应该抛出 Illegal Argument Exception
    public void shouldThrowIllegalArgumentExceptionWhenNumberIsNegative(){factorial.compute(-1);}
}