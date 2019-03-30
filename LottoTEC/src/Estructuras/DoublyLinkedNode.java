
package Estructuras;

public class DoublyLinkedNode<X> {

    /**
     * Se declaran los atriburos necesarios de la estructura
     */
    private X element;
    private DoublyLinkedNode<X> prev;
    private DoublyLinkedNode<X> next;

    // SE GENERAN LOS GETTERS AND SETTERS
    public X getElement() {
        return element;
    }

    public void setElement(X element) {
        this.element = element;
    }

    public DoublyLinkedNode<X> getPrev() {
        return prev;
    }

    public void setPrev(DoublyLinkedNode<X> prev) {
        this.prev = prev;
    }

    public DoublyLinkedNode<X> getNext() {
        return next;
    }

    public void setNext(DoublyLinkedNode<X> next) {
        this.next = next;
    }

    /**
     * CONSTRUCROE DE LA CLASE
     *
     * @param element
     */
    public DoublyLinkedNode(X element) {
        this.element = element;
    }

    /**
     * El toString permite dar a conocer el elemento que contiene dicho nodo
     *
     * @return
     */
    @Override
    public String toString() {
        return "element=" + element;
    }

}