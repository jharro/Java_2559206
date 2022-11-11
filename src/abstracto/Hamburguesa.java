package abstracto;

public abstract class Hamburguesa {
    protected String tipoPan;
    protected String proteina;
    protected double precio;



    public Hamburguesa(String tipoPan, String proteina, double precio) {
        this.tipoPan = tipoPan;
        this.proteina = proteina;
        this.precio = precio;

    }

    public abstract double precio();

    public abstract double adicion();

    public abstract double precioTotal ();
}
