package br.com.aula.atividades;

import java.util.Scanner;

//entrevista de emprego
//o sistema deve aceitar um numero N de canditatos
//caso o candidato não tenha nenhuma habilidade de progração conveniente para a empresa e não tenha vontade de aprender, o sistema não deve proseguir com perguntas

//o sistema deve perguntar, se o candidato sabe Java ou C++
//caso o candidato sabe ao menos uma dessas linguagens ele terá o titulo Programador Backend (na empresa X que utiliza apenas essas linguagens de back)

//o sistema deve pergunta, se o candidato sabe React ou Angular
//caso o candidato sabe ao menos uma dessas linguagens ele terá o titulo Programador Frontend (na empresa X que utiliza apenas essas linguagens de front)

//caso o candidato não tenha habilidade de programação mas queira aprender, ele terá o titulo de Aprediz de Desenvolvimento, então o sistema não continua com as demais peguntas

//se o candidato tiver o titulo de Programador Backend e Programador Frontend então ele deve ter o titulo de Programador Full Stack

//o sistema deve perguntar se o candidato se comunica bem com as pessoas
//caso o candidato se comunique bem e tenha o titulo de Full Stack, então ele deve ter o titulo de Tech Lead 

public class Atividade4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero de candidatos ");
		int qCandidatos = sc.nextInt();

		for (int iCandidatos = 0; iCandidatos < qCandidatos; iCandidatos++) {
			String titulo = "";

			boolean programadorBackEnd = false;
			boolean programadorFrontEnd = false;
			boolean aprendizDesenvolvimento = false;
			boolean programadorFullStack = false;
			boolean techLead = false;
			boolean reprovado = false;

			System.out.println("Olá candidato! ");
			System.out.println("Digite seu nome: ");
			String nome = sc.next();

			System.out.println("Digite o código referente ao seu conhecimento em BackEnd");
			System.out.println("			sabe Java? digite '1' ");
			System.out.println("			sabe C++ ? digite '2'");
			System.out.println("			sabe ambas? digite '3'");
			System.out.println("			nao sabe digite '4'");
			int conhecimentoBack = sc.nextInt();

			if (conhecimentoBack == 1 || conhecimentoBack == 2 || conhecimentoBack == 3) {
				titulo = "Programador BackEnd";
				programadorBackEnd = true;
			}

			System.out.println("Digite o código referente ao seu conhecimento em FrontEnd");
			System.out.println("			sabe React? digite '1' ");
			System.out.println("			sabe Angular ? digite '2'");
			System.out.println("			sabe ambas? digite '3'");
			System.out.println("			nao sabe digite '4'");
			int conhecimentoFront = sc.nextInt();

			if (conhecimentoFront != 4) {
				titulo = "Programador FrontEnd";
				programadorFrontEnd = true;
			}

			if (programadorBackEnd == false && programadorFrontEnd == false) {
				System.out.println("Você tem vontade de aprender?");
				System.out.println("			Sim? digite '1' ");
				System.out.println("			Não? digite '2' ");
				int vontadeAprender = sc.nextInt();

				if (vontadeAprender == 1) {
					titulo = "Aprendiz de Desenvolvimento";
					aprendizDesenvolvimento = true;
				} else {
					reprovado = true;
				}

			} else if (programadorBackEnd == true && programadorFrontEnd == true) {
				titulo = "Programador Full Stack";
				programadorFullStack = true;

				if (programadorFullStack == true) {
					System.out.println("Você se comunica bem com pessoas?");
					System.out.println("			Sim? digite '1' ");
					System.out.println("			Não? digite '2' ");
					int comunicacao = sc.nextInt();
					if (comunicacao == 1) {
						titulo = "Tech Lead";
						techLead = true;
					}
				}
			}
			if (reprovado == false) {
				System.out.println(nome + " Você recebeu o cargo de: " + titulo);
			} else
				System.out.println("Nao temos interesse em contrata-lo");
		}
	}
}