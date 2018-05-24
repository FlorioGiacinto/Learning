
public class Quadrato extends Figura {

	private double lato;
	
	public Quadrato() {
		lato=0;
	}
	
	public Quadrato(double lato) {
		this.lato=lato;
	}
	
	@Override
	public double area() {
		return lato*lato;
	} 
	
	public double getLato() {
		return lato;
	}

	public void setLato(double lato) {
		this.lato = lato;
	}

	

}
