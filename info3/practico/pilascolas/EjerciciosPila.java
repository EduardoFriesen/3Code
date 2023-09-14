package practico.pilascolas;

import java.util.Scanner;

import practico.utils.Stack;

public class EjerciciosPila {

    public void prueba() throws Exception{
        Stack<String> pila = new Stack<String>(3);
        pila.push("Hola");
        pila.push("a");
        pila.push("todos");
        if(pila.isEmpty() == false){
            System.out.println("La pila no esta vacia");
        }else{
            System.out.println("Pila vacia");
        }
        if(pila.isFull() == false){
            System.out.println("La pila no esta llena");
        }else{
            System.out.println("Pila llena");
        }
        System.out.println("Tope de pila" + pila.top());
        System.out.println("Elementos de pila" + pila.pop() + pila.pop());
        if(pila.isEmpty() == false){
            System.out.println("La pila no esta vacia");
        }else{
            System.out.println("Pila vacia");
        }
        if(pila.isFull() == false){
            System.out.println("La pila no esta llena");
        }else{
            System.out.println("Pila llena");
        }
        System.out.println("Elementos de pila" + pila.pop());
        if(pila.isEmpty() == false){
            System.out.println("La pila no esta vacia");
        }else{
            System.out.println("Pila vacia");
        }
        if(pila.isFull() == false){
            System.out.println("La pila no esta llena");
        }else{
            System.out.println("Pila llena");
        }
        pila.pop();
    }

    public void comprobacionPalindroma() throws Exception{
        String palabra = "";
        int counter = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cadena deseada");
        palabra = teclado.nextLine();
        palabra = palabra.trim().toLowerCase();
        Stack<String> pila = new Stack<String>(palabra.length());
        for(int i = 0; i < palabra.length(); i++){
            pila.push(String.valueOf(palabra.charAt(i)));
        }
        for(int i = 0;i<palabra.length();i++){
            if(!(String.valueOf(palabra.charAt(i)).equals(pila.pop()))){
                counter++;
            } 
        }
        if(palabra.length()%2==0){  
            if(counter!=0){
                System.out.println("La palabra no es palindroma");
            }else{
                System.out.println("La palabra es palindroma");
            }
        }else{
            if(counter == 1){
                System.out.println("La palabra no es palindroma");
            }else{
                System.out.println("La palabra es palindroma");
            }
        }
    }

    public void comprobacionEquilibrio() throws Exception{
        String expresion = "";
        int counter = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cadena deseada");
        expresion = teclado.nextLine();
        expresion = expresion.trim().toLowerCase();
        Stack<String> pila = new Stack<String>(expresion.length());
        for(int i = 0; i < expresion.length(); i++){
            pila.push(String.valueOf(expresion.charAt(i)));
        }
        for(int i = 0;i<expresion.length();i++){
            String valor = pila.pop();
            if(valor.compareTo(")") == 0){
                System.out.println("se abre"+counter);
                counter++;
            }
            if(counter <= 0){
                System.out.println("Estan mal los patentesis");
            }else{
                if(valor.compareTo("(") == 0){
                    System.out.println("se cierra"+counter);
                    counter--;
                }
            }
        }
        if(counter==0){
            System.out.print("La expresion esta balanceada");
        }else System.out.print("La expresion no esta balanceada");
    }

}
