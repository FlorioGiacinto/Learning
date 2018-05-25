package Shape;


public interface Poligono extends ComparableFigure{

	public int getNumLati();

	@Override
	default double area() {
		// TODO Auto-generated method stub
		return ComparableFigure.super.area();
	}

	@Override
	default int compare(Figura o1, Figura o2) {
		// TODO Auto-generated method stub
		return ComparableFigure.super.compare(o1, o2);
	}		

}

