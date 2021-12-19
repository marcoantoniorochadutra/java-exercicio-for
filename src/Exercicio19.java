package Q2;

import javax.swing.JOptionPane;

public class Exercicio19 {

	public static void main(String[] args) {

		int idadeMaior = -1;
		int idadeMenor = -1;
		String nomeVelho = "";
		String nomeMenor = "";
		
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas são?"));

		for (int i = 0; i < quantidade; i++) {
			String nome = JOptionPane.showInputDialog((i + 1) + "º nome:");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade de " + nome));

			if (idade > idadeMaior) {
				idadeMaior = idade;
				nomeVelho = nome;
			} 
			
		}
		JOptionPane.showMessageDialog(null, "Nome do mais velho é " + nomeVelho + " a sua idade é " +idadeMaior);
	}
}