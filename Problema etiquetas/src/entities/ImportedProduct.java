package entities;

//Classe produtos importados

public class ImportedProduct extends Product{
	
	private Double customsFee;
	
	
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}



	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	//caso esta classe seja usada, o modo de saída padrão de "product" será sobreposto por este
	@Override
	public String priceTag() {
		return  super.getName() + " $ " + String.format("%.2f", (super.getPrice() + getCustomsFee()))
		+ "(Customs Fee: " + String.format("%.2f", getCustomsFee()) + ")";
	}
	
}
