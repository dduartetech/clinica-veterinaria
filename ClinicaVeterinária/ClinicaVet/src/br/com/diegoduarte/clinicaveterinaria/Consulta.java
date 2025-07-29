package br.com.diegoduarte.clinicaveterinaria;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta implements Atendimento {
    private Animal animal;
    private String data, hora;
    private boolean realizada;

    public Consulta() {
		
	}

	public Consulta (Animal animal) {
        this.animal = animal;
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.data = agora.format(formatadorData);
        DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("HH:mm");
        this.hora = agora.format(formatadorHora);
        this.realizada = false;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public boolean isRealizada() {
        return realizada;
    }

    public void setRealizada(boolean realizada) {
        this.realizada = realizada;
    }

    @Override
    public void realizarConsulta() {
        this.realizada = true;
    }

    @Override
    public void cancelarConsulta() {
        this.realizada = false;
    }

	@Override
	public String toString() {
		return "Consulta: \nAnimal: " + animal + "\nData: " + data + "\nHora: " + hora + "\nRealizada: " + realizada;
	}

}
