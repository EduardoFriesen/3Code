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
        int salto = (n/2)-1;
        for(i = 0; (i+salto)<n ;i++){
            while(arreglo[i+salto] < arreglo[i]){
                temp = arreglo[i];
                arreglo[i] = arreglo[i+salto];
                arreglo[i+salto] = temp;
                if(i!=0) i--;
                if(salto != 1) salto--;
            }
            itera++;
        }
        carga.impresion(arreglo);
        System.out.println("Tiempo Transcurrido: " + time);
        System.out.println("Iteraciones: " + itera);
    }
    public void shellSortDouble(int n){
        double[] arreglo = new double[n];
        int i = 0;
        double temp;
        int itera = 0;
        randomArray carga = new randomArray();
        arreglo = carga.cargaDoubles(n);
        System.out.println("Arreglo Desordenado");
        carga.impresionDouble(arreglo);
        long time = System.nanoTime();
        int salto = (n/2)-1;
        for(i = 0; (i+salto)<n ;i++){
            while(arreglo[i+salto] < arreglo[i]){
                temp = arreglo[i];
                arreglo[i] = arreglo[i+salto];
                arreglo[i+salto] = temp;
                if(i!=0) i--;
                if(salto != 1) salto--;
            }
            itera++;
        }
        carga.impresionDouble(arreglo);
        System.out.println("Tiempo Transcurrido: " + time);
        System.out.println("Iteraciones: " + itera);
    }
    public void shellSortString(int n){
        String[] arreglo = new String[n];
        int i = 0;
        String temp = "";
        int itera = 0;
        randomArray carga = new randomArray();
        arreglo = carga.cargaString(n);
        System.out.println("Arreglo Desordenado");
        carga.impresionString(arreglo);
        long time = System.nanoTime();
        int salto = (n/2)-1;
        for(i = 0; (i+salto)<n ;i++){
            while(arreglo[i+salto].compareTo(arreglo[i]) > 0){
                temp = arreglo[i];
                arreglo[i] = arreglo[i+salto];
                arreglo[i+salto] = temp;
                if(i!=0) i--;
                if(salto != 1) salto--;
            }
            itera++;
        }
        carga.impresionString(arreglo);
        System.out.println("Tiempo Transcurrido: " + time);
        System.out.println("Iteraciones: " + itera);
    }
    public void quickSortEnteros(int n){
        randomArray carga = new randomArray();
        int[] arreglo = new int[n];
        int inicio = 0;
        int fin = n-1;
        arreglo = carga.cargaEnteros(n);
        System.out.println("Arreglo Desordenado");
        carga.impresion(arreglo);
        quickSortInt(arreglo, inicio, fin);
        System.out.println("Arreglo Ordenado");
        carga.impresion(arreglo);

    }
    public void quickSortInt(int vec[], int inicio, int fin){
        if(inicio>=fin) return;
                int pivote=vec[inicio];
                int elemIzq=inicio+1;
                int elemDer=fin;
                while(elemIzq<=elemDer){
                        while(elemIzq<=fin && vec[elemIzq]<pivote){
                                elemIzq++;
                        }
                        while(elemDer>inicio && vec[elemDer]>=pivote){
                                elemDer--;
                        }
                        if(elemIzq<elemDer){
                                int temp=vec[elemIzq];
                                vec[elemIzq]=vec[elemDer];
                                vec[elemDer]=temp;
                        }
                }
                
                if(elemDer>inicio){
                        int temp=vec[inicio];
                        vec[inicio]=vec[elemDer];
                        vec[elemDer]=temp;
                }
                quickSortInt(vec, inicio, elemDer-1);
                quickSortInt(vec, elemDer+1, fin);
    }
    public void quickSortDoubles(int n){
        randomArray carga = new randomArray();
        double[] arreglo = new double[n];
        int inicio = 0;
        int fin = n-1;
        arreglo = carga.cargaDoubles(n);
        System.out.println("Arreglo Desordenado");
        carga.impresionDouble(arreglo);
        quickSortDou(arreglo, inicio, fin);
        System.out.println("Arreglo Ordenado");
        carga.impresionDouble(arreglo);

    }
    public void quickSortDou(double vec[], int inicio, int fin){
        if(inicio>=fin) return;
                double pivote=vec[inicio];
                int elemIzq=inicio+1;
                int elemDer=fin;
                while(elemIzq<=elemDer){
                        while(elemIzq<=fin && vec[elemIzq]<pivote){
                                elemIzq++;
                        }
                        while(elemDer>inicio && vec[elemDer]>=pivote){
                                elemDer--;
                        }
                        if(elemIzq<elemDer){
                                double temp=vec[elemIzq];
                                vec[elemIzq]=vec[elemDer];
                                vec[elemDer]=temp;
                        }
                }
                
                if(elemDer>inicio){
                        double temp=vec[inicio];
                        vec[inicio]=vec[elemDer];
                        vec[elemDer]=temp;
                }
                quickSortDou(vec, inicio, elemDer-1);
                quickSortDou(vec, elemDer+1, fin);
    }
    public void quickSortStrings(int n){
        randomArray carga = new randomArray();
        String[] arreglo = new String[n];
        int inicio = 0;
        int fin = n-1;
        arreglo = carga.cargaString(n);
        System.out.println("Arreglo Desordenado");
        carga.impresionString(arreglo);
        quickSortStr(arreglo, inicio, fin);
        System.out.println("Arreglo Ordenado");
        carga.impresionString(arreglo);

    }
    public void quickSortStr(String vec[], int inicio, int fin){
        if(inicio>=fin) return;
                String pivote=vec[inicio];
                int elemIzq=inicio+1;
                int elemDer=fin;
                while(elemIzq<=elemDer){
                        while(elemIzq<=fin && vec[elemIzq].compareTo(pivote) <= 0){
                                elemIzq++;
                        }
                        while(elemDer>inicio && vec[elemDer].compareTo(pivote) > 0){
                                elemDer--;
                        }
                        if(elemIzq<elemDer){
                                String temp=vec[elemIzq];
                                vec[elemIzq]=vec[elemDer];
                                vec[elemDer]=temp;
                        }
                }
                
                if(elemDer>inicio){
                        String temp=vec[inicio];
                        vec[inicio]=vec[elemDer];
                        vec[elemDer]=temp;
                }
                quickSortStr(vec, inicio, elemDer-1);
                quickSortStr(vec, elemDer+1, fin);
    }
}
 
