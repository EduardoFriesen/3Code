package practico.utils;

public class StackList<AnyType> {

    private Nodo<AnyType> root = null;
    /**
     * Indice del Array donde tenemos el ultimo elemento.
     */
    private Integer index;
    /**
     * Agrega el parametro a la pila
     * @param element
     */
    public void push(AnyType element){
        Nodo<AnyType> newNodo = new Nodo<AnyType>(element);
        root.next = newNodo;
        root = newNodo;
    }
    /**
     * Borramos y mostramos el ultimo elemento.
     * @return
     */
    public AnyType pop(){
        AnyType element = root.data;
        if(root == null) return null;
        root = root.next;
        return element;
    }
    /**
     * Muestra el ultimo elemento
     * @return
     */
    public AnyType top(){
        return root.data;
    }
    /**
     * Verifica si la pila esta vacia
     * @return
     */
    public boolean isEmpty(){
        return this.root == null ? true : false; 

    }

    public int size(){
        int count = 0;
        Nodo<AnyType> actual = this.root;
        while (actual !=null ){
            count++;
            actual = actual.next;
        }
        return count;
    }
    /**
     * Vacia la pila.
     */
    public void makeEmpty(){
        this.root = null;
    }
}
