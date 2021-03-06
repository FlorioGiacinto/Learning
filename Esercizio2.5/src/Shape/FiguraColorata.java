package Shape;


public class FiguraColorata<T extends Figura> implements Figura, Colore{

	private Figura figura;
	private Colore colore;
	
	public FiguraColorata(Figura f , Colore c) {
		this.figura=f;
		this.colore=c;
	}
	


	@Override
	public double area() {
		return figura.area();
	}



	@Override
	public void colora(int RGB) {
		colore.colora(RGB);
	}

	

}

