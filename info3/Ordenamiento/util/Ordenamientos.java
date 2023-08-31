package Ordenamiento.util;

public class Ordenamientos {
    public void insercionEnteros(int n){
        int[] arreglo = new int[n];
        int i = 0;
        int temp;
        int itera = 0;
        randomArray carga = new randomArray();
        arreglo = carga.cargaEnteros(n);
        System.out.println("Arreglo Desordenado");
        carga.impresion(arreglo);
        long time = System.nanoTime();
        for(i = 0;i<n-1;i++){
            while(arreglo[i+1] <= arreglo[i]){
                temp = arreglo[i];
                arreglo[i] = arreglo[i+1];
                arreglo[i+1] = temp;
                if(i!=0) i--;
            }
            itera++;
        }
        carga.impresion(arreglo);
        System.out.println("Tiempo Transcurrido: " + time);
        System.out.println("Iteraciones: " + itera);
    }
    public void insercionDoubles(int n){
        double[] arreglo = new double[n];
        int i = 0;
        double temp;
        int itera = 0;
        randomArray carga = new randomArray();
        arreglo = carga.cargaDoubles(n);
        System.out.println("Arreglo Desordenado");
        carga.impresionDouble(arreglo);
        long time = System.nanoTime();
        for(i = 0;i<n-1;i++){
            while(arreglo[i+1] <= arreglo[i]){
                temp = arreglo[i];
                arreglo[i] = arreglo[i+1];
                arreglo[i+1] = temp;
                if(i!=0) i--;
            }
            itera++;
        }
        System.out.println("Arreglo Ordenado");
        carga.impresionDouble(arreglo);
        System.out.println("Tiempo Transcurrido: " + time);
        System.out.println("Iteraciones: " + itera);
    }  
    public void insercionStrings(int n){
        String[] arreglo = new String[n];
        int i = 0;
        String temp;
        int itera = 0;
        randomArray carga = new randomArray();
        arreglo = carga.cargaString(n);
        System.out.println("Arreglo Desordenado");
        carga.impresionString(arreglo);
        long time = System.nanoTime();
        for(i = 0;i<n-1;i++){
            while(arreglo[i+1].compareTo(arreglo[i]) > 0){
                temp = arreglo[i];
                arreglo[i] = arreglo[i+1];
                arreglo[i+1] = temp;
                if(i!=0) i--;
            }
            itera++;
        }
        System.out.println("Arreglo Ordenado");
        carga.impresionString(arreglo);
        System.out.println("Tiempo Transcurrido: " + time);
        System.out.println("Iteraciones: " + itera);
    }  
    public void shellSortEnteros(int n){
       int[] arreglo = new int[n];
        int i = 0;
        int temp;
        int itera = 0;
        randomArray carga = new randomArray();
        arreglo = carga.cargaEnteros(n);
        System.out.println("Arreglo Desordenado");
        carga.impresion(arreglo);
        long time = System.nanoTime();
        int tam = (n/2)-1;
        for(i = 0;i<tam;i++){
            while(arreglo[i+tam] <= arreglo[i]){
                temp = arreglo[i];
                arreglo[i] = arreglo[i+1];
                arreglo[i+tam] = temp;
                if(i!=0) i--;
            }
            itera++;
        }
        carga.impresion(arreglo);
        System.out.println("Tiempo Transcurrido: " + time);
        System.out.println("Iteraciones: " + itera);
    }
}
