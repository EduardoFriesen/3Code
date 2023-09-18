package practico.utils;

public class Nodo<AnyType> {

    AnyType data;
    Nodo<AnyType> next;
    Nodo<AnyType> back;

    public Nodo(AnyType data){
        this.data = data;
        this.next = null;
        this.back = null;
    }

}
