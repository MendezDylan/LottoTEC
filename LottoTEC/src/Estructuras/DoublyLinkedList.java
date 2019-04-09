/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;


/**
 *
 * @author jearo Esta clase permite generar una lista doblemente enlazada
 * totalmente funcional
 * @param <X>
 */
public class DoublyLinkedList<X>{

    /*
    Primeramente se declaran los atributos
     */
    private DoublyLinkedNode<X> head;
    private DoublyLinkedNode<X> tail;
    private int size;

    // SE GENERAN LOS GETTERS AND SETTER
    public DoublyLinkedNode<X> getHead() {
        return head;
    }

    public void setHead(DoublyLinkedNode<X> head) {
        this.head = head;
    }

    public DoublyLinkedNode<X> getTail() {
        return tail;
    }

    public void setTail(DoublyLinkedNode<X> tail) {
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

    /**
     * Permite insertar elementos dentro de la lista doblemente enlazada Por
     * convención se insertan detrás de la lista
     *
     * @param element
     */
    public void insert(X element) {
        if (isEmpty()) {
            head = new DoublyLinkedNode(element);
            tail = head;
            size++;
        } else {
            tail.setNext(new DoublyLinkedNode(element));
            tail.getNext().setPrev(tail);
            tail = tail.getNext();
            size++;
        }
    }
    
    public void insertNode(DoublyLinkedNode<X> node) {
        if (isEmpty()) {
            head = node;
            tail = head;
            size++;
        } else {
            tail.setNext(node);
            tail.getNext().setPrev(tail);
            tail = tail.getNext();
            size++;
        }
    }    

    /**
     * Permite consultar cualquier nodo de la lista según el elemento que
     * contenga el nodo siempre y cuandos ea idéntico al ingresado
     *
     * @param element
     * @return
     */
    public X consult(X element) {
        DoublyLinkedNode<X> temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.getElement() == element) {
                break;
            }
            else {
                temp = temp.getNext();
            }
        }
        return temp.getElement();
    }
    
    

    /**
     * Permite actualizar cualquier elemento de la lista
     *
     * @param initialElem // Parámetro inicial
     * @param replacedElem // Parámetro por el cual se quiere actualizar diho
     * elemento
     */
    public void update(X initialElem, X replacedElem) {
        DoublyLinkedNode<X> temp;
        DoublyLinkedNode<X> replacedNode, tempPrev, tempNext;
        temp = head;

        for (int i = 0; i < size; i++) {
            if (temp.getElement().equals(initialElem)) {
                tempPrev = temp.getPrev();
                tempNext = temp.getNext();

                replacedNode = new DoublyLinkedNode<>(replacedElem);
                tempPrev.setNext(replacedNode);
                tempNext.setPrev(replacedNode);
                replacedNode.setPrev(tempPrev);
                replacedNode.setNext(tempNext);

                temp.setPrev(null);
                temp.setNext(null);
                break;
            } else {
                temp = temp.getNext();
            }
        }
    }

    /**
     * Permite eleminar de frente
     */
    public void frontDelete() {
        DoublyLinkedNode<X> temp = head;
        head = head.getNext();
        temp.setNext(null);
        head.setPrev(null);
        size--;
    }

    /**
     * Permite eliminar detrás
     */
    private void rearDelete() {
        DoublyLinkedNode<X> temp = tail;
        tail = tail.getPrev();
        temp.setPrev(null);
        tail.setNext(null);
        size--;
    }

    /**
     * Permite eliminar un únco elemento de la lista
     *
     * @param element
     */
    private void deleteUniqueElement(X element) {
        if (head.getElement().equals(element)) {
            head = null;
            tail = head;
            size--;
        }
    }

    /**
     * Permite eliminar uno de los elementos de una lista de tamaño = 2
     *
     * @param element
     */
    private void deleteOnTowElements(X element) {
        if (head.getElement().equals(element)) {
            frontDelete();
        } else if (tail.getElement().equals(element)) {
            rearDelete();
        }
        size--;
    }

    /**
     * Permite eliminar elementos que se encuentran en medio de 2 nodos
     *
     * @param element
     */
    private void deleteOnMiddle(X element) {
        DoublyLinkedNode<X> temp;
        DoublyLinkedNode<X> tempNext, tempPrev;
        temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.getElement().equals(element)) {
                tempPrev = temp.getPrev();
                tempNext = temp.getNext();
                tempNext.setPrev(tempPrev);
                tempPrev.setNext(tempNext);
                temp.setNext(null);
                temp.setPrev(null);
                break;
            } else {
                temp = temp.getNext();
            }
        }
        size--;
    }

    /**
     * Permite a la´lógica elegir dónde eliminar un nodo
     *
     * @param element
     */
    public void delete(X element) {
        if (!isEmpty()) {
            if (tail.getElement().equals(element)) {
                rearDelete();
            } else if (head.getElement().equals(element)) {
                frontDelete();
            } else if (size == 1) {
                deleteUniqueElement(element);
            } else if (size == 2) {
                deleteOnTowElements(element);
            } else if (size >= 3) {
                deleteOnMiddle(element);
            }
        }
    }

    /**
     * Por convención el toString permite conocer los elementos de la lista
     *
     * @return
     */
    @Override
    public String toString() {
        String msg = "";
        DoublyLinkedNode<X> temp = head;
        for (int i = 0; i < size; i++) {
            msg += temp.toString();
            temp = temp.getNext();
        }
        return msg;
    }

    /**
     * Permite conocer los elementos de la lista al reverso
     *
     * @return
     */
    public String toStringReverse() {
        String msg = "";
        DoublyLinkedNode<X> temp = tail;
        for (int i = 0; i < size; i++) {
            msg += temp.toString() + "   ";
            temp = temp.getPrev();
        }
        return msg;
    }
}