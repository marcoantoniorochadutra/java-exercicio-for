package Q2;

import javax.swing.JOptionPane;

public class Exercicio13 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {



		int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor. "));
		String r = "Listagem de Médias \n\n";

		for (int i = 1; i <= valor; i++) {
			r = r + "1/" + i + "\n";



		}

		JOptionPane.showMessageDialog(null, r + "\n");

	}
}
