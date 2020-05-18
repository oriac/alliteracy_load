package com.exercices.load;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;


public class LoadApplicationTest
{
    LoadApplication balancer = new LoadApplication();

    @Test
    public void testArrayWithLessThanFiveElementsReturnFalse()
    {
        List<Integer> request = Arrays.asList(1, 2, 3);
        assertFalse(balancer.itCanBeBalanced(request));
    }

    @Test
    public void testBasicFail()
    {
        List<Integer> request = Arrays.asList(1, 1, 1, 1, 1, 1);
        assertFalse(balancer.itCanBeBalanced(request));
    }

    @Test
    public void testBasicSuccess()
    {
        List<Integer> request = Arrays.asList(1, 1, 1, 1, 1);
        assertTrue(balancer.itCanBeBalanced(request));
    }

    @Test
    public void testComplexSuccess()
    {
        List<Integer> request = Arrays.asList(1, 3, 4, 2, 2, 2, 1, 1, 2);
        assertTrue(balancer.itCanBeBalanced(request));
    }

    @Test
    public void testComplexSuccessTwo()
    {
        List<Integer> request = Arrays.asList(1, 1, 1, 1, 1, 1, 5, 1, 5);
        assertTrue(balancer.itCanBeBalanced(request));
    }

    @Test
    public void testComplexSuccessThree()
    {
        List<Integer> request = Arrays.asList(5, 1, 5, 1, 1, 1, 1, 1, 1);
        assertTrue(balancer.itCanBeBalanced(request));
    }
}