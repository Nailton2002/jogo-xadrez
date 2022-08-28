package br.com.xadrez;

import br.com.tabuleiro.Peca;
import br.com.tabuleiro.Tabuleiro;

//USANDO HERANÇA 
public class PecaXadrez extends Peca {

	private Cor cor;

	public PecaXadrez(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
		// PASSANDO A CHAMADA PARA O CONSTRUTOR DA SUPER CLASSE (PEÇA)
	}

	public Cor getCor() {
		return cor;
	}

	//NÃO VOU DEIXAR O METODO SET PORQUE NÃO QUERO QUE UMA COR SEJA ALTERADA
}
