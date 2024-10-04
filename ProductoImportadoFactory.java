package empresa;

public class ProductoImportadoFactory implements ProductoFactory {

	@Override
    public Producto createProducto() {
        // Lógica específica para crear un producto importado
        Proveedor proveedor = new Proveedor();
        return new ProductoImportado("Producto Importado", 150.0, proveedor);
    }

}
