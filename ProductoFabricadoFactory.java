package empresa;

public class ProductoFabricadoFactory implements ProductoFactory {

	@Override
    public Producto createProducto() {
        // Lógica específica para crear un producto fabricado
        return new ProductoFabricado("Producto Fabricado", 100.0);
    }

}
