package br.com.diegoduarte.clinicaveterinaria;

public class Pessoa {
	private String nome, tel;
	
	public Pessoa() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		if (tel == null || tel.length() != 11) {
			throw new IllegalArgumentException("Número digitado incorreto.");
		}
		this.tel = tel;
	}

	@Override
	public String toString() {
		return nome + "\nTelelfone: " + tel;
	}
	
}
