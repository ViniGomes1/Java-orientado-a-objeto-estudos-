package entities;

/* esta � uma classe generica contendo classes e metodos abstratos que s�o acessados apenas
 * pelos herdeiros "company" e "Individual"
 */
public abstract class TaxPlayer {
	
	private String name;
	private Double anualIncome;
	
	public TaxPlayer() {
	}

	public TaxPlayer(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	//Os metodos abstratos n�o possuem implementa��o
	public abstract double tax();
	
}
