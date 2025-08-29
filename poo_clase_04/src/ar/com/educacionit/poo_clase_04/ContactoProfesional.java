package ar.com.educacionit.poo_clase_04;

public class ContactoProfesional extends Contacto{
	
	private String empresa;

	
	
	
	public ContactoProfesional(String nombre, String correo, Direccion direccion, String empresa) {
		super(nombre, correo, direccion);
		this.empresa = empresa;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	
	
	

}
