package Q1;

import javax.swing.JOptionPane;

public class Exercicio6 {


	public static void main(String[] args) {

		int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor. "));
		int f = 1;
		String r = "Listagem de Valores \n\n";

		for (int i = valor; i <= 10; i++) {
			f = f*i;
		}

			

		JOptionPane.showMessageDialog(null, r);
	}
}


