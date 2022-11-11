package abstracto;

public class Vegana extends Hamburguesa implements Ihamburguesa {
    private String tipoEnsalada;

    public Vegana(String tipoPan, String proteina, double precio, String tipoEnsalada) {
        super(tipoPan, proteina, precio);
        this.tipoEnsalada = tipoEnsalada;
    }

    @Override
    public double precio() {
        return (precio+(precio*0.05));
    }

    @Override
    public double adicion() {
        return 0;
    }

    @Override
    public double precioTotal() {
        return (precio()+adicion());
    }
}
