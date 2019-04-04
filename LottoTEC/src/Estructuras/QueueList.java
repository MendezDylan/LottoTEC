
package Estructuras;


public class QueueList<X> {

    QueueNode<X> head, tail;
    int size;

    public QueueNode<X> getHead() {
        return head;
    }

    public void setHead(QueueNode<X> head) {
        this.head = head;
    }

    public QueueNode<X> getTail() {
        return tail;
    }

    public void setTail(QueueNode<X> tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insert(X element) {
        if (isEmpty()) {
            head = new QueueNode<>(element);
            tail = head;
            size++;
        } else {
            tail.setNextNode(new QueueNode<>(element));
            tail = tail.getNextNode();
            size++;
        }
    }

    public X consult(X element) {
        QueueNode<X> temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.getElement().equals(element)) {
                break;
            } else {
                temp = temp.getNextNode();
            }
        }
        return temp.getElement();
    }

    public void update(X initialElem, X replacedElem) {
        QueueNode<X> temp, tempPrev, tempNext, tempNew;
        temp = head;

        for (int i = 0; i < size; i++) {
            if (temp.getNextNode().equals(initialElem)) {
                tempPrev = temp;
                temp = temp.getNextNode();
                tempNext = temp.getNextNode();
                tempNew = new QueueNode<>(replacedElem);
                tempPrev.setNextNode(tempNew);
                tempNew.setNextNode(tempNext);
                temp.setElement(null);
            } else {
                temp = temp.getNextNode();
            }
        }
    }

    public void delete(X element) {
        QueueNode<X> temp = head;
        head = head.getNextNode();
        temp.setNextNode(null);
        size--;
    }

    @Override
    public String toString() {
        String msg = "";
        QueueNode<X> temp = head;
        for (int i = 0; i < size; i++) {
            msg += temp.toString();
            temp = temp.getNextNode();
        }
        return msg;
    }

}
