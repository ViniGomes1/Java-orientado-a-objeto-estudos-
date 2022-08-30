package entities;

public class Company extends TaxPlayer {
	
	private Integer numberOfEmployees;
	
	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}
	
	
	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	/* C�lculo de imposto pessoa jur�dica regras:
	 * Pessoa jur�dica: pessoas jur�dicas pagam 16% de imposto. Por�m,
	 * se a empresa possuir mais de 10 funcion�rios, ela paga 14% de imposto.
	 * 
	 * Exemplo: uma empresa cuja renda foi 400000.00 e possui 25 funcion�rios, o imposto fica: 
	 * 400000 * 14% = 56000.00
	 */
	@Override
	public double tax() {
		
		if(numberOfEmployees > 10) {
			return getAnualIncome() * 0.14;
		}else {
			return getAnualIncome() * 0.16;
		}
	}
	
	
	
}
