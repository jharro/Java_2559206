package poo;

import java.util.Scanner;

public class MainMostro {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        Monstro rodolfo = new Monstro("Rodolfo Hernández",4.7f,450,"Azulito",4,3,1);//Constructor

        System.out.println("Los datos de mi objeto con toString");
        System.out.println(rodolfo.toString());
       /* System.out.println("Los datos de mi objeto\n");
        System.out.println("Nombre: "+rodolfo.getNombre());
        System.out.println("Tamaño: "+rodolfo.getTamano());
        System.out.println("Edad: "+rodolfo.getEdad());

        rodolfo.setNombre("Pepe Mostro");

        System.out.println("Los nuevos datos del objeto\n");
        System.out.println("Nombre: "+rodolfo.getNombre());
        System.out.println("Tamaño: "+rodolfo.getTamano());
        System.out.println("Edad: "+rodolfo.getEdad());*/

        rodolfo.asustar();
        rodolfo.volar();



    }
}
