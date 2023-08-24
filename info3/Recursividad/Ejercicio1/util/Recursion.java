package Recursividad.Ejercicio1.util;

public class Recursion {
    public Recursion(){
    }

    public int facto(int n){
        if(n==0){
            return 1;
        }else{
            return n*facto(n-1);
        }
    }

    public int sumatoria(int n){
        if(n==0){
            return 0;
        }else{
            return n+sumatoria(n-1);
        }
    }

    public int pot(int n,int b){
        int resultado = 0;
        if(b==0){
            return 1;
        }else{
            resultado = n*pot(n, b-1);
        }
        return resultado;
    }

    public int conteo(int n){
        if(n==0){
            return 0;
        }else{
            System.out.println(n-1);
            return conteo(n-1);
        }
    }

    public int multi(int n,int b){
        int resultado = 0;
        if(b==0){
            return 0;
        }else{
            System.out.println(n);
            System.out.println("+");
            resultado = n+multi(n, b-1);
        }
        return resultado;
    }
}
