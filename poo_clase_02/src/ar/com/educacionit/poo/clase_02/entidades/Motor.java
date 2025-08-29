package ar.com.educacionit.poo.clase_02.entidades;

public class Motor {
	
	private String litros;
	private int cilindros;
	
	public Motor() {
	}

	public Motor(String litros, int cilindros) {
		super();
		this.litros = litros;
		this.cilindros = cilindros;
	}

	@Override
	public String toString() {
		return "Motor [litros=" + litros + ", cilindros=" + cilindros + "]";
	}
	
	
	
	
}
