import java.util.EmptyStackException;

public class LinkedList<T> implements List<T>{

    public Node<T> head;
    public int size;

    public LinkedList()
    {
        head = new Node<>();
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size != 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void addToFront(T data) {
        head.setData(data);
        size++;
    }

    @Override
    public T removeFirst() throws EmptyStackException {
        return T; //todo
    }
}
