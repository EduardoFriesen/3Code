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

    static void orden(int arr[], int n)
    {
        if (n == 1)
            return;

        for (int i=0; i<n-1; i++)
            if (arr[i] > arr[i+1])
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }

        orden(arr, n-1);
    }

    public int binario(int num, String bin) throws Exception{
        if(num==1){
            bin=1+bin;
            System.out.println(bin);
            return 1;
        }else if(num>1){
            bin=num%2+bin+"";
            return binario(num/2, bin);
        }else{
            throw new Exception("El numero ingresado no es valido");
        }
    }
}
