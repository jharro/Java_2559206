package herencia;

public class Automovil extends Vehiculo{
    private int noPasajeros;

    public Automovil(String placa, String color, String modelo, int pasajeros){
        super(placa,color,modelo);
        this.noPasajeros = pasajeros;
    }

    public void modoManejo(){
        System.out.println("Manejando Automovil");
    }

    @Override
    public String toString() {
        return super.toString()+ "Automovil{" +
                "noPasajeros=" + noPasajeros +
                '}';
    }
}
