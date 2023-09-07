package practico.utils;
import practico.utils.*;

public class PruebaPila {
    public void prueba(){
        Stack<String> pila = new Stack<String>(3);
        pila.push("Hola");
        pila.push("a");
        pila.push("todos");
        if(pila.isEmpty() == false){
            System.out.println("La pila no esta vacia");
        }else{
            System.out.println("Pila vacia");
        }
        if(pila.isFull() == false){
            System.out.println("La pila no esta llena");
        }else{
            System.out.println("Pila llena");
        }
        System.out.println("Tope de pila" + pila.top());
        System.out.println("Elementos de pila" + pila.pop() + pila.pop());
        if(pila.isEmpty() == false){
            System.out.println("La pila no esta vacia");
        }else{
            System.out.println("Pila vacia");
        }
        if(pila.isFull() == false){
            System.out.println("La pila no esta llena");
        }else{
            System.out.println("Pila llena");
        }
        System.out.println("Elementos de pila" + pila.pop());
        if(pila.isEmpty() == false){
            System.out.println("La pila no esta vacia");
        }else{
            System.out.println("Pila vacia");
        }
        if(pila.isFull() == false){
            System.out.println("La pila no esta llena");
        }else{
            System.out.println("Pila llena");
        }
        pila.pop();
    }
}
