package StanzaMattonella;
import Shape.*;

public class Stanza{

	private Figura pavimento;

	public Stanza (Figura pavimento) {
		this.pavimento=pavimento;
	}

	public double calcolaNumeroMattonelle(Mattonella mattonella){
		return pavimento.area()/mattonella.area();
	}

	
	public double area() {
		return pavimento.area();
	}

	public Figura getPavimento() {
		return pavimento;
	}

	public void setPavimento(Figura pavimento) {
		this.pavimento = pavimento;
	}
	


}