package stack;

import java.util.EmptyStackException;

public interface List<T>{
    public boolean isEmpty();
    int size();
    void addToFront(T data);
    T removeFirst() throws EmptyListException;
}
