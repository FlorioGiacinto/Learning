package StanzaMattonella;
import Shape.Figura;

public class Stanza implements Figura{

	private Figura pavimento;

	public Stanza (Figura pavimento) {
		this.pavimento=pavimento;
	}

	public double calcolaNumeroMattonelle(Mattonella mattonella){
		return pavimento.area()/mattonella.area() * 1.1;
	}

	@Override
	public double area() {
		return pavimento.area();
	}

}