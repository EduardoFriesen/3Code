package util;

import java.util.*;

public class Calculadora{

    public Calculadora(){
    }
    public float suma(int a, int b, List<Historial> hist){
        float resultado = 0;
        resultado = a + b;
        Historial elemento = new Historial();
        elemento.setTipo("Suma");
        elemento.setA(a);
        elemento.setB(b);
        elemento.setResultado(resultado);
        hist.add(elemento);
        return resultado;
    }

    public float resta(int a, int b, List<Historial> hist){
        float resultado = 0;
        resultado = a - b;
        Historial elemento = new Historial();
        elemento.setTipo("Resta");
        elemento.setA(a);
        elemento.setB(b);
        elemento.setResultado(resultado);
        hist.add(elemento);
        return resultado;
    }

    public float multi(int a, int b, List<Historial> hist){
        float resultado = 0;
        resultado = a * b;
        Historial elemento = new Historial();
        elemento.setTipo("Multiplicacion");
        elemento.setA(a);
        elemento.setB(b);
        elemento.setResultado(resultado);
        hist.add(elemento);
        return resultado;
    }

    public float div(int a, int b, List<Historial> hist){
        try{
        float resultado = 0;
        resultado = a / b;
        Historial elemento = new Historial();
        elemento.setTipo("Division");
        elemento.setA(a);
        elemento.setB(b);
        elemento.setResultado(resultado);
        hist.add(elemento);
        return resultado;
        }catch(Exception e){
            System.out.println("ERROR: Division por 0");
            return 0;
        }
        
    }
}