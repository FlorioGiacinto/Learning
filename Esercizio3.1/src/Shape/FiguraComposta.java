package Shape;
import java.util.ArrayList;
import java.util.List;

public class FiguraComposta implements Figura {


	private double areaFiguraComposta;

	private List <Figura> figure;


	public FiguraComposta(ArrayList<Figura>figure) {
		this.figure = new ArrayList<>(figure);
	}

	

	public final void aggiungiFigura(Figura f) {

		if(figure==null)
		   figure= new ArrayList<Figura>();

		this.figure.add(f);
	}

	public final void rimuoviFigura(Figura f) {

		this.figure.remove(f);
	}


	@Override
	public final double area() {
		areaFiguraComposta=0;

		for ( Figura f : figure) {
			areaFiguraComposta+=f.area();
		}

		return areaFiguraComposta;

	}

	public void stampa() {
		double max=0;
		ArrayList<Figura> f =new ArrayList<Figura>(figure);
		for(int j=0;j<f.size();j++) {
		
		for(int i=0;i<f.size();i++) {
			max=f.get(0).area();  // prendo il primo
				if(max<f.get(i).area()) {
					max=f.get(i).area();
					f.remove(i);
				}
			}
		System.out.println(max);
		}
	}
	
	
	
	
	



}
