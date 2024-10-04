package empresa;

public abstract class Producto {
	
	private int codProducto;
	protected  String nombre;
    private String descripcion;
    protected  double precioUnitario;
    private Categoria categoria;
    private boolean Importado;
    private double cantidad;
   
    
	public int getCodProducto() {
		return codProducto;
	}
	public void setCodProducto(int codProducto) {
		this.codProducto = codProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public boolean isImportado() {
		return Importado;
	}
	public void setImportado(boolean importado) {
		Importado = importado;
	}
    
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public double calcularCostoTotal(double cantidad) {
        return precioUnitario * getCantidad();
	}
	
	protected Producto(String nombre, double precioUnitario) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
    }

    // Métodos comunes a todos los productos
    public abstract String obtenerOrigen();
	

}
