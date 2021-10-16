package test;
public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	
	public Auto() {
		cantidadCreados++;
	}
	
	int cantidadAsientos() {
		return this.asientos.length;
	}
	
	void verificarIntegridad() {
		if (this.asientos[0].registro==this.registro && this.motor.registro==this.registro) {
			System.out.println("Las piezas no son originales");
		}
		else {
			System.out.println("Auto original");
		}
	}

}
