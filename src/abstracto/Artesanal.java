package abstracto;

public class Artesanal extends Hamburguesa implements Ihamburguesa {
    private String tipoQueso;

    public Artesanal(String tipoPan, String proteina, double precio, String tipoQueso) {
        super(tipoPan, proteina, precio);
        this.tipoQueso = tipoQueso;
    }

    @Override
    public double precio() {
        return (precio*2);
    }

    @Override
    public double adicion() {
        return (precio*0.02);
    }

    @Override
    public double precioTotal() {
        return (precio()+adicion());
    }
}
