
public class ConcreteDecorator extends Decorator{

	
	private String nome;
	private String cognome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public ConcreteDecorator(String nome,String cognome) {
		this.nome=nome;
		this.cognome=cognome;
	}
	
	

	
	
}


