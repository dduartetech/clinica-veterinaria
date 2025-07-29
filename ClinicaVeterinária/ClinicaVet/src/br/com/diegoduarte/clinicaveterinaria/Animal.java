package br.com.diegoduarte.clinicaveterinaria;

public class Animal {
	private String nome, especie;
	private int idade;
	private Pessoa dono;
	
	public Animal() {
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public Pessoa getDono() {
		return dono;
	}
	
	
	public void setDono(Pessoa dono) {
		this.dono = dono;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nDono: " + dono + "\nEspecie: " + especie + "\nIdade: " + idade;
	}
	
}
