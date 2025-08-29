package ar.com.educacionit.poo_clase_04;

public class ContactoPersonal extends Contacto{
	
	//Atributos
	private String fechaCumple;

	


	//Métodos
	
	//Constructor por defecto
	public ContactoPersonal() {
		
	}
	
	//Constructor parametrizado sin sobrecarga
	public ContactoPersonal(String nombre, String correo, Direccion direccion, String fechaCumple) {
		super(nombre, correo, direccion);
		this.fechaCumple = fechaCumple;
	}


	//Constructor sobrecargado
	public ContactoPersonal(String nombre, String correo, Direccion direccion) {
		super(nombre, correo, direccion);
		// TODO Auto-generated constructor stub
	}





	public String getFechaCumple() {
		return fechaCumple;
	}

	public void setFechaCumple(String fechaCumple) {
		this.fechaCumple = fechaCumple;
	}

	@Override
	public String toString() {
		return "ContactoPersonal [fechaCumple=" + fechaCumple + ", toString()=" + super.toString() + "]";
	}

	
	
	
	
	
}
