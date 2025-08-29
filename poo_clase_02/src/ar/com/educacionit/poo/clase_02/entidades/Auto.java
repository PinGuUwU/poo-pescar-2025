package ar.com.educacionit.poo.clase_02.entidades;


public class Auto {
	
	//Atributos
	
	String patente, marca, color;
	int kilometraje, cantidadRuedas;
	public Motor motor;
	//Métodos
	//Constructor por defecto
	
	public Auto() {
		this.patente = "YY-0000-ZZ";
		this.color = "negro";
	}
	//Constructor parametrizado

	public Auto(String patente, String marca, String color, int 
			kilometraje, int cantidadRuedas) {
		super();
		this.patente = patente;
		this.marca = marca;
		this.color = color;
		this.kilometraje = kilometraje;
		this.cantidadRuedas = cantidadRuedas;
	}

	@Override
	public String toString() {
		return "Auto [patente=" + patente + ", marca=" + marca + ", color=" + color + ", kilometraje=" + kilometraje
				+ ", cantidadRuedas=" + cantidadRuedas + "]";
	}
	

	
	

}
