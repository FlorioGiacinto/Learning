package Shape;


public class Cerchio implements ComparableFigure {



	private double raggio;

	

	@Override
	public int compare(Figura o1, Figura o2) {
		return ComparableFigure.super.compare(o1, o2);
	}



	public Cerchio () {

		

	}

	

	public Cerchio ( double raggio) {

		this.raggio=raggio;

	}



	@Override
	public double area() {

		return 2*(Math.PI)*raggio;

	}



}