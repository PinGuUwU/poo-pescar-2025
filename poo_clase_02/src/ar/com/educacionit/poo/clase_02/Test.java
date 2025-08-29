package ar.com.educacionit.poo.clase_02;

import ar.com.educacionit.poo.clase_02.entidades.Auto;
import ar.com.educacionit.poo.clase_02.entidades.Persona;

public class Test {
	
	public static void main(String[] arg) {
		System.out.println("------------");
		System.out.println("Hola que talco!");
		// Para comentarios
		System.out.println("------------");
		System.err.println("lol"); //Es edio asincronico, lo tira cuando puede
		
		Persona p1 = new Persona("Priscila", "Redondo", 24);
		System.out.println(p1.toString());
		
		p1.saludar();
	
		Persona p2 = new Persona();
		
		System.out.println(p2);
		
		
		/*
		 * --------------------- AUTO
		 * 
		 */
		
		Auto a1 = new Auto();
		System.out.println(a1);
		
		
		Auto a2 = new Auto("ab-1234-cd", "bmw", "azul", 50, 5);
		
		System.out.println(a2);
		System.out.println();
	}

}
