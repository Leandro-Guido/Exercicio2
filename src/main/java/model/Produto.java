package model;

public class Produto{
	private String nome;
	private double preco;
	private int codigo;
	
	public Produto() {
		this.nome = "";
		this.preco = -1.0;
		this.codigo = -1;
	}
	
	public Produto(String nome, double preco, int codigo) {
		this.nome = nome;
		this.preco = preco;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", codigo=" + codigo + "]";
	}	
}
