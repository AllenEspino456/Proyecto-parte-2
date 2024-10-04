package empresa;
import java.util.List;
import java.util.ArrayList;

public class Orden_Compra {
	
	private int no_Orden;
	private int no_factura;
	private Clientes cliente;
    private Estado estado;
    private List<Producto> productos = new ArrayList<>();
    
	public int getNo_Orden() {
		return no_Orden;
	}
	
	public int getNo_factura() {
		return no_factura;
	}
	
	public void setNo_factura(int no_factura) {
		this.no_factura = no_factura;
	}
	
	public void setNo_Orden(int no_Orden) {
		this.no_Orden = no_Orden;
	}
	public Clientes getCliente() {
		return cliente;
	}
	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
    
	public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularCostoTotal(3);  
 
        }
        return total;
    }
    
    private Factura factura;

    public void generarFactura() {
        if (estado.getNombre().equals("Terminado")) {
        	factura = new Factura(no_factura, this);
            System.out.println(factura);
        } else {
            System.out.println("La orden no está terminada.");
        }
    }
    
    public String imprimirFactura() {
    	return factura.imprimir();
    }
}


