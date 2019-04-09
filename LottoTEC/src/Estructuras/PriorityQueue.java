package Estructuras;

import GUI.PantallaPrincipal;
import GestionarUsuario.SorteosFuturos;
import GestionarUsuario.Tiquete;
import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.GregorianCalendar;

public class PriorityQueue<X> {

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

    public PriorityQueue() {
        this.head = new QueueNode<>();
        this.tail = head;
    }
    
    
    
    public void append(X element) {
        if (isEmpty()) {
            QueueNode<X> node= new QueueNode<>(element);
            head.setNextNode(node);
            tail = head.getNextNode();
            size++;
        } else {
            tail.setNextNode(new QueueNode<>(element));
            tail = tail.getNextNode();
            size++;
        }
    }
    
    //encola dandole prioridad a los sorteos mas inmediatos PARA SORTEOS
    public void insertPriorityDateSorteo(SorteosFuturos sorteo) {
        QueueNode<SorteosFuturos> nodeToInsert=new QueueNode(sorteo);
        QueueNode<SorteosFuturos> tempNode=(QueueNode<SorteosFuturos>) head;
        if (isEmpty()) {
            append((X) sorteo);
        }else {
            while(tempNode.getNextNode()!=null){
                //si la comparacion devuelve -1 es porque el elemento que se desea agregar tiene fecha menor al nodo temporal
                if(sorteo.getFechaSorteo().compareTo(tempNode.getNextNode().getElement().getFechaSorteo())==-1){
                    nodeToInsert.setNextNode(tempNode.getNextNode());
                    tempNode.setNextNode(nodeToInsert);
                    size++;
                    break;
                }
                tempNode=tempNode.getNextNode();
            }
            if(tempNode.getNextNode()==null){
                append((X) sorteo);
            }  
        }
    }
    
    //encola dandole prioridad a los sorteos mas inmediatos PARA TIQUETES
    public void insertPriorityDateTiquete(Tiquete tiquete) {
        QueueNode<Tiquete> nodeToInsert=new QueueNode(tiquete);
        QueueNode<Tiquete> tempNode=(QueueNode<Tiquete>) head;
        if (isEmpty()) {
            append((X) tiquete);
        }else {
            while(tempNode.getNextNode()!=null){
                //si la comparacion devuelve -1 es porque el elemento que se desea agregar tiene fecha menor al nodo temporal
                if(tiquete.getSorteo().getFechaSorteo().compareTo(tempNode.getNextNode().getElement().getSorteo().getFechaSorteo())==-1){
                    nodeToInsert.setNextNode(tempNode.getNextNode());
                    tempNode.setNextNode(nodeToInsert);
                    size++;
                    break;
                }
                //si la comparacion devuelve 0 es porque son iguales fechas
                if (tiquete.getSorteo().getFechaSorteo().compareTo(tempNode.getNextNode().getElement().getSorteo().getFechaSorteo())==0){
                    tempNode=tempNode.getNextNode();
                    nodeToInsert.setNextNode(tempNode.getNextNode());
                    tempNode.setNextNode(nodeToInsert);
                    size++;
                    break;                    
                }
                //si la comparacion devuelve 1 es porque el elemento tiene fecha mayor que el nodo temporal
                if (tiquete.getSorteo().getFechaSorteo().compareTo(tempNode.getNextNode().getElement().getSorteo().getFechaSorteo())==1)
                {
                    tempNode=tempNode.getNextNode();
                }
            }
            if(tempNode.getNextNode()==null){
                append((X) tiquete);
            }  
        }
    }
    
    public void insertPriorityAge(Tiquete tiquete){
        if (isEmpty()){
            append((X) tiquete);
        }else{
            QueueNode<Tiquete> nodeToInsert=new QueueNode<>(tiquete);
            QueueNode<Tiquete> tempNode=(QueueNode<Tiquete>) head;
            GregorianCalendar fechaActual=new GregorianCalendar();
            //edad del usuario que esta comprando
            int annos=(fechaActual.get(1)-nodeToInsert.getElement().getUsuario().getFechaNacimiento().get(1));
            //si es mayor se inserta al final de la ultima persona mayor a 65 annos
            if(annos>=65){
                while(tempNode.getNextNode()!=null){
                    if (((tempNode.getNextNode().getElement().getUsuario().getFechaNacimiento().get(1))-fechaActual.get(1))<65){
                        nodeToInsert.setNextNode(tempNode.getNextNode());
                        tempNode.setNextNode(nodeToInsert);
                        size++;
                        break;                       
                    }
                    tempNode=tempNode.getNextNode();
                }   
            }
            //si la persona es menor de 65 se inserta al final de la cola
            else{
                append((X) tiquete);
            }
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

    public void delete() {
        head = head.getNextNode();
        size--;
    }

    @Override
    public String toString() {
        String msg = "";
        QueueNode<X> temp = head.getNextNode();
        for (int i = 0; i < size; i++) {
            msg += temp.toString();
            temp = temp.getNextNode();
        }
        return msg;
    }

}
