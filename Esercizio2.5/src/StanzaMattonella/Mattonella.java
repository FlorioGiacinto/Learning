package StanzaMattonella;
import Shape.Figura;
import Materials.Materiale;

public class Mattonella{

	private Figura forma;	
	private double spessore;
	private Materiale materiale; 
	
	public Mattonella(Figura figura) {
		
		this.forma=figura;
		this.spessore=0;
		this.materiale=null;
	}
	
	public Mattonella(Figura figura , double spessore , Materiale materiale) {
		this.forma=figura;
		this.spessore=spessore;
		this.materiale=materiale;
	}


	public double area() {
		return forma.area();
	}

	public Figura getForma() {
		return forma;
	}

	public void setForma(Figura forma) {
		this.forma = forma;
	}

	public double getSpessore() {
		return spessore;
	}

	public void setSpessore(double spessore) {
		this.spessore = spessore;
	}

	public Materiale getMateriale() {
		return materiale;
	}

	public void setMateriale(Materiale materiale) {
		this.materiale = materiale;
	}
	
}