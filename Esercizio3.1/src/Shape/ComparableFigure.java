package Shape;

import java.util.Comparator;

public interface ComparableFigure extends Comparator<Figura> , Figura{

	@Override
	default double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	default int compare(Figura o1, Figura o2) {
		if(o1.area()>o2.area()) {
			return 1;
		}
		else if(o1.area()<o2.area()) {
			return -1;
		}

		return 0;
	}

	



}
