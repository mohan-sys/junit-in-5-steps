package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MyMathTest {
    MyMath math = new MyMath();

    @Test
    void calculateSum_ThreeMemberArray(){

        assertEquals(6, math.calculateSum(new int[]{1, 2, 3}));
    }

    @Test
    void calculateSum_ZeroMemberArray(){

        assertEquals(0, math.calculateSum(new int[]{}));
    }

    @Test
    void testAsserts(){

        assertArrayEquals(new int[]{1 , 2}, new int[]{2, 1});
    }



}