package ar.com.educacionit.poo_clase_03;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo desde JAVA");
		System.out.println("Probando");
		
		
		ContactoPersonal cp1 = new ContactoPersonal("Priscila Redondo","prisredondo@gmail.com");
		
		Direccion d1 = new Direccion("Nombre calle", 1234, 1234);
		
		
		cp1.haceLoTuyo();
		
		cp1.setCorreo("pingu");
		
		System.out.println(cp1.getCorreo());
		
		cp1.setDireccion(d1);
		
		System.out.println(cp1);
		
		
		
		
		
		
	}

}
