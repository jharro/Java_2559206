package poo;
import poo.MisMetodos02.*;
public class miMetodo01 {

    public static void main(String[] args) {
        int arreglo[]={646,949,4949};

        int numeroUno=100;
        int numeroDos=30;
        float numeroTres=12.87f;
        int resultado=0;
        int resultadoDos=0;
        resultado=sumaNumeros(numeroUno,numeroDos);
        System.out.println("El resultado es "+resultado);
        resultadoDos= sumaNumeros(numeroUno,numeroTres);
        System.out.println("La segunda suma "+resultadoDos);
        sumaNumeros(numeroDos,456.987);
        saludar();
        saludar();
        saludar();
        saludar();
    String nombre="Juliana Pérez";
        MisMetodos02.saludito("Juan José");
        System.out.println(MisMetodos02.saludo(nombre));
    }

    //Método retorna un int y recibe 2 parámetros
    static public int sumaNumeros(int n1, int n2){
        return n1 + n2;
    }

    //Método retorna un int y recibe 2 parámetros (int y float)
    static public int sumaNumeros(int n1, float n2){ // 10   12.87
        return (int) (n1+n2);
    }

    //Método que no retorna nada y recibe 2 parámetros
    static public void sumaNumeros(int n1, double n2){
        double suma = n1 + n2; // 10 + 23.76 => 33.76 ---> 33.00
        System.out.println("La suma de los números es "+suma);
    }

    //Método que no retorna nada y NO recibe parámetros

    static public void saludar(){
        System.out.println("Hola ");
    }

}
