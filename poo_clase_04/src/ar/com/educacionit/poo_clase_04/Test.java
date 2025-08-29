package ar.com.educacionit.poo_clase_04;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundillo!");
		
		Direccion d1 = new Direccion("Juan", 1234, 1234);
		
		
		ContactoPersonal cpersonal = new ContactoPersonal("Juan", "Juan@gmail,com", d1, "29/09/2000");
		
		System.out.println(cpersonal);
		
	}

}
