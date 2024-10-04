package empresa;

public class Proveedor {
	private int Cod_Proveedor;
	private String nombre;
	private String direccion;
	private String contacto;
	 
	public int getCod_Proveedor() {
		return Cod_Proveedor;
	}
	public void setCod_Proveedor(int cod_Proveedor) {
		Cod_Proveedor = cod_Proveedor;
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
	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	 
	 
	  

}
