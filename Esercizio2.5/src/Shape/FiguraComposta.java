package Shape;
import java.util.ArrayList;

public class FiguraComposta implements Figura {


	private double areaFiguraComposta;

	private ArrayList <Figura> figure;


	public FiguraComposta(ArrayList<Figura>figure) {

		this.figure = new ArrayList<>(figure);
		

	}

	

	public final void aggiungiFigura(Figura f) {

		if(figure==null)
		   figure= new ArrayList<Figura>();

		this.figure.add(f);
	}



	@Override
	public final double area() {
		areaFiguraComposta=0;

		for ( Figura f : figure) {
			areaFiguraComposta+=f.area();
		}

		return areaFiguraComposta;

	}

	



}
