package Q1;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {

		int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor. "));
		String r = "Listagem de Valores \n\n";

      for(int  i = valor; i>=0; i-=10) {
			r = r + i + "\n";

		}

		JOptionPane.showMessageDialog(null, r);
	}

}
