package br.com.tabuleiro;

public class Peca {

	protected Posicao posicao;
	private Tabuleiro tabuleiro;

	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		// A PEÇA SERÁ INICIADO COMO NULA
	}

	// SÓ AS CLASSE E SUBCLASSE DO MESMO PACOTE IRÃO TER ACESSO AO TABULEIRO
	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	// NÃO TERÁ O SET DO TABULEIRO PARA QUE O MESMO NÃO SEJA ALTERADO
}
