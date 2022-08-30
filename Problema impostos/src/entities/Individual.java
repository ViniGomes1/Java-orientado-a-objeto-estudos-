package entities;

public class Individual extends TaxPlayer{

	private Double healthExpenditures;
	
	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	
	
	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	/*  Cálculo de imposto pessoa física regras:
	 *  Pessoa física: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. 
	 *   Pessoas com renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com saúde,
	 *   50% destes gastos são abatidos no imposto
	 *   
	 *   Exemplo:
	 *   uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com saúde, o imposto fica:
	 *    (50000 * 25%) - (2000 * 50%) = 11500.00
	 */
	@Override
	public double tax() {
		if (getAnualIncome() < 2000.0) {
			return getAnualIncome() * 0.15 - healthExpenditures * 0.5;
		} else {
			return getAnualIncome() * 0.25 - healthExpenditures * 0.5;
		}
	}

}
