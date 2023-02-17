package bytebankHeredado;

public class Cliente implements Autenticable{
	private String nombre;
	private String documento;
	private String Telefono;
	
	private AutenticacionUTil util;
	
	public Cliente () {
		this.util = new AutenticacionUTil();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	
	
	@Override
	public void setClave(String clave) {
		this.setClave(clave);
		
	}
	
	@Override
	public boolean inciarSesion(String clave) {
		return this.util.iniciarSesion(clave)
;	}
	
	
}
