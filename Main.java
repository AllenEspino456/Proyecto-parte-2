package empresa;

public class Main {

	public static void main(String[] args) {

		        Clientes cliente1 = new Clientes();
		        cliente1.setCod_Cliente(1);
		        cliente1.setNombre("Juan Pérez");
		        cliente1.setDireccion("Av. Principal 123");

		        Categoria categoriaSombrillas = new Categoria();
		        categoriaSombrillas.setCod_Categoria(1);
		        categoriaSombrillas.setNombre("Sombrillas");

		        ProductoFabricadoFactory fabrica = new ProductoFabricadoFactory();

		       
		        Producto sombrillaPersonalizada = fabrica.createProducto();
		        sombrillaPersonalizada.setNombre("Sombrilla con logo");
		        sombrillaPersonalizada.setCodProducto(1);
		        sombrillaPersonalizada.setCategoria(categoriaSombrillas);
		        sombrillaPersonalizada.setImportado(false);
		        sombrillaPersonalizada.setCantidad(9);
		        sombrillaPersonalizada.setPrecioUnitario(80);

		        Orden_Compra orden1 = new Orden_Compra();
		        orden1.setNo_factura(1);
		        orden1.setCliente(cliente1);
		        orden1.agregarProducto(sombrillaPersonalizada);

		       
		        Estado estadoTerminado = new Estado();
		        estadoTerminado.setEstado(2);;
		        estadoTerminado.setNombre("Terminado");
		        orden1.setEstado(estadoTerminado);
		        
		        System.out.println("Orden de Compra:");
		        System.out.println("Cliente: " + orden1.getCliente().getNombre());
		        System.out.println("Productos:");
		        for (Producto producto : orden1.getProductos()) {
		            System.out.println("- " + producto.getNombre()+ " (Categoría: " + producto.getCategoria().getNombre() + ")");
		        }
		        System.out.println("Estado: " + orden1.getEstado().getNombre());
		   
		      
		        System.out.println("Total de la orden: $" + orden1.calcularTotal());
		        
		        orden1.generarFactura();
		        
		        System.out.println(orden1.imprimirFactura());
		        
		        
	}

}
