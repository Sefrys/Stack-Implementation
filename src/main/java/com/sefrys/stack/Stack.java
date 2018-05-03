package com.sefrys.stack;

/**
 * Created by Ireneusz Zagan on 03.05.18, 19:00
 * Contact: sefrys@gmail.com
 */
public interface Stack<T> {
    void push(T number) throws Exception;
    T pop();
    T peek();
    Integer getStackCapacity();
    Integer getStackRemainingSlots();
    boolean isEmpty();
    boolean isFull();

}
