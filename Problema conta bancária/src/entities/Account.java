package entities;

//pacote serve para o retorno e processamento dos dados das variaveis
public class Account {
	private int number;
	private String holder;
	private double balance;
	
	//ambos os atributos account trabalham da mesma forma, a diferença é o deposito inicial
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	// os getters e setters servem para a entrada e modificação dos dados
	public int getNumber() {
		return number;
	}
	
	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	//processamento do deposito	
	public void deposit(double amount) {
		balance += amount;
	}
	
	//processamento do saque
	public void withdwaw(double amount) {
		balance -= amount + 5.00;
	}
	
	//saida dos dados como string
	public String toString() {
		return "Account " + number + ", Holder: " + holder + ", balance: $ " + String.format("%.2f", balance);
	}
	
}
