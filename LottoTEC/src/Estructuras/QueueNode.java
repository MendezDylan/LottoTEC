
package Estructuras;

public class QueueNode<X> {
    private X element;
    private QueueNode<X> nextNode;

    public X getElement() {
        return element;
    }

    public void setElement(X element) {
        this.element = element;
    }

    public QueueNode<X> getNextNode() {
        return nextNode;
    }

    public void setNextNode(QueueNode<X> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return ""+element;
    }

    public QueueNode(X element) {
        this.element = element;
    }

    public QueueNode() {
        this.element=null;
        this.nextNode=null;
    }
    
    
    
    
    
}
