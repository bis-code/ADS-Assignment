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
    public void push(T element) {
        list.addToFront(element);
    }

    @Override
    public T pop() throws EmptyStackException {
        return list.removeFirst();
    }
}
