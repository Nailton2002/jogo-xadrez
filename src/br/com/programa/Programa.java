package br.com.programa;

import br.com.xadrez.PartidaXadrez;

public class Programa {

	public static void main(String[] args) {

		PartidaXadrez partidaXadrez = new PartidaXadrez();
		InterfaceUsuario.imprimindoTabuleiro(partidaXadrez.getPecas());
	}

}
