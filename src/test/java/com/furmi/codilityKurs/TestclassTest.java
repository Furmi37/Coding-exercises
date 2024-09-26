package com.furmi.codilityKurs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestClassTest {
    private TestClass testClass = new TestClass();
    @Test
    void shouldReturnTheSameArrayWhenKIsZeroWhenCallSolution (){
        //given
        int [] expected = new int[]{1,2,3,4,5};
        int [] arr = new int[]{1,2,3,4,5};
        int K = 0;
        //when
        int[] result = testClass.solution(arr, K);
        //then
        assertArrayEquals(expected,result);
    }
    @Test
    void shouldRotateArrayFourTimesWhenCallSolution (){
        //given
        int [] expected = new int[]{2,3,4,5,1};
        int [] arr = new int[]{1,2,3,4,5};
        int K = 4;
        //when
        int[] result = testClass.solution(arr, K);
        //then
        assertArrayEquals(expected,result);
    }
}