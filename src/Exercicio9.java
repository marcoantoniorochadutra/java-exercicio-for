package Q1;

import javax.swing.JOptionPane;

public class Exercicio9 {

	public static void main(String[] args) {

		String r = "Listagem de Valores \n\n";
		int f = 1;

		int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor. "));

		for (int i = 1; i <= valor; i++) {
			f = f * i;
		}

	}

}
