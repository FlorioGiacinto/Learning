package Shape;



public class Rettangolo extends Quadrilatero{

	private double base, altezza;


	public double getBase() {
		return base;
	}



	public double getAltezza() {
		return altezza;
	}



	public Rettangolo (double base, double altezza) {
		this.altezza=altezza;
		this.base=base;
	}



	@Override
	public double area() {
		return base*altezza;
	}



}