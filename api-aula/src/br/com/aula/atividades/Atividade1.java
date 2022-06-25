package br.com.aula.atividades;

import java.util.Scanner;

public class Atividade1 {
	// colete o nome do usuário
	// colete a idade de usuário
	// faça o sistema dizer "<nome_usuario>, menores de idade nao são permitidos"
	// faça o sistema dizer "<nome_usuario> Seja Bem Vindo!"

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		String nome = sc.next();

		System.out.println("Digite sua idade:");
		int idade = sc.nextInt();

		if (idade < 18) {
			String msgMenor = " menores de idade nao são permitidos";
			System.out.println(nome.concat(msgMenor));
		} else {
			String msgMaior = " Seja Bem Vindo";
			System.out.println(nome.concat(msgMaior));
		}

	}

}
