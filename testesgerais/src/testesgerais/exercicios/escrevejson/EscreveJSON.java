package testesgerais.exercicios.escrevejson;

public class EscreveJSON {
	private String nome;
	private int idade;
	private String email;
	
	public EscreveJSON(String nome, int idade, String email) {
		this.nome = nome;
		this.email = email;
		this.idade = idade;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

}
