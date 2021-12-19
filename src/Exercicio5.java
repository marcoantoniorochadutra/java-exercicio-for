package Q1;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {

		int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor. "));
		String r = "Listagem de Valores \n\n";

		   int soma = 0;

			for (int i = 0; i<=valor; i += 1) {
				
				soma = soma + i;

		}

		JOptionPane.showMessageDialog(null, r + soma);
	}

}
