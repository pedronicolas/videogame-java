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
	
	public double distancia(Punto punto1, Punto punto2) {
		double param1 = Math.pow(punto1.getX()-punto2.getX(), 2); 
		double param2 = Math.pow(punto1.getY()-punto2.getY(), 2);
		double result = Math.sqrt(param1+param2);
		return result;
	}
	
	public void incrementoPosicion(Direccion dir) {
		switch (dir) {
		case ABAJO:
			incrementoPosicion(0, -1);
			break;
		case ARRIBA:
			incrementoPosicion(0, 1);
			break;
		case IZQUIERDA:
			incrementoPosicion(-1, 0);
		case DERECHA:
			incrementoPosicion(1, 0);
			break;
		default:
			break;
		}
	}
	
	public Punto mayorDistancia(Punto...punto) {
	 	
		Punto puntoOrigen = new Punto();
	 	double mayorDistancia = distancia(puntoOrigen, punto[0]);
	 	Punto puntoMayor = punto[0];
	 	for (int i = 1; i < punto.length; i++) {
			double distanciaPosible = distancia(puntoOrigen, punto[i]);
			if(mayorDistancia > distanciaPosible) {
				mayorDistancia = distanciaPosible;
				puntoMayor = punto[i];
			}
		}
		return puntoMayor;
	}
	
	
	
	
}
	
	
