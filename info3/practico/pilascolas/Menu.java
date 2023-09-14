package practico.pilascolas;

import java.util.Scanner;

public class Menu {
    public void menu() throws Exception{
        int op=0;
        try (Scanner entrada = new Scanner(System.in)) {
            do{
                System.out.println("----------MENU----------");
                System.out.println("1. Pilas");
                System.out.println("2. Colas");
                System.out.println("0. Salir");
                System.out.println("Ingrese una opcion: ");
                op = entrada.nextInt();
                switch(op){
                    case 0:
                        System.out.println("Hasta la proxima");
                        break;
                    case 1: 
                        EjerciciosPila pilas = new EjerciciosPila();
                        System.out.println("----------MENU----------");
                        System.out.println("1. Prueba");
                        System.out.println("2. Palindromas");
                        System.out.println("3. Balance de Expresiones");
                        System.out.println("Ingrese una opcion: ");
                        op = entrada.nextInt();
                        switch(op){
                            case 0:
                                System.out.println("Hasta la proxima");
                                break;
                            case 1:
                                System.out.println("Prueba de Pilas");
                                pilas.prueba();
                                break;
                            case 2:
                                System.out.println("Palindromas");
                                pilas.comprobacionPalindroma();
                                break;
                            case 3:
                                System.out.println("Balance de Expresiones");
                                pilas.comprobacionEquilibrio();
                                break;
                            default:
                                break;
                        }
                }
            }while(op!=0);
        }
    }
}
