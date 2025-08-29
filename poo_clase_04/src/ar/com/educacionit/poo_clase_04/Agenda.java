package ar.com.educacionit.poo_clase_04;

import java.util.ArrayList;

public class Agenda {
	
	private ArrayList<Contacto> contactos;
	
	
	public Agenda() {
		contactos = new ArrayList<>();
	}
	
	public void agregarContacto(Contacto c) {
		contactos.add(c);
		System.out.println("Contacto agregado: "+ c.getNombre());
	}
	
	public void mostrarContactos() {
		System.out.println("\nAgenda:");
		for(Contacto c : contactos) {
			c.mostrarInformacion();
		}
	}

	
	
}
