package taliBank;

public class Cliente {
	private String nome;
	private String cpf;
	private String endereco;
	private String dataNascimento;
	
	public Cliente(String nome, String cpf, String endereco, String dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getEndereco() {
		return endereco;
	}
}
