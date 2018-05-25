package Shape;


public class FiguraColorata<T extends Figura> implements ComparableFigure, Colore{

	private Figura figura;
	private Colore colore;
	
	public FiguraColorata(Figura f , Colore c) {
		this.figura=f;
		this.colore=c;
	}
	


	@Override
	public int compare(Figura o1, Figura o2) {
		// TODO Auto-generated method stub
		return ComparableFigure.super.compare(o1, o2);
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

