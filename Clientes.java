package empresa;

public class Clientes {
	private int Cod_Cliente = 0;
    private String nombre;
    private String direccion;
    private String telefono;
	public int getCod_Cliente() {
		return Cod_Cliente;
	}
	public void setCod_Cliente(int cod_Cliente) {
		Cod_Cliente = cod_Cliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
    
    

}
