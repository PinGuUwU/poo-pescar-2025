package ar.com.educacionit.poo_clase_03;

public class Direccion {

	//Atributos
	private String nombre;
	private int altura;
	private int codigoPostal;
	
	//Métodos
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	//Constructor por defecto
	public Direccion() { }

	
	//Constructor parametrizado
	public Direccion(String nombre, int altura, int codigoPostal) {
		super();
		this.nombre = nombre;
		this.altura = altura;
		this.codigoPostal = codigoPostal;
	}

	//toString
	@Override
	public String toString() {
		return "Direccion [nombre=" + nombre + ", altura=" + altura + ", codigoPostal=" + codigoPostal + "]";
	}
	
	
	
}
