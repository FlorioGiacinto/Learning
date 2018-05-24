
public class Triangolo extends Figura {
	
	private double base;
	private double altezza;
	
	public Triangolo() {
		base=0;
		altezza=0;
	}
	
	public Triangolo(double base,double altezza) {
		this.base=base;
		this.altezza=altezza;
	}
	
	@Override
	public double area() {

		return (base*altezza)/2;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	
}
