package geometria;

public class Punto {
	private int x;
	private int y;
	
	//Setters & getters
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	//Constructores
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Punto() {
		this.x = 0;
		this.y = 0;
	}
	
	public Punto(Punto punto) {
		this.x = punto.x;
		this.y = punto.y;
	}

	//Funcionalidad
	
	public void incrementoPosicion(int xAum, int yAum) {
		int x = getX() + xAum;
		int y = getY() + yAum;
		setX(x);
		setY(y);
	}
	
	
	
	
}
	
	
