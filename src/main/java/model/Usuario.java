package model;

public class Usuario {
	private String nome;
	private String senha;
	private String email;
	
	public Usuario(String nome, String senha, String email) {
		super();
		this.nome = nome;
		this.senha = senha;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getSenha() {
		return senha;
	}

	public String getEmail() {
		return email;
	}
	
		
}
