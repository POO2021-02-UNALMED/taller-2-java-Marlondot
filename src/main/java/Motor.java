package test;
public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	public Motor() {
		
	}
	
	void cambiarRegistro(int registro) {
		this.registro=registro;
	}
	
	void asignarTipo(String tipo) {
		this.tipo=tipo;
	}
}
