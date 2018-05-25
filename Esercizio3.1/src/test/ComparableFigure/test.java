package test.ComparableFigure;

import Shape.*;

public class test {

	public static void main(String[] args) {

		ComparableFigure figura1 = new Cerchio(2);
		ComparableFigure figura2 = new Cerchio(2);
		
		System.out.println(figura1.compare(figura1, figura2));
	}
}
