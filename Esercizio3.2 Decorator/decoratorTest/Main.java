
public class Main {
	
		
		public static void main(String[] args) {
			ConcreteComponentStudente s = new ConcreteComponentStudente(20); 
			
			Component persona=new ConcreteDecorator("giacinto","florio");
			Component studente = new ConcreteDecorator2(persona);
			Component lavoratore = new ConcreteDecorator2(studente);
			
			lavoratore.getSalario();
			lavoratore.getVoti();
			
		}
}
