

public class Cerchio implements Figura {

	private double raggio;

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