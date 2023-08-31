package Recursividad.Ejercicio1.util;

import java.util.*;
import java.util.stream.IntStream;

public class randomArray {
    public randomArray(){
    }
    public int[] carga(int n){
        int[] arreglo = IntStream.rangeClosed(1, n).toArray();
        Random r = new Random();
        for (int i = arreglo.length; i > 0; i--) {
            int posicion = r.nextInt(i);
            int tmp = arreglo[i-1];
            arreglo[i - 1] = arreglo[posicion];
            arreglo[posicion] = tmp;
        }
        return arreglo;
    }
    public void impresion(int[] arreglo){
        System.out.println(Arrays.toString(arreglo));
    }     
}
