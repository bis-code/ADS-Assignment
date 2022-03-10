public class Node<T>{
    private T data;
    private Node node;

    public Node()
    {
        data = ; //todo
        node = new Node();
    }

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
