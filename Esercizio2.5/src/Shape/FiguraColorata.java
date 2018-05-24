package Shape;

public interface FiguraColorata extends Figura, OggettoColorato{

	@Override
	default void colora() {
	}

}
