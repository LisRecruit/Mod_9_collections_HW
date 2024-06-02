import java.util.Objects;

public class MyLinkedList <T>{
    private MyLinkedList.Node<T> head;
    private MyLinkedList.Node<T> tail;
    private int size;


    static class Node <T>{
        T element;
        MyLinkedList.Node<T> next;
        MyLinkedList.Node<T> prev;

        public Node (T element){
            this.element=element;
        }

    }
    public void add (T element) {
        MyLinkedList.Node<T> newNode = new MyLinkedList.Node<>(element);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void remove (int index) {
        Objects.checkIndex(index, size);
        MyLinkedList.Node<T> current = head;
        if (index==0){

            head = head.next;
            head.prev=null;
            size--;

        } else if (index == size-1){

            tail=tail.prev;
            tail.next=null;
            size--;

        } else {
            for (int i =0; i<index;i++){
                current=current.next;
            }
            T element = current.element;
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
        }
        System.gc();
    }

    public T get (int index){
        Objects.checkIndex(index, size);
        if(index == 0 && head != null) {
            return head.element;
        }
        MyLinkedList.Node<T> current = head;
        for (int i=0;i<index;i++){

            current = current.next;
        }
        return current.element;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
        System.gc();
    }
    public int size (){
        return size;
    }
}
