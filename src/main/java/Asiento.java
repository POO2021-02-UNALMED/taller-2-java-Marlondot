package test;
import java.util.Arrays;
public class Asiento {
	String color;
	int precio;
	int registro;
	
	public Asiento() {
		
	}
	
	String[] colors= {"rojo", "verde", "amarillo", "negro", "blanco"};
	
	public void cambiarColor(String Color){
		if (Arrays.asList(colors).contains(Color)) {
			this.color=Color;
		}
		
		
	}
	
}
