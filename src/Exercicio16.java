package Q2;

import javax.swing.JOptionPane;

public class Exercicio16 {

	public static void main(String[] args) {

		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas são?"));
		int M = 0;
		int F = 0;


		String r = "Listagem de nomes e sexo. \n\n";

		for (int i = 1; i <= quantidade; i++) {
			String nome = JOptionPane.showInputDialog("Nome");
			{
				r = r + nome + "\n";
			}
			char sexo = JOptionPane.showInputDialog("Qual seu Sexo? M/F").toUpperCase().charAt(0);
			{

				if (sexo == 'M') {
					M = M + 1;

				} else if (sexo == 'F') {
					F = F + 1;

				}
			}

		}
		JOptionPane.showMessageDialog(null, r + "Destas pessoas: " + M + " São homens e" + F + " São mulheres");

	}
}
