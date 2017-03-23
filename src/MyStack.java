import java.util.EmptyStackException;

public class MyStack<T> {

    private class Node {
        Node next = null;;
        T data = null;

        public Node(){};

        public Node(T data) {
            this.data = data;
        }

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node top;

    public MyStack() {}

    public T peek() {
        if (top == null) {
            throw new EmptyStackException();
        }

        return top.data;
    }

    public T push(T item) {
        Node newNode = new Node(item, top);
        top = newNode;
        return top.data;
    }

    public T pop() {
        if (top == null) {
            throw new EmptyStackException();
        }

        Node popped = top;
        top = top.next;
        return popped.data;
    }
}
