package Ordenamiento.util;

import java.util.*;

public class MenuOrden {
    public void menu(){
        int op,n;
        Ordenamientos metodos = new Ordenamientos();
        try (Scanner teclado = new Scanner(System.in)) {
            do{
                System.out.println("\n----------ORDENAMIENTO----------");
                System.out.println("--------------Menu-------------");
                System.out.println("1 - Insercion");
                System.out.println("2 - ShelSort");
                System.out.println("3 - QuickSort");
                System.out.println("0 - Salir \n");
                op = teclado.nextInt();
                switch(op){
                    case 0:
                        System.out.println("Hasta la Proxima");
                        break;
                    case 1:
                        System.out.println("\n----------INSERCION----------");
                        System.out.println("--------------Menu-------------");
                        System.out.println("1 - Enteros");
                        System.out.println("2 - Doubles");
                        System.out.println("3 - Strings");
                        System.out.println("0 - Salir \n");
                        op = teclado.nextInt();
                        switch(op){
                            case 0:
                                System.out.println("Hasta la Proxima");
                                break;
                            case 1:
                                System.out.println("\n----------INSERSION ENTEROS----------");
                                System.out.println("Ingrese el tamaño del arreglo: ");
                                n = teclado.nextInt();
                                metodos.insercionEnteros(n);
                                break;
                            case 2:
                                System.out.println("\n----------INSERSION DOUBLE----------");
                                System.out.println("Ingrese el tamaño del arreglo: ");
                                n = teclado.nextInt();
                                metodos.insercionDoubles(n);
                                break;
                            case 3:
                                System.out.println("\n----------INSERSION STRING----------");
                                System.out.println("Ingrese el tamaño del arreglo: ");
                                n = teclado.nextInt();
                                metodos.insercionStrings(n);
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("\n----------SHELLSORT----------");
                        System.out.println("--------------Menu-------------");
                        System.out.println("1 - Enteros");
                        System.out.println("2 - Doubles");
                        System.out.println("3 - Strings");
                        System.out.println("0 - Salir \n");
                        op = teclado.nextInt();
                        switch(op){
                            case 0:
                                System.out.println("Hasta la Proxima");
                                break;
                            case 1:
                                System.out.println("\n----------SHELLSORT ENTEROS----------");
                                System.out.println("Ingrese el tamaño del arreglo: ");
                                n = teclado.nextInt();
                                metodos.shellSortEnteros(n);
                                break;
                            case 2:
                                System.out.println("\n----------SHELLSORT DOUBLE----------");
                                System.out.println("Ingrese el tamaño del arreglo: ");
                                n = teclado.nextInt();
                                metodos.shellSortDouble(n);
                                break;
                            case 3:
                                System.out.println("\n----------SHELLSORT STRING----------");
                                System.out.println("Ingrese el tamaño del arreglo: ");
                                n = teclado.nextInt();
                                metodos.shellSortString(n);
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("\n----------QUICKSORT----------");
                        System.out.println("--------------Menu-------------");
                        System.out.println("1 - Enteros");
                        System.out.println("2 - Doubles");
                        System.out.println("3 - Strings");
                        System.out.println("0 - Salir \n");
                        op = teclado.nextInt();
                        switch(op){
                            case 0:
                                System.out.println("Hasta la Proxima");
                                break;
                            case 1:
                                System.out.println("\n----------QUICKSORT ENTEROS----------");
                                System.out.println("Ingrese el tamaño del arreglo: ");
                                n = teclado.nextInt();
                                metodos.quickSortEnteros(n);
                                break;
                            case 2:
                                System.out.println("\n----------QUICKSORT DOUBLE----------");
                                System.out.println("Ingrese el tamaño del arreglo: ");
                                n = teclado.nextInt();
                                metodos.quickSortDoubles(n);
                                break;
                            case 3:
                                System.out.println("\n----------QUICKSORT STRING----------");
                                System.out.println("Ingrese el tamaño del arreglo: ");
                                n = teclado.nextInt();
                                metodos.quickSortStrings(n);
                                break;
                        }  
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                        break;

                }
            }while(op!=0);
        }
    }
}
