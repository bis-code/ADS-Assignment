package stack;

import java.util.EmptyStackException;

public class LinkedStack<T> implements Stack<T>{
    private LinkedList<T> list;

    public LinkedStack()
    {
        list = new LinkedList<>();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(Object element) {
        list.addToFront(element);
    }

    @Override
    public Object pop() throws EmptyStackException {
        try{
            return list.removeFirst();
        }
        catch (EmptyListException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
