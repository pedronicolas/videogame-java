package pruebas;

import geometria.Punto;
import geometria.*;

public class ProgramaSesion3 {
	public static void main(String[] args) {
		Punto punto1 = new Punto(1,1);
		punto1.incrementoPosicion(Direccion.ARRIBA);
		
		Punto punto2 = new Punto(4,2);
		Punto[] arrayPuntos = new Punto[2];
		
		arrayPuntos[0] = new Punto(punto1);
		arrayPuntos[1] = new Punto(punto2);
		for (Punto punto : arrayPuntos) {
			System.out.println(punto.getX() + punto.getY());
		}
		
		double resultado = punto1.distancia(punto1, punto2); 
		System.out.println(resultado);
		
		Punto resultadoD = punto1.mayorDistancia(punto1,punto2);
		System.out.println(resultadoD);
		
	}
}
