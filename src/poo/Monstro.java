package poo;

public class Monstro {
    //ATRIBUTOS
    private String nombre;
    private float tamano;
    private int edad;
    private String color;
    private int nroManos;
    private int nroPies;
    private int nroOjos;

    //MÉTODOS
    //1.Método constructor
    public Monstro(String nombre,float tam, int edad,String color,
                   int nroManos, int nroPies, int nroOjos){

        this.nombre=nombre;
        this.tamano=tam;
        this.edad=edad;
        this.color=color;
        this.nroManos=nroManos;
        this.nroPies=nroPies;
        this.nroOjos=nroOjos;

    }
    //2.Métodos getter


    public String getNombre() {
        return nombre;
    }

    public float getTamano() {
        return tamano;
    }

    public int getEdad() {
        return edad;
    }

    public String getColor() {
        return color;
    }

    public int getNroManos() {
        return nroManos;
    }

    public int getNroPies() {
        return nroPies;
    }

    public int getNroOjos() {
        return nroOjos;
    }
//3.Métodos setter


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTamano(float tamano) {
        this.tamano = tamano;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNroManos(int nroManos) {
        this.nroManos = nroManos;
    }

    public void setNroPies(int nroPies) {
        this.nroPies = nroPies;
    }

    public void setNroOjos(int nroOjos) {
        this.nroOjos = nroOjos;
    }

    void asustar(){
        System.out.println("El monstruo está asustando");
    }
    void volar(){
        System.out.println("Está volaNDO");
    }
    void escupirFuego(){
        System.out.println("Escupiendo fuego..");
    }
    void comerHumanos(){
        System.out.println("Comiendo a un humano...");
    }

    //4. Método toString


    @Override
    public String toString() {
        return "Nombre='" + nombre + '\n' +
                "Tamaño=" + tamano + '\n'+
                "Edad=" + edad + '\n'+
                "Color='" + color + '\n' +
                "Cantidad de manos=" + nroManos +'\n'+
                "Cantidad de pies=" + nroPies +'\n'+
                "Cantidad de ojos=" + nroOjos
                ;
    }
}
