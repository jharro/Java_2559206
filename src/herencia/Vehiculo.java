package herencia;

public class Vehiculo {
    private String nroPlaca;
    private String color;
    private String modelo;

    public Vehiculo(String nroPlaca, String color, String modelo) {
        this.nroPlaca = nroPlaca;
        this.color = color;
        this.modelo = modelo;
    }

    public void acelerar(){
        System.out.println("Estoy acelerando");
    }
    public void frenar(){
        System.out.println("Estoy frenando");
    }
    public void cambiarVelocidad(){
        System.out.println("Cambiando velocidad");
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "nroPlaca='" + nroPlaca + '\'' +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
