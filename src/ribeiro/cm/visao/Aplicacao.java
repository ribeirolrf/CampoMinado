package ribeiro.cm.visao;

import ribeiro.cm.modelo.*;

public class Aplicacao {

	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(6,6,6);
		new TabuleiroConsole(tabuleiro);

	}

}
