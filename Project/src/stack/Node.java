package stack;

public class Node<T>{
    private T data;
    private Node node;

    public void setData(T data)
    {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setNext(Node node)
    {
        this.node = node;
    }

    public Node getNext()
    {
        return node;
    }
}
