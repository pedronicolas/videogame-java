package pruebas;

import geometria.Punto;

public class PruebaPunto {
	public static void main(String[] args) {	
	Punto punto1 = new Punto(1,3);
	System.out.println(punto1.getX());
	System.out.println(punto1.getY());
	
	Punto punto2 = new Punto();
	System.out.println(punto2.getX());
	System.out.println(punto2.getY());
	
	Punto punto3 = new Punto(punto1);
	System.out.println(punto3.getX());
	System.out.println(punto3.getY());
	
	Punto punto4 = new Punto(punto2);
	punto4.setX(5);
	punto4.setY(0);
	System.out.println(punto4.getX() );
	}
}
