#include <iostream>
#include <math.h>
#include <iomanip>

using namespace std;

#define ERROR pow(10, -4);

void menu();
double f(double x);
double g(double x);
double derivada(double x);
void biseccion();
void regula();
void puntoFijo();
void newtonRaphson();
void secante();
void gaussiana();


int main(){
    menu();
    return 0;
}

double f(double x){
    return x = -2 + (7*x) - (5*pow(x,2)) + (6*pow(x,3));
}

double g(double x){
    return x = log(x+exp(sin(x)));
}

double derivada(double x){
    return x;
}

void menu(){
    
    int op;
        do{
            cout<<"Ingresar Opcion"<< endl;
            cout<<"1. Metodos Cerrados"<< endl;
            cout<<"2. Metodos Abiertos"<< endl;
            cout<<"3. Sistemas de Ecuaciones Algebraicas Lineales"<<endl;
            cout<<"0. Salir"<< endl;
            cin>>op;
            switch (op){
                case 0:
                    cout<<"Hasta la proxima"<<endl;
                    break;
                case 1:
                    cout<<"-----Metodos Cerrados-----"<<endl;
                    cout<<"Ingresar Opcion"<< endl;
                    cout<<"1. Biseccion"<< endl;
                    cout<<"2. Regula Falsi"<< endl;
                    cout<<"0. Salir"<< endl;
                    cin>>op;
                    switch (op){
                        case 0:
                            cout<<"Hasta la proxima"<<endl;
                            break;
                        case 1:
                            biseccion();
                            break;
                        case 2:
                            regula();
                            break;
                    }
                    break;
                case 2:
                    cout<<"-----------Metodos Abiertos-----------"<<endl;
                    cout<<"Ingresar Opcion"<< endl;
                    cout<<"1. Metodo de Iteracion por Punto Fijo"<< endl;
                    cout<<"2. Método de Newton-Raphson"<< endl;
                    cout<<"3. Método de la Secante"<< endl;
                    cout<<"0. Salir"<<endl;
                    cin>>op;
                    switch (op){
                        case 0:
                            cout<<"Hasta la proxima"<<endl;
                            break;
                        case 1:
                            puntoFijo();
                            break;
                        case 2:
                            newtonRaphson();
                            break;
                        case 3:
                            secante();
                            break;
                    }
                    break;
                case 3:
                    cout<<"--Sistemas de Ecuaciones Algebraicas Lineales--"<<endl;
                    cout<<"Ingresar Opcion"<< endl;
                    cout<<"1. Metodo de Eliminacion Gaussiana"<< endl;
                    cin>>op;
                    switch (op){
                        case 0:
                            cout<<"Hasta la proxima"<<endl;
                            break;
                        case 1:
                            gaussiana();
                            break;
                        
                    }
                    break;
                default:
                break;
            }
        }while(op!=0);
}

void biseccion(){
    double a,b,cn,cv,t;
    double eAprox, ePorcentual = 0;
    int iteracion = 0;
    t = ERROR;
        cout<<"-----Biseccion-----"<<endl;
        cout<<"Ingrese el valor de a: ";
        cin>>a;
        cout<<"Ingrese el valor de b: ";
        cin>>b;
    if (f(a) * f(b) < 0) {
        do {
            if (iteracion == 0) {
                cn = (a + b) / 2;
                cv = a;
                eAprox = fabs(cn - cv);
                ePorcentual = fabs(eAprox / cn) * 100;
            } else {
                if (f(a) * f(cn) < 0) {
                    b = cn;
                    cv = cn;
                    cn = (a + b) / 2;
                    eAprox = fabs(cn - cv);
                    ePorcentual = (eAprox / cn) * 100;
                } else if (f(b) * f(cn) < 0) {
                    a = cn;
                    cv = cn;
                    cn = (a + b) / 2;
                    eAprox= fabs(cn - cv);
                    ePorcentual = (eAprox / cn) * 100;
                } else {
                    break;
                }
            }
            iteracion++;
        }while(eAprox > t);
    cout<< fixed << setprecision(20) <<"La raiz de la funcion es: "<<cn<<endl;
    cout<<"El error relativo es: "<<ePorcentual<<"%"<<endl;
    cout<<"Iteraciones: "<<iteracion<<endl;
    } else {
        cout<<"No existe una raiz o existe un numero par de ellas";
    }
}

void regula(){
    double a,b,cn,cv,t;
    double eAprox, ePorcentual = 0;
    int iteracion = 0;
    t = ERROR;
    cout<<"-----Regula Falsi-----"<<endl;
    cout<<"Ingrese el valor de a: ";
    cin>>a;
    cout<<"Ingrese el valor de b: ";
    cin>>b;
    if (f(a) * f(b) < 0) {
        do {
            if (iteracion == 0) {
                cn = (f(b) * a - f(a) * b) / (f(b) - f(a));
                cv = a;
                eAprox = fabs(cn - cv);
                ePorcentual = fabs(eAprox / cn) * 100;
            } else {
                if (f(a) * f(cn) < 0) {
                    b = cn;
                    cv = cn;
                    cn = (f(b) * a - f(a) * b) / (f(b) - f(a));
                    eAprox = fabs(cn - cv);
                    ePorcentual = (eAprox / cn) * 100;
                } else if (f(b) * f(cn) < 0) {
                    a = cn;
                    cv = cn;
                    cn = (f(b) * a - f(a) * b) / (f(b) - f(a));
                    eAprox= fabs(cn - cv);
                    ePorcentual = (eAprox / cn) * 100;
                } else {
                    break;
                }
            }
            iteracion++;
        }while(eAprox > t);
    cout<< fixed << setprecision(20) <<"La raiz de la funcion es: "<<cn<<endl;
    cout<<"El error relativo es: "<<ePorcentual<<"%"<<endl;
    cout<<"Iteraciones: "<<iteracion<<endl;
    } else {
        cout<<"No existe una raiz o existe un numero par de ellas";
    }
}

void puntoFijo(){
    double xViejo,xNuevo, eAproximado, ePorcentual;
    double tolerancia = ERROR;
    int iteraciones = 0;
    cout<<"ingresar el punto de partida"<<endl;
    cin>>xViejo;
    do {
        //////////////////////////////////////////////////////////////////////////////////////////////
        ///usando limite
        //////////////////////////////////////////////////////////////////////////////////////////////
        double lim = (f(xViejo + (0.01)) - f(xViejo)) / (0.01); //limite original
        //double lim =(function(xViejo+0.01)- function(xViejo - 0.01))/(2*0.01);
        //double lim = (3 * function(xViejo) - 4 * function(xViejo - 0.01) + function(xViejo - (2 * 0.01))) / (2 * 0.01);
        ///el valor de la funcion derivdada tiene que estar entre 0 y 1 si el motodo diverge
        if (fabs(lim) < 1) {
            xNuevo = f(xViejo);
            eAproximado = fabs(xNuevo - xViejo);
            xViejo = xNuevo;
        } else {
            cout << "Warning: el metodo diverge" << endl;
        }
        iteraciones++;
    } while (eAproximado > tolerancia);
    cout << "Raiz: " << fixed << setprecision(20) << xNuevo << "\nError: " << eAproximado << "\nIteraciones: " << iteraciones << endl;
}

void newtonRaphson(){
    double xViejo,xNuevo, eAproximado, ePorcentual;
    double tolerancia = ERROR;
    int iteraciones = 0;
    cout<<"ingresar el punto de partida"<<endl;
    cin>>xViejo;
    do {
        ////////////////
        ///usando limite
        /////////////////
        double lim = (f(xViejo + (0.01)) - f(xViejo)) / (0.01); //limite original
        //double lim =(function(xViejo+0.01)- function(xViejo - 0.01))/(2*0.01);
        //double lim =(3 * function(xViejo) - 4 * function(xViejo - 0.01) + function(xViejo - (2 * 0.01))) / (2 * 0.01);
        ///si la derivada de la funcion es muy ceracana a cero no se puede usar el meotodo, ya que nos quedaria una division por cero
         if (fabs(lim) < 0.000001) {
             cout << "Warning: la derivada de la funcion es demasiano cercana a cero, probar con otro metodo" << endl;
         }
        xNuevo = xViejo - (f(xViejo) / lim);
        eAproximado = fabs(xNuevo - xViejo);
        ePorcentual = ((fabs(xNuevo - xViejo) / xNuevo) * 100);
        xViejo = xNuevo;
        iteraciones++;
        cout << iteraciones << endl;

        //////////////////////////
        ///usando funcion derivada
        //////////////////////////
         /*if (fabs(derivada(xViejo)) < 0.001) {
             cout << "Warning: la derivada de la funcion es demasiano cercana a cero, probar con otro metodo" << endl;
         }

         xNuevo = xViejo - (function(xViejo) / derivada(xViejo));
         eAproximado = fabs(xNuevo - xViejo);
         ePorcentual = ((fabs(xNuevo- xViejo)/xNuevo)*100);
         xViejo = xNuevo;
         iteraciones++;
         cout << iteraciones << endl;*/

    } while (eAproximado > tolerancia && iteraciones < 10000);
    cout << "Raiz: "  << fixed << setprecision(20)<< xNuevo << "\nError: " << eAproximado << "\nIteraciones: " << iteraciones << endl;
    cout << " f(xNuevo)=" << (int) f(xNuevo) << endl;
    cout << "Error porcentual: " << ePorcentual << endl;
}

void secante(){
    double xNuevo, eAproximado;
    double extremoIzquierdo, extremoDerecho;
    double tolerancia = pow(10, -5);
    int iteraciones = 0;

    do {
        xNuevo = extremoDerecho - (f(extremoDerecho) * (extremoIzquierdo - extremoDerecho)) / (f(extremoIzquierdo) - f(extremoDerecho));
        eAproximado = fabs(xNuevo - extremoDerecho);
        extremoIzquierdo = extremoDerecho;
        extremoDerecho = xNuevo;
        iteraciones++;
    } while (eAproximado > tolerancia || iteraciones > 10000);

    cout << "Raiz: "<< fixed << setprecision(20) << xNuevo << "\nError: " << eAproximado << "\nIteraciones: " << iteraciones << endl;
}
/*void gaussina(){

    int tam;
    double aux, factor;
    double e = ERROR;
    cout<<"Ingrese la cantidad de incognitas: ";
    cin>>tam;
    double matrizA[tam][tam];
    double matrizB[tam];
    double matrizX[tam];
    for(int i=0;i<tam;i++){
        for(int j=0;j<tam;j++){
            cout<<"ingrese el valor de X"<<+(j)<<endl;
            cin>>matrizA[i][j];
            
        }
        cout<<"ingrese el valor de la ecuacion numero"<<+(i+1)<<endl;
        cin>>matrizX[i];
    }

    //triangulacion superior
    for(int indexA = 0; indexA<tam-1;indexA++){
        //pivoteo
        int swap = 0;
        if(fabs(matrizA[indexA][indexA]) < e) {
            for(int indexB = indexA + 1; indexB <= tam; indexB++){
                    for (int indexC = indexA; indexC < tam; indexC++) {
                        aux = matrizA[indexA][indexC];
                        matrizA[indexA][indexC] = matrizA[indexB][indexC];
                        matrizA[indexB][indexC] = aux;
                    }
                    aux = matrizB[indexA];
                    matrizB[indexA] = matrizB[indexB];
                    matrizB[indexB] = aux;
                    swap = 1;
                    break;
                }
            }
        
        }
    }
}*/