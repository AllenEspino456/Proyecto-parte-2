package empresa;

public class ProductoFabricado extends Producto {
	public ProductoFabricado(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public String obtenerOrigen() {
        return "Fabricado";
    }

}
