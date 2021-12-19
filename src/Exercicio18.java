package Q2;

import javax.swing.JOptionPane;

public class Exercicio18 {

	public static void main(String[] args) {

		int qt = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos são?"));
		String lista = "Segue a lista de alunos";
		String nome = "";
		String cidade = "";
		int idade = 0;
		int menor = 0;
		int tubarao = 0;
		int jaguaruna = 0;

		for (int i = 0; i < qt; i++) {
			nome = JOptionPane.showInputDialog("Qual o nome do aluno?"); {
				lista = lista + "\n" + nome + "\n";
			}
			
			cidade = JOptionPane.showInputDialog("Onde o aluno mora?").toUpperCase();
			{
				if (cidade.contains("TUB")) {
					tubarao = tubarao + 1;
					
				} else if (cidade.contains("JAG"))					
				jaguaruna = jaguaruna + 1;

			}
			idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do aluno?"));
			{
				if (idade < 17) {
					menor = menor + 1;
				}

			}

		}

		JOptionPane.showMessageDialog(null, lista +
				"Moram em Jagaruna: " + jaguaruna + " Pessoas \n"
				+ "Moram em Tubarão: " + tubarao + " Pessoas \n"
				+  menor + "são menores de idade");

	}

}
