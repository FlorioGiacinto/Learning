
public class Triangolo extends Poligono{


	private double base, altezza;

	public Triangolo() {
	}



	public Triangolo( double base, double altezza) {
		super(3);
		this.base=base;
		this.altezza=altezza;

	}


	@Override
	public double area() {
		return (base*altezza)/2;

	}





}