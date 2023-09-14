package practico.utils;

public class Queue<AnyType> {
    /**
     * Indice de array en donde tenemos el ultimo elemnto.
     */
    private Integer index;

    /**
     * Tamaño del arreglo.
     */
    private Integer size;

    /**
     * Tamaño del arreglo.
     */
    private Integer tope;

    /**
     * 
     * Arreglo.
     */
    private AnyType array[];

    /**
     * Constructor
     */
    public Queue(Integer size){
        this.size = size;
        this.tope = 0;
        this.index = 0;
        this.array = (AnyType[]) new Object[size];
    }

    public void enqueue (AnyType elemnt) throws Exception{
        if (this.isFull()){
            throw new Exception("La pila esta completa");
        }
        this.array[this.index] = elemnt;
        this.index++;
    }
    public AnyType getFront() throws Exception{
        if (this.isEmpty()){
            throw new Exception("La cola esta vacia");
        }
        return this.array[tope];
    }
    public AnyType dequeue() throws Exception{
        if (this.isEmpty()){
            throw new Exception("La cola esta vacia");
        }
        this.tope++;
        return this.array[tope];
    }
    public Boolean isEmpty() {
        if(this.index == 0){
            return false;
        }
        return true;
    }
    public Boolean isFull() {
        if(this.index != tope){
            return false;
        }
        return true;
    }
    
}
