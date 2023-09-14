package practico.listas;

import java.util.Scanner;

import practico.utils.Stack;
import practico.utils.StackList;

public class EjercicosListas {
    public void almacen(){
        StackList<String> lista = new StackList<String>();
        try (Scanner entrada = new Scanner(System.in)) {
            String palabra = "";
            do{
                System.out.println("Ingrese una palabra");
                palabra = entrada.nextLine();
                if(palabra.compareTo("") != 0) lista.push(palabra);   
            }while(palabra.compareTo("") != 0);
        }
        int tam = lista.size();
        for(int i = 0; i<tam;i++){
            System.out.println(lista.pop());
        }
    }
    public void comprobacionEquilibrio() throws Exception{
        String expresion = "";
        int counter = 0;
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Ingrese la cadena deseada");
            expresion = teclado.nextLine();
        }
        expresion = expresion.trim().toLowerCase();
        StackList<String> lista = new StackList<String>();
        for(int i = 0; i < expresion.length(); i++){
            lista.push(String.valueOf(expresion.charAt(i)));
        }
        for(int i = 0;i<expresion.length();i++){
            String valor = lista.pop();
            if(valor.compareTo(")") == 0){
                counter++;
            }
            if(counter <= 0){
                System.out.println("Estan mal los patentesis");
            }else{
                if(valor.compareTo("(") == 0){
                    counter--;
                }
            }
        }
        if(counter==0){
            System.out.print("La expresion esta balanceada");
        }else System.out.print("La expresion no esta balanceada");
    }

    public void binario() {
        int decimal = 0;
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Ingrese el numero deseado");
            decimal = teclado.nextInt();
        }
         ;
        StackList<Integer> list = new StackList<>();

        while (decimal > 0) {
            list.push(decimal % 2);
            decimal /= 2;
        }

        while (!list.isEmpty()) {
            System.out.print(list.pop());
        }

        System.out.println();
    }
}
