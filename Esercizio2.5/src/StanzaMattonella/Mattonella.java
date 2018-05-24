package StanzaMattonella;
import Shape.Figura;
import Materials.Materiale;

public class Mattonella implements Figura{

	private Figura figura;	
	private double spessore;
	private Materiale materiale; 
	
	public Mattonella(Figura figura) {
		
		this.figura=figura;
		this.spessore=0;
		this.materiale=null;
	}
	
	public Mattonella(Figura figura , double spessore , Materiale materiale) {
		this.figura=figura;
		this.spessore=spessore;
		this.materiale=materiale;
	}

	@Override
	public double area() {
		return figura.area();
	}
	
}