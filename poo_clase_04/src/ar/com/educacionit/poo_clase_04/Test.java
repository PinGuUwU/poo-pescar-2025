package ar.com.educacionit.poo_clase_04;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundillo!");
		
		Direccion dpersonal = new Direccion("Juan", 1234, 1234);
		
		
		ContactoPersonal cpersonal = new ContactoPersonal("Juan", "Juan@gmail,com", dpersonal, "29/09/2000");
		
		System.out.println(cpersonal);
		
		Direccion dprofesional = new Direccion("Calle empresa", 555, 1409);
		ContactoProfesional cprofesional = new ContactoProfesional("Laura", "Laura@gmail.com", dprofesional, "ACME S.A.");
		
		System.out.println(cprofesional);
		
		cpersonal.mostrarInformacion();
		cprofesional.mostrarInformacion();
		
		
		Agenda agenda = new Agenda();
		
		agenda.agregarContacto(cprofesional);
		agenda.agregarContacto(cpersonal);
		
		agenda.mostrarContactos();
	}

}
