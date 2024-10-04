package empresa;

public class Factura {
	private int no_Factura;
    private Orden_Compra orden;
	
	public Factura(int no_factura, Orden_Compra orden) {
        this.no_Factura = no_factura; 
        this.orden = orden;
    }

	public double calcularTotalConImpuestos() {
        
        return orden.calcularTotal() * 1.12;
    }
	
	public String imprimir() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("=====================================\n");
	    sb.append("          FACTURA\n");
	    sb.append("=====================================\n");
	    sb.append("Número de Factura: ").append(no_Factura).append("\n");
	    sb.append("Productos:\n");
	    for (Producto producto : orden.getProductos()) {
	        sb.append("  - ").append(producto.getNombre()).append(" (").append(producto.getCantidad()).append(" unidades) - $").append(producto.getPrecioUnitario() * producto.getCantidad()).append("\n");
	    }
	    sb.append("Cliente: ").append(orden.getCliente().getNombre()).append("\n");
	    sb.append("Total a Pagar: $").append(calcularTotalConImpuestos()).append("\n");
	    return sb.toString();
	}
	
}
