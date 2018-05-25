package Shape;

import java.awt.Color;

public class ColoreBase implements Colore{

	Color c;
	
	
	
	public ColoreBase(int RGB) {
	c = new Color(RGB);
	}

	@Override
	public void colora(int RGB) {
		c = new Color(RGB);
		
	}

}
