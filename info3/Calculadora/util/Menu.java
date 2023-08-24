package util;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public void menu(){
        int op,a,b;
        float resultado;
        List<Historial> historial = new ArrayList<>();
        try (Scanner teclado = new Scanner(System.in)) {
            Calculadora calculadora = new Calculadora();
            do{
                System.out.println("\n----------Calculadora----------");
                System.out.println("--------------Menu-------------");
                System.out.println("1 - Suma");
                System.out.println("2 - Resta");
                System.out.println("3 - Multiplicacion");
                System.out.println("4 - Division");
                System.out.println("5 - Historial");
                System.out.println("0 - Salir \n");

                op = teclado.nextInt();
                switch(op){
                    case 1: 
                        System.out.println("--------------SUMA-------------");
                        System.out.println("Introduce el primer numero");
                        a = teclado.nextInt();
                        System.out.println("I ntroduce el segundo numero");
                        b = teclado.nextInt();
                        resultado = calculadora.suma(a,b,historial);
                        System.out.println("El resultado de la suma de "+a+" y "+b+" es: "+resultado);
                        break;
                    case 2: 
                        System.out.println("--------------RESTA------------");
                        System.out.println("Introduce el primer numero");
                        a = teclado.nextInt();
                        System.out.println("Introduce el segundo numero");
                        b = teclado.nextInt();
                        resultado = calculadora.resta(a,b,historial);
                        System.out.println("El resultado de la resta de "+a+" y "+b+" es: "+resultado);
                        break;
                    case 3: 
                        System.out.println("---------MULTIPLICACION--------");
                        System.out.println("Introduce el primer numero");
                        a = teclado.nextInt();
                        System.out.println("Introduce el segundo numero");
                        b = teclado.nextInt();
                        resultado = calculadora.multi(a,b,historial);
                        System.out.println("El resultado de la multiplicacion de "+a+" y "+b+" es: "+resultado);
                        break;
                    case 4: 
                        System.out.println("------------DIVISION-----------");
                        System.out.println("Introduce el primer numero");
                        a = teclado.nextInt();
                        System.out.println("Introduce el segundo numero");
                        b = teclado.nextInt();
                        resultado = calculadora.div(a,b,historial);
                        System.out.println("El resultado de la division entre "+a+" y "+b+" es: "+resultado);
                        break;
                    case 5: 
                        for (Historial elemento : historial) {
                            System.out.println("\n" + elemento);
                        }
                        break;
                }
            }while(op!=0);
        }
        
    }
}
