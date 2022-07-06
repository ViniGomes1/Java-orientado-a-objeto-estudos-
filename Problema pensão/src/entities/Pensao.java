package entities;

/*
 * Este pacote serve para o retorno dos dados nas variaveis 
 */
public class Pensao {
	private String name;
	private String email;
	private int room;
	
	
	public Pensao(String name, String email, int room) {
		this.name = name;
		this.email = email;
		this.room = room;
	}

	

	public Pensao(String name, String email) {
		this.name = name;
		this.email = email;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getRoom() {
		return room;
	}


	public void setRoom(int room) {
		this.room = room;
	}
	
	public String toString(){
		return name + " ," + email;
	}
	
	
}
