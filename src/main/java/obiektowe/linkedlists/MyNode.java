package obiektowe.linkedlists;

public class MyNode<E> {
    public E value = null;
    public MyNode<E> next = null;
    public MyNode(E element, MyNode<E> next) {
        this.value = element;
        this.next = next;
    }

    public void setNext(MyNode<E> next) {
        this.next = next;
    }
}
