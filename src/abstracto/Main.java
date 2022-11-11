package abstracto;

public class Main {
    public static void main(String[] args) {
        Vegana vegana =new Vegana("Integral","Falafel",30000,"Dulce");
        System.out.println("Precio Vegana: "+vegana.precio());
        Artesanal artesanal=new Artesanal("Ajonjolí","Pollo",25000,"Chedar");
        System.out.println("Precio Artesanal: "+ artesanal.precioTotal());


    }
}
