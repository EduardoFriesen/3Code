package practico.utils;
import java.util.*;

public class QueueList<AnyType> {
    /**
     * Indice de array en donde tenemos el ultimo elemnto.
     */
    private Nodo<AnyType> primero;
    private Nodo<AnyType> ultimo;
    private int tam;

    /**
     * Constructor
     */
    public QueueList(){
        this.primero = null;
        this.ultimo = null;
        this.tam = 0;
    }

    public void enqueue (AnyType element) throws Exception{
        Nodo<AnyType> newNodo = new Nodo<AnyType>(element);
        if(this.isEmpty()){
            primero = newNodo;  
            primero.back = ultimo;
        }else{
            ultimo.back = newNodo;
        }
            ultimo = newNodo;
            tam++;
    }
    public int size(){
        return tam;
    }
    public AnyType getFront() throws Exception{
        AnyType element = primero.data;
        return element;
    }
    public AnyType getBack() throws Exception{
        AnyType element = ultimo.data;
        return element;
    }
    public AnyType dequeue() throws Exception{
        if (this.isEmpty()){
            throw new Exception("La cola esta vacia");
        }
        AnyType element = primero.data;
        primero = primero.back;
        return element;
    }
    public Boolean isEmpty() {
        if(this.primero != null){
            return false;
        }
        return true;
    }
    public Boolean isFull() {
        if(this.primero != ultimo){
            return false;
        }
        return true;
    }
}
