package Ordenamiento.util;

import java.util.*;
import java.util.stream.IntStream;

public class randomArray {
    public randomArray(){
    }
    public int[] cargaEnteros(int n){
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
    public double[] cargaDoubles(int n){
        double[] arreglo = new double[n];
        for(int i = 0;i<n;i++) arreglo[i] = Math.random();
        return arreglo;
    }
    public String[] cargaString(int n){
        Random random = new Random();
        String[] arreglo = new String[n];
        for(int i = 0;i<n;i++){
            String randomString = random.ints(97, 123).limit(10).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
                arreglo[i] = randomString;
        } 
        return arreglo;
    }
    public void impresion(int[] arreglo){
        System.out.println(Arrays.toString(arreglo));
    }
    public void impresionDouble(double[] arreglo){
        int i=0;
        while(i < arreglo.length){
            System.out.printf(" - "+"%.2f", arreglo[i]);
            i++;
        }
        System.out.println("");
    }  
    public void impresionString(String[] arreglo){
        System.out.println(Arrays.toString(arreglo));
    }
}
