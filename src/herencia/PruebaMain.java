package herencia;

public class PruebaMain {
    public static void main(String[] args) {
        Automovil mazda = new Automovil("AMD123","Blanco","2018",4);
        System.out.println(mazda.toString());
        mazda.acelerar();
    }
}
