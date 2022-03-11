package stack;

import java.util.EmptyStackException;

public class LinkedList<T> implements List<T>{

    public Node<T> head;
    public int size;

    public LinkedList()
    {
        head = new Node();
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
    public void addToFront(Object data) {
        Node new_node = new Node();
        new_node.setData(data);
        new_node.setNext(head);
        head = new_node;
        size++;
    }

    @Override
    public T removeFirst() throws EmptyStackException, EmptyListException {
        Node<T> temporaryNode = new Node<>();
        try{
            temporaryNode = head;
            head = head.getNext();
            size --;
            return temporaryNode.getData();
        }
        catch (Exception e)
        {
            throw new EmptyListException("The list is empty!");
        }
    }
}
