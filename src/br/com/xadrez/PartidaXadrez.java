package br.com.xadrez;

import java.util.Iterator;

import br.com.tabuleiro.Tabuleiro;

public class PartidaXadrez {

	private Tabuleiro tabuleiro;

	public PartidaXadrez() {
		// AQUI CRIARÁ UM TABULEIRO 8 POR 8
		tabuleiro = new Tabuleiro(8, 8);
	}

	public PecaXadrez[][] getPecas() {

		PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];

		for (int i = 0; i < tabuleiro.getLinhas(); i++) {
			for (int j = 0; j < tabuleiro.getColunas(); j++) {
				mat[i][j] = (PecaXadrez) tabuleiro.peca(i, j);
			}
		}
		return mat;
	}
}
