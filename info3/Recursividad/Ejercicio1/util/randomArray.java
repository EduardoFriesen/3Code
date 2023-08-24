package Recursividad.Ejercicio1.util;

import java.util.*;

public class randomArray {
    public randomArray(){
    }
    public int[] carga(int n, int b){
        int[] arreglo = new int[n];
        Random r = new Random();
        Arrays.stream(r.ints(n, 0, b).distinct().toArray()).forEach(i -> arreglo[i] = i);
        return arreglo;
    }
    public void impresion(int[] arreglo){
        System.out.println(Arrays.toString(arreglo));
    }     
}
