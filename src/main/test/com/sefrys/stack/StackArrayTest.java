package com.sefrys.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ireneusz Zagan on 03.05.18, 19:43
 * Contact: sefrys@gmail.com
 */
class StackArrayTest {

    @Test
    void testNoRemainingSlots() throws Exception {

        StackArray<Integer> stack = new StackArray<Integer>(2);

        stack.push(1);
        stack.push(2);

        Integer expected = 0;
        Integer actual = stack.getStackRemainingSlots();

        assertEquals(expected, actual);

    }

    @Test
    void testStackIsEmpty() {

        StackArray<Integer> stack = new StackArray<Integer>(2);

        assertTrue(stack.isEmpty());
    }

    @Test
    void testStackIsNotEmpty() throws Exception {

        StackArray<Integer> stack = new StackArray<Integer>(2);

        stack.push(1);

        assertFalse(stack.isEmpty());
    }

    @Test
    void testStackIsFull() throws Exception {

        StackArray<Integer> stack = new StackArray<Integer>(2);

        stack.push(1);
        stack.push(1);

        assertTrue(stack.isFull());
    }

    @Test
    void testPeek() throws Exception {

        StackArray<String> stack = new StackArray<String>(5);

        stack.push("I'm on bottom");
        stack.push("I'm in the middle");
        stack.push("I'm on top");

        assertEquals("I'm on top", stack.peek());
    }

}