package ar.com.educacionit.poo_clase_03;

public class ContactoPersonal {
	
	//Atributos
	private String nombre;
	private String correo;
	private Direccion direccion;
	


	//Métodos
	
	//Constructor por defecto
	public ContactoPersonal() { }
	
	//Constructor parametrizado
	public ContactoPersonal(String nombre, String correo) {
		super();
		this.nombre = nombre;
		this.correo = correo;
	}

	public ContactoPersonal(String nombre, String correo, Direccion direccion) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.direccion = direccion;
	}
	
	
	
	
	
	

	void mostrarDatos() {
		System.out.println("El nombre es: " + this.nombre+"\nEl correo es: "+this.correo);
	}
	
	void felicitarCumpleanios() {
		System.out.println("Feliz cumpleaños: "+this.nombre);
	}

	public void haceLoTuyo() {
		mostrarDatos();
		felicitarCumpleanios();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		if(this.correo == correo) {
			System.err.println("No podes cambiar por el mismo correo");
		} else {
			this.correo = correo;
			System.out.println("Se cambió correctamente el correo.");
		}
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "ContactoPersonal [nombre=" + nombre + ", correo=" + correo + ", direccion=" + direccion + "]";
	}
	
	
	
	
	
}
