package ar.com.educacionit.poo.clase_02.entidades;

public class Persona {

	//Atributos
	//Java es tipado -> Que especifica el tipo de dato
	String nombre;
	String apellido;
	int edad;
	

	
	//Métodos
	
	//Constructor por defecto
	public Persona() {
		nombre = "Sin nombre";
		apellido = "Sin apellido";
		edad = 18;
	}
	
	//Constructor parametrizado
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public void saludar() {
		System.out.printf("Hola tarolas!");	
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	
	
	
}
