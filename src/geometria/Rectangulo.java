package geometria;


public class Rectangulo {
	private int ladoX;
	private int ladoY;
	private Punto verticeII;
	private Punto verticeSI;
	private Punto verticeSD;
	private Punto verticeID;
	private int perimetro;
	
	//Constructor
	public Rectangulo(Punto vertice,int x, int y) {
		this.verticeII = vertice;
		this.ladoX = x;
		this.ladoY = y;
		this.perimetro = 2*ladoX+2*ladoY;
	}
	
	public Rectangulo(Punto vertice1, Punto vertice2) {
		this.verticeII = vertice1;
		this.verticeSD = vertice2;
		this.perimetro = 2*ladoX+2*ladoY;
	}
	
	public void desplazar(int desplX, int desplY) {
		verticeII.incrementoPosicion((desplX+verticeII.getX()), desplY + verticeII.getY() );
		verticeSI.incrementoPosicion((desplX+verticeSI.getX()), desplY + verticeSI.getY() );
		verticeSD.incrementoPosicion((desplX+verticeSD.getX()), desplY + verticeSD.getY() );
		verticeID.incrementoPosicion((desplX+verticeID.getX()), desplY + verticeID.getY() );
	}
	public void escalar(int incrementoLados) {
		ladoX = (ladoX*incrementoLados)/100;
		ladoY = (ladoY*incrementoLados)/100;
		this.perimetro = 2*ladoX+2*ladoY;
	}
	
	
	
	
}
