package Q1;

import javax.swing.JOptionPane;

public class Exercicio8 {

	public static void main(String[] args) {

		int potencia = 1;

		int x = Integer.parseInt(JOptionPane.showInputDialog("Qual a base?"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Qual a potência?"));

		for (int i = 1; i <= y; i++) {
			potencia = potencia * x;

		}
		JOptionPane.showMessageDialog(null, "Total: " + potencia);

	}
}
