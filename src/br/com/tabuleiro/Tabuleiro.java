package br.com.tabuleiro;

//ESTA CLASSE RETORNARÁ UMA PEÇA
public class Tabuleiro {

	private int linhas;
	private int colunas;
	// UMA MATRIX DE PEÇAS
	private Peca[][] pecas;

	public Tabuleiro(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		// A MATRIX DE PEÇA SERÁ INSTANCIADO COM A QUANTIDADE DE LINHAS E COLUNAS
		// INFORMADAS PELO O USUÁRIO
		pecas = new Peca[linhas][colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public void setColunas(int colunas) {
		this.colunas = colunas;
	}

	public Peca peca(int linha, int coluna) {
		return pecas[linha][coluna];
	}

	// USANDO UMA SOBRECARGA DE METODO, AGORA RETORNA A PEÇA PELA POSIÇÃO
	public Peca peca(Posicao posicao) {
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}

}
