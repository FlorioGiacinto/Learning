
public class Cerchio extends Figura {

	private double raggio;
	
	public Cerchio() {
		raggio=0;
	}
	
	public Cerchio(double raggio) {
		this.raggio=raggio;
	}
	
	@Override
	public double area() {
		return (2*(Math.PI))*raggio;
	}

	public double getRaggio() {
		return raggio;
	}

	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}

	
}
