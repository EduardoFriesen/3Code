package util;

public class Historial {
    private String tipo;
    private int a;
    private int b;
    private float resultado;

    public Historial() {
    }

    public Historial(String tipo, int a, int b, float resultado) {
        this.tipo = tipo;
        this.a = a;
        this.b = b;
        this.resultado = resultado;
    }

    public void setHistorial(String tipo, int a, int b, float resultado){
        this.tipo = tipo;
        this.a = a;
        this.b = b;
        this.resultado = resultado;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public float getResultado() {
        return resultado;
    }
    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
    @Override
    public String toString() {
        return
        "Tipo ='" + tipo + '\'' +
        ", A ='" + a + '\'' +
        ", B ='" + b + '\'' +
        ", Resultado ='" + resultado + '\'';
    }
}
