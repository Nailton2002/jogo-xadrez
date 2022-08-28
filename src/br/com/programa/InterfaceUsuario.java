package br.com.programa;

import br.com.xadrez.PecaXadrez;

public class InterfaceUsuario {

	public static void imprimindoTabuleiro(PecaXadrez[][] pecas) {
		for (int i = 0; i < pecas.length; i++) {
			System.out.print((8 - i) + " ");
			for (int j = 0; j < pecas.length; j++) {
				imprimindoPeca(pecas[i][j]);
			}
			// ESTE PRINTLN SERVE PARA A QUEBRA DE LINHA DAS PEÇAS
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}

	// METODO AUXILIAR PARA IMPRIMIR UMA PEÇA
	private static void imprimindoPeca(PecaXadrez peca) {
		if (peca == null) {
			System.out.print("-");
		} else {
			System.out.print(peca);
		}
		System.out.print(" ");
	}
}
