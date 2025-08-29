package ar.com.educacionit.poo_clase_04;

public class ContactoProfesional extends Contacto{
	
	private String empresa;

	
	//Constructor por la superclase
	public ContactoProfesional(String nombre, String correo, Direccion direccion) {
		super(nombre, correo, direccion);
		// TODO Auto-generated constructor stub
	}
	
	//Constructor con todo
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

	@Override
	public String toString() {
		return "ContactoProfesional [empresa=" + empresa + ", toString()=" + super.toString() + "]";
	}
	
	@Override
	public void mostrarInformacion() {
		// TODO Auto-generated method stub
		System.out.println("Soy un contacto profesional");
		System.out.println("Nombre: "+ this.getNombre());
		System.out.println("Empresa: "+ this.getEmpresa());
	}

	
	

}
