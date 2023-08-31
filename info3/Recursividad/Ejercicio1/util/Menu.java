package Recursividad.Ejercicio1.util;
import java.util.*;
public class Menu {
    public void menu() throws Exception{
        int op,n,b,resultado;
        String binario="";
        randomArray arregloRamdom = new randomArray();
        try (Scanner teclado = new Scanner(System.in)) {
            Recursion recursion = new Recursion();
            do{
                System.out.println("\n----------RECURSION----------");
                System.out.println("--------------Menu-------------");
                System.out.println("1 - Factirial");
                System.out.println("2 - Sumatoria");
                System.out.println("3 - Potencia");
                System.out.println("0 - Salir \n");

                op = teclado.nextInt();
                switch(op){
                    case 1: 
                        System.out.println("--------------FACTORIAL-------------");
                        System.out.println("Introduce el primer numero");
                        n = teclado.nextInt();
                        resultado = recursion.facto(n);
                        System.out.println("El resultado del factorial de "+n+" es: "+resultado);
                        break;
                    case 2: 
                        System.out.println("--------------SUMATORIA-------------");
                        System.out.println("Introduce el primer numero");
                        n = teclado.nextInt();
                        resultado = recursion.sumatoria(n);
                        System.out.println("El resultado de la sumatoria de "+n+" es: "+resultado);
                        break;
                    case 3: 
                        System.out.println("--------------Potencia-------------");
                        System.out.println("Ingrese el numero base");
                        n = teclado.nextInt();
                        System.out.println("Ingrese el exponente");
                        b = teclado.nextInt();
                        resultado = recursion.pot(n,b);
                        System.out.println("El resultado de "+n+" elevado a la "+b+" es: "+resultado);
                        break;
                    case 4: 
                        System.out.println("--------------REGRESION-------------");
                        System.out.println("Ingrese el numero inicial");
                        n = teclado.nextInt();
                        resultado = recursion.conteo(n);
                        break;
                    case 5: 
                        System.out.println("--------------Potencia-------------");
                        System.out.println("Ingrese el multiplicando");
                        n = teclado.nextInt();
                        System.out.println("Ingrese el multiplicador");
                        b = teclado.nextInt();
                        resultado = recursion.multi(n,b);
                        System.out.println("El resultado de "+n+" multiplicado por "+b+" es: "+resultado);
                        break;
                    case 6:
                        System.out.println("--------------ORGANIZADOR-------------");
                        System.out.println("Ingrese el tamaño del arreglo");
                        n = teclado.nextInt();
                        int[] arreglo = new int[n];
                        arreglo = arregloRamdom.carga(n);
                        System.out.println("Arreglo desordenado");
                        arregloRamdom.impresion(arreglo);
                        System.out.println("Arreglo Ordeando");
                        recursion.orden(arreglo, n);
                        arregloRamdom.impresion(arreglo);
                        break;
                    case 7:
                        System.out.println("--------------BINARIO-------------");
                        System.out.println("Ingrese el valor a convertir: ");
                        n = teclado.nextInt();
                        resultado = recursion.binario(n, binario);
                }   
            }while(op!=0);
        }
        
    }
}