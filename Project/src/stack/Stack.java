package stack;

import java.util.EmptyStackException;

public interface Stack<T> {
    public boolean isEmpty();
    void push(T element);
    Object pop() throws EmptyStackException;
}
