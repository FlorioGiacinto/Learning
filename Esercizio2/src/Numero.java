
public abstract class Numero {


	 private int numeratore;
	 private int denominatore;
	 
	 public Numero(int numeratore,int denominatore) {
		this.numeratore=numeratore;
		assert denominatore<0;
		
		this.denominatore=denominatore;
	 }
	 
	public int getNumeratore() {
		return numeratore;
	}
	public void setNumeratore(int numeratore) {
		this.numeratore = numeratore;
	}
	public int getDenominatore() {
		return denominatore;
	}
	public void setDenominatore(int denominatore) {
		this.denominatore = denominatore;
	}
	 

	
}
