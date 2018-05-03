package com.sefrys.stack;

import java.util.EmptyStackException;

/**
 * Created by Ireneusz Zagan on 03.05.18, 19:12
 * Contact: sefrys@gmail.com
 */
public class StackArray<T> implements Stack<T> {

    private int maxCapacity;
    private Object[] array;
    private int top;

    StackArray(int maxCapacity) {

        this.maxCapacity = maxCapacity;
        this.array = new Object[maxCapacity];
        this.top = -1;

    }

    /**
     * Adds an object to the array at index of top.
     * @param object added to the top of stack
     */
    public void push(T object) throws Exception {

        if(top + 1 < maxCapacity) {

            top++;

            array[top] = object;

        } else {

            throw new Exception("Stack is full");

        }

    }

    /**
     * Removes an object from the array at index of top
     * Decrements the top value by one
     * @return element from top of stack
     */
    public T pop() {

        if(this.isEmpty()) {

            throw new EmptyStackException();

        }

        return element(top--);

    }

    /**
     * Retrieves the object from the array at index of top
     * @return top element of stack
     */
    public T peek() {

        if(this.isEmpty()) {

            throw new EmptyStackException();

        }

        return element(top);

    }

    /**
     * Getter for max capacity of stack
     * @return int value of stack's size
     */
    public Integer getStackCapacity() {

        return maxCapacity;

    }

    /**
     * Getter for remaining stack capacity
     * @return int value
     */
    public Integer getStackRemainingSlots() {
        return maxCapacity - top - 1;

    }

    /**
     * Check if stack is empty
     * @return true if top is -1
     */
    public boolean isEmpty() {

        return top == -1;

    }

    /**
     * Check if stack is full
     * @return return true if top is maxCapacity - 1
     */
    public boolean isFull() {

        return top == maxCapacity - 1;

    }

    /**
     * Safe because push(T) is always checked.
     */
    @SuppressWarnings("unchecked")
    private T element(int index) {

        return (T)array[index];

    }
}
