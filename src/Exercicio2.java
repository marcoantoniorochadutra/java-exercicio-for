package Q1;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {

		int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor. "));
		String r = "Listagem de Valores \n\n";

		for (int i = 0; i <= valor; i += 10) {
			r = r + i + "\n";

		}

		JOptionPane.showMessageDialog(null, r);
	}

}
