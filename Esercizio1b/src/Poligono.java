


public abstract class Poligono implements Figura {

	private int numLati;

	public Poligono() {

	}


	public Poligono(int numLati) {
		this.setNumlati(numLati);
	}

	@Override
	public abstract double area();

	public int getNumlati() {
		return numLati;
	}

	public void setNumlati(int numlati) {
		this.numLati = numlati;
	}

}

