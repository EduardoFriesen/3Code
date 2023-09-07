package practico.utils;
public class Stack<AnyType> {
    
    /**
     * Indice de array en donde tenemos el ultimo elemnto.
     */
    private Integer index;

    /**
     * Tamaño del arreglo.
     */
    private Integer size;

    /**
     * 
     * Arreglo.
     */
    private AnyType array[];

    /**
     * Constructor
     */
     public Stack(Integer size){
        this.size = size;
        this.index = 0;
        this.array = (AnyType[]) new Object[size];
     }

     /**
     * Agrega un elemento a la pila
     */
    public void push(AnyType elemt) throws Exception {
        if (this.isFull()){
            throw new Exception("La pila esta completa");
        }
        this.array[this.index] = elemt;
        this.index++;
    }

    /**
     * Elimina un elemento
     */
    public AnyType pop() throws Exception {
        if (this.isEmpty()){
            throw new Exception("La pila esta vacia");
        }
        this.index--;
        return this.array[index];
    }

    /**
     * Retorna el ultimo valor ingresado en la pila
     * @return
     */
    public AnyType top() {
        return this.array[index-1];
    }

    public Boolean isEmpty(){
        if(this.index != 0){
            return false;
        }
        return true;
    }
    /**
     * @return Retornamos si la pila esta vacia.
     */
    public void makeEmpty() {
        this.index = 0;
    }
    /**
     * @return Retornamos si la pila esta llena.
     */
    public Boolean isFull(){
        if(this.index == this.size){
            return true;
        }
        return false; 
    }
}
