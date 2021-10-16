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
	
	boolean check=true
			
	for (Asiento element: asientos) {
		if (element.registro!=registro) {
			check=false
		}
	}
	
	String verificarIntegridad() {
		if (check && this.motor.registro==this.registro) {
			return "Auto original";
		}
		else {
			return "Las piezas no son originales";
		}
	}

}
