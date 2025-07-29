package br.com.diegoduarte.clinicaveterinaria;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int op;
		ClinicaVet vet = new ClinicaVet();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("=== CLÍNICA VETERINÁRIA ===");
			System.out.println("1 - Cadastrar animal");
			System.out.println("2 - Listar animais");
			System.out.println("3 - Agendar consulta");
			System.out.println("4 - Listar consultas");
			System.out.println("5 - Realizar consulta");
			System.out.println("6 - Cancelar consulta");
			System.out.println("7 - Sair"); 
			System.out.print("Escolha: ");
			op = sc.nextInt();
			sc.nextLine();
			
			try {
				switch (op) {
				case 1 -> {
					Animal a = new Animal();
					Pessoa p = new Pessoa();
					System.out.println("=== CADASTRO DE ANIMAL ===");
					
					System.out.print("Espécie: ");
					a.setEspecie(sc.nextLine());
					
					System.out.print("Nome: ");
					a.setNome(sc.nextLine());
					
					System.out.print("Idade: ");
					a.setIdade(sc.nextInt());
					sc.nextLine();
					
					System.out.print("Dono: ");
					p.setNome(sc.nextLine());
					a.setDono(p);
					
					System.out.print("Telefone de " + p.getNome() + ": ");
					p.setTel(sc.nextLine());
					
					vet.cadastrarAnimal(a);
					System.out.println(a.getNome() + " foi cadastrado(a)! :D");
					
					break;
				}
				
				case 2 -> {
					System.out.println("=== ANIMAIS CADASTRADOS ===");
					for (Animal a : vet.listarAnimais()) {
						System.out.println(a);
						System.out.println("-------------");
					}
					break;
				}
				
				case 3 -> {
					System.out.println("--- AGENDAMENTO DE CONSULTA ---");
					System.out.print("Por favor, digite o nome do animal: ");
					String nome = sc.nextLine();
					
                    Animal animalEncontrado = null;
                    for (Animal a : vet.listarAnimais()) {
                        if (a.getNome().equalsIgnoreCase(nome)) {
                            animalEncontrado = a;
                        } 
                    }

                    if (animalEncontrado != null) {
                        Consulta consulta = new Consulta(animalEncontrado);
                        vet.agendarConsulta(consulta);
                        System.out.println("Consulta agendada para " + animalEncontrado.getNome() + " com sucesso!");
                    } else {
                        System.out.println("Animal não encontrado.");
                    }
                    break;
                }
				
				case 4 -> {
                    System.out.println("--- CONSULTAS AGENDADAS ---");
                    for (Consulta c : vet.listarConsultas()) {
                        System.out.println(c);
                        System.out.println("-------------");
                    }
                    break;
                }

                case 5 -> {
                    System.out.print("Digite o nome do animal para realização da consulta: ");
                    String animal = sc.nextLine();
                    vet.realizarConsulta(animal);
                    System.out.println("Consulta realizada com sucesso.");
                    break;
                }

                case 6 -> {
                    System.out.print("Digite o nome do animal para cancelação da consulta: ");
                    String animal = sc.nextLine();
                    vet.cancelarConsulta(animal);
                    System.out.println("Consulta cancelada com sucesso.");
                    break;
                }
                case 7 -> {
                    System.out.println("Encerrando o sistema...");
                    break;
                }

                default -> System.out.println("Opção inválida!");
            
				}
			} catch (Exception e) {
				System.out.println("ERRO! " + e.getMessage());
			}
			
		} while (op != 7);
		
		sc.close();

	}

}
