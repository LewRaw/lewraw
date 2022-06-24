package br.com.aula.atividades;

import java.util.Scanner;

public class Atividade3 {
	
	//Colete a quantidade de alunos de uma turma
	//Colete o nome de cada um
	//Colete a média do aluno para cada trimestre de cada matéria, ou seja 4 notas para cada materia, para cada um dos 4 periodos do ano
	//As materias podem estar fixa no código fonte, não precisa seguir um padrão de quantidade de materias e nomes especificos para cada uma delas
	
	//Diga se o aluno está aprovado, reprovado ou em recuperação
	//Como funciona nossa metrica
	//Aprovado média >= 7
	//Recuperação média >= 6,25 e <= 6.99
	//Reprovado < 6,25
	
	//Você deve usar concatenação, variáveis String, int e double
	//deve usar if, swtich, array e looping for
	
	//concluindo a atividade subir ela para seu repositório do Git
	//cada Aluno poderá ter seu código analisado em uma call privada depois da aula (de forma randon)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de alunos na turma:");
		int QntAlunos = sc.nextInt();
		
		String[] arrayNomes = new String[QntAlunos];
		String[]arrayResultado = new String[5];
		for(int contador= 0 ; contador < QntAlunos; contador++){
			System.out.println("Digite o nome do aluno "+ contador + ":");
			arrayNomes[contador] = sc.next();
			int MateriaAtual = 0;
				for(int iMateria = 0; iMateria < 3; iMateria++) {
					
					String Materia = "";
					
						MateriaAtual += 1;
						double Notas = 0;
					
					for(int iTrimestre = 1; iTrimestre < 5; iTrimestre ++) {
						
						switch (MateriaAtual) {
						case 1:
							Materia = "Logica de Programação";
							break;
						case 2:
							Materia = "Banco de Dados";
							break;
						case 3:
							Materia = "Ciência da computação";
							break;
							
					}
						System.out.println("Digite sua média  no " + iTrimestre + "º trimeste, em " + Materia);
						double QNotas = sc.nextFloat();
						Notas += QNotas;
					}
					
					
					
					//Aprovado média >= 7
					//Recuperação média >= 6,25 e <= 6.99
					//Reprovado < 6,25
					
					double media = Notas / 4.00;
						if (media >= 7) {
							arrayResultado[MateriaAtual] = Materia + ": " + " Aprovado média";
						} 
							else if(media >= 6.25 && media <= 6.99 ){
								arrayResultado[MateriaAtual] = Materia + ": " + " Recuperação média";
							}
								else {
									arrayResultado[MateriaAtual] = Materia + ": " + " Reprovado";
								}
						
							
				}
				
				for(int iStatus = 1; iStatus < 4; iStatus ++) {							
					System.out.println(arrayResultado[iStatus]);								
				}
        }

	}

}
