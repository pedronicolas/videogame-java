package geometria;

import java.lang.Math;

public class Circulo {
	private int radio;
	private Punto centro;
	private double perimetro;
	
	
	public int getRadio() {
		return this.radio;
	}
	
	public Punto getPunto() {
		return this.centro;
	}
	
	public double getPerimetro() {
		return this.perimetro;
	}
	
	public Circulo(int radio, Punto punto) {
		this.radio = radio;
		this.centro = punto;
		this.perimetro = 2*Math.PI*radio;
	}
	
	public Circulo() {
		this.radio = 5;
		this.centro = new Punto();
		this.perimetro = 2*Math.PI*radio;
	}
	
	public Circulo(Circulo circulo) {
		this.radio = circulo.radio;
		this.centro = circulo.centro;
		this.perimetro = circulo.perimetro;
	}
	
	public void desplazar(int x ,int y ) {
		int incX = this.centro.getX() + x;
		int incY = this.centro.getY() + y;
		centro.incrementoPosicion(incX, incY);
	}
	
	public void escalar(int porcentajeInc) {
		int radioCalc = (getRadio()*porcentajeInc)/100;
		this.radio = this.radio + radioCalc;
	}
	
	
	
}
