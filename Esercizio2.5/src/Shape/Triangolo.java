package Shape;

public class Triangolo implements Poligono{


	private double base, altezza;

	public Triangolo() {
	}



	public Triangolo( double base, double altezza) {
		this.base=base;
		this.altezza=altezza;

	}


	@Override
	public double area() {
		return (base*altezza)/2;

	}



	@Override
	public int getNumLati() {
		return 3;
	}


}