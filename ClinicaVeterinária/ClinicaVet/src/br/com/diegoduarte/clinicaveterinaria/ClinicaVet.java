package br.com.diegoduarte.clinicaveterinaria;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ClinicaVet {
	private List<Animal> animais = new ArrayList<>();
	private List<Consulta> consultas = new ArrayList<>();
	
	public void cadastrarAnimal(Animal a) {
		animais.add(a);
	}
	
	public void agendarConsulta(Consulta c) {
		consultas.add(c);
	}
	
	public List<Animal> listarAnimais() {
		return animais;
	}
	
	public List<Consulta> listarConsultas() {
		return consultas;
	}
	
	public Consulta buscarConsulta(String animal) {
	    for (Consulta c : consultas) {
	        if (c.getAnimal().getNome().equalsIgnoreCase(animal)) {
	            return c;
	        }
	    }
	    throw new NoSuchElementException("Consulta não encontrada para o animal: " + animal);
	}
	
	public void realizarConsulta(String animal) {
	    for (Consulta c : consultas) {
	        if (c.getAnimal().getNome().equalsIgnoreCase(animal)) {
	            c.realizarConsulta();  
	            return;
	        }
	    }
	    throw new NoSuchElementException("Animal não encontrado para realização de consulta: " + animal);
	}

	
	public void cancelarConsulta(String animal) {
		for (Consulta c : consultas ) {
			if (c.getAnimal().getNome().equalsIgnoreCase(animal)) {
				c.cancelarConsulta();
				return;
			}
		} 
		throw new NoSuchElementException("Animal não encontrado para cancelação de consulta: " + animal);
	}
}
