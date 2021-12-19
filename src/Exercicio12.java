package Q2;

import javax.swing.JOptionPane;

public class Exercicio12 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas são?"));
		double soma = 0;
		double media = 0;

		for (int i = 0; i < quantidade; i++) {
			String nome = JOptionPane.showInputDialog((i + 1) + "º nome:");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));

			soma = soma + idade;
			media = soma / quantidade;
 
		}

		JOptionPane.showMessageDialog(null, "O total das idades são: " + soma + " e a media da soma delas é: " + media );

	}
}
