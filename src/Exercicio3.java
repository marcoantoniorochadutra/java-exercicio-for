package Q1;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {

		int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor. "));
		String r = "Listagem de Valores \n\n";

      for(int  i = valor; i>0; i-=2) {
			r = r + i + "\n";

		}

		JOptionPane.showMessageDialog(null, r);
	}

}
