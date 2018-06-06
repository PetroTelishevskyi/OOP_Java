package ua.lpnuai.oop.telishevskyi11;

class LinkedList<E> {
    private Node<E> tail;
    private Node head;
    private int size = 0;

    public LinkedList() {

    }

    public void add(E data) {
        Node<E> newNode = new Node<E>();
        newNode.setData(data);

        if (size == 0)
            head = newNode;
        else
            tail.setNext(newNode);

        tail = newNode;
        size++;
    }

    public E get(int index) {
        Node<E> n = findNodeByIndex(index);
        return n.getData();
    }

    public boolean delete(int index) {
        if (findNodeByIndex(index) != null ) {

            if (index != 0)
                findNodeByIndex(index - 1).setNext(findNodeByIndex(index+1));
            else
                head = head.getNext();

            size--;
            return true;
        }
        return false;
    }

    public void clean(){
        int s = size;
        for (int i = 0; i < s; i++) {
            delete(0);
        }
    }

    public int size() {
        return size;
    }

    private Node<E> findNodeByIndex(int index) {
        if (index < size && index >= 0) {
            Node<E> curNode = head;
            int curIndex = 0;
            while (curIndex < index){
                if (curNode.getNext() != null) {
                    curNode = curNode.getNext();
                    curIndex++;
                }

            }
            return curNode;
        }
        else
            return null;
    }

    public String toString() {
        StringBuilder resultString = new StringBuilder("[");

        for (int i = 0; i < size; i++) {
            resultString.append(get(i));

            if (i < size-1) resultString.append(", ");
        }
        resultString.append("]");
        return resultString.toString();
    }
    public Object[] toArray() {
        Object[] result = new Object[size];
        int i = 0;
        for (Node<E> x = head; x != null; x = x.getNext())
            result[i++] = x.getData();
        return result;
    }
}