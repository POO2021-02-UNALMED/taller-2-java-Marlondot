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
		int cantidad=0;
		for (Asiento asiento: asientos) {
			if (asiento!=null)
				cantidad++;
		}
		//return this.asientos.length;
		return cantidad;
	}
	
	String verificarIntegridad() {
		if (this.asientos[0].registro==this.registro && this.motor.registro==this.registro) {
			return "Auto original";
		}
		else {
			return "Las piezas no son originales";
		}
	}

}
