
public class Rettangolo extends Figura{

	private double base;
	private double altezza;
	
	public Rettangolo() {
		base=0;
		altezza=0;
	}
	
	public Rettangolo(double base,double altezza) {
		this.base=base;
		this.altezza=altezza;
	}
	
	@Override
	public double area() {

		return base*altezza;
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
