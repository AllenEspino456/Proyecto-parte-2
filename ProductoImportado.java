package empresa;

public class ProductoImportado extends Producto {
	private Proveedor proveedor;

    public ProductoImportado(String nombre, double precio, Proveedor proveedor) {
        super(nombre, precio);
        this.proveedor = proveedor;
    }

    @Override
    public String obtenerOrigen() {
        return "Importado";
    }
}
