package test.shape;

import Shape.Colore;
import Shape.ColoreBase;
import Shape.Figura;
import Shape.FiguraColorata;
import Shape.Rettangolo;
import StanzaMattonella.Mattonella;
import StanzaMattonella.Stanza;

public class ShapeTest {

	public static void main(String[] args) {
		
		Figura pavimento = new Rettangolo(300, 300);
		Stanza s = new Stanza(pavimento);
		Figura figura = new Rettangolo(3, 3);
		Colore c = new ColoreBase(100);
		Figura a = new FiguraColorata<Rettangolo>(figura, c);
		Mattonella mattonella = new Mattonella(a);
		System.out.println(s.calcolaNumeroMattonelle(mattonella));
	}

}
