package practico.listas;

import java.util.Scanner;

import practico.utils.QueueList;

public class EjerciciosColas {
    public void sumaEnteros() throws Exception{
        int numero = 0;
        int suma=0;
        QueueList<Integer> cola = new QueueList<Integer>();
        try (Scanner teclado = new Scanner(System.in)) {
            do{
                System.out.println("Ingrese un valor");
                numero = teclado.nextInt();
                if(numero != 0)cola.enqueue(numero);
            }while(numero != 0);
        }
        while(!cola.isEmpty()){
            numero = cola.dequeue();
            if(!cola.isEmpty()){
                System.out.println("  "+numero);
                System.out.println("+");
                suma = suma + numero;
            }else{
                System.out.println("  "+numero);
                suma = suma + numero;
            }
        }
        System.out.println("_________");
        System.out.println(suma);
    }
    public void ordenamientoNumeros() throws Exception{
        int ultimo;
        QueueList<Integer> cola = new QueueList<Integer>();
        QueueList<Integer> colaAux = new QueueList<Integer>();
        try (Scanner teclado = new Scanner(System.in)) {
            do{
                System.out.println("Ingrese un valor");
                ultimo = teclado.nextInt();
                if(ultimo != 0)cola.enqueue(ultimo);
            }while(ultimo != 0);
        }
        System.out.println("COLA DESORDENADA");
        while(!cola.isEmpty()){
            int aux = cola.dequeue();
            colaAux.enqueue(aux); 
            if(!cola.isEmpty()){
                System.out.println(colaAux.getFront());
            }
        }
        cola = colaAux;
        System.out.println("COLA ORDENADA");
        for (int i = 0; i < cola.size() - 1; i++) {
            for (int j = 0; j < cola.size() - i - 1; j++) {
                int primero = cola.dequeue();
                int segundo = cola.dequeue();
                if (primero > segundo) {
                    cola.enqueue(segundo);
                    cola.enqueue(primero);
                } else {
                    cola.enqueue(primero);
                    cola.enqueue(segundo);
                }
            }
        }
        while(!cola.isEmpty()){
            colaAux.enqueue(cola.dequeue()); 
            if(!cola.isEmpty()){
                System.out.println(colaAux.getFront());
            }
        }
    }
}

