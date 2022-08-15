package br.senai.sp.jandira;

import java.util.Random;
import java.util.Scanner;

public class JokenPo {

	public static void main(String[] args) {

		// Reservas de Int que preciso
		int jogador, maquina, valorSorteado;

		/// pedra, papel, tesoura,

		// Ferramentas
		Random sorteio = new Random();
		Scanner leitor = new Scanner(System.in);

		valorSorteado = sorteio.nextInt(1, 4);

		// System.out.print(maquina);

		// Definindo as opções
		// pedra = 1;
		// papel = 2;
		// tesoura = 3;

		// Introdução do Jogo
		System.out.println("****************** JOKEN PO *****************");

		// O jogador escolhe as opções
		System.out.printf(" 1 = Pedra.\n 2 = Papel.\n 3 = Tesoura.\n");
		System.out.println();
		System.out.printf("Faça sua escolha (1-3) : ");

		// Aguarda a resposta do usuário para escolher.

		jogador = leitor.nextInt();

		// verificação

		// if (jogador < 0 || jogador > 3) {
		// System.out.println("Digite de 1 a 3!");
		// jogador = leitor.nextInt();
		// }

		// Gerar a escolha do computador.
		maquina = valorSorteado;

		System.out.println();
		// Empate

		// if(jogador == maquina) {
		// System.out.println("Você escolheu a mesma opção que o computador.");
		// System.out.println("EMPATE!");
		// }

		// Opções de pedra.
		if (jogador == 1) {
			System.out.println("Você escolheu pedra!");
			if (maquina == 1) {
				System.out.println(" A máquina escolheu pedra.");
				System.out.println("O jogo empatou.");
			}

			if (maquina == 2) {
				System.out.println("A máquina escolheu papel.");
				System.out.println("PERDEU!!");
			}
			if (maquina == 3) {
				System.out.println("A máquina escolheu tesoura.");
				System.out.println("VITÓRIA!!");

			}
		}
		// Opções de papel.
		if (jogador == 2) {
			System.out.println("Você escolheu papel.");
			if (maquina == 1) {
				System.out.println(" A máquina escolheu pedra.");
				System.out.println("VITÓRIA!!");
			}

			if (maquina == 2) {
				System.out.println("A máquina escolheu papel.");
				System.out.println("EMPATE!!");
			}
			if (maquina == 3) {
				System.out.println("A máquina escolheu tesoura.");
				System.out.println("PERDEU!!");
			}

		}

		// Opções de tesoura
		if (jogador == 3) {
			System.out.println("Você escolheu tesoura.");

			if (maquina == 1) {
				System.out.println(" A máquina escolheu pedra.");
				System.out.println("PERDEU!!");
			}
			if (maquina == 2) {
				System.out.println("A máquina escolheu papel.");
				System.out.println("VITÓRIA!!");
			}
			if (maquina == 3) {
				System.out.println("A máquina escolheu tesoura.");
				System.out.println("EMPATE!!");
			}
		}

	}

}
