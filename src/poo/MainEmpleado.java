package poo;

import java.util.Scanner;

public class MainEmpleado {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();//Apunta al constructor vacío
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingreso de atributos del empleado");
        System.out.print("Cédula: ");
        empleado1.setCedula(sc.nextLine());
        System.out.print("Nombre: ");
        empleado1.setNombre(sc.nextLine());
        System.out.print("Cargo: ");
        empleado1.setCargo(sc.nextLine());
        System.out.print("Salario: ");
        empleado1.setSalario(sc.nextFloat());

        System.out.println(empleado1.toString());
    }
}
